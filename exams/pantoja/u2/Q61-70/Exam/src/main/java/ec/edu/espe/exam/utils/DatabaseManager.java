package ec.edu.espe.exam.utils;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import static com.mongodb.client.model.Filters.eq;

/**
 *
 * @author David Pantoja
 */
public class DatabaseManager {

    public static MongoDatabase connectToDatabase(String uri, String dataBase) {
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase mongoDatabase = mongoClient.getDatabase(dataBase);
        System.out.println("-> Connected successfully to server " + dataBase);
        return mongoDatabase;
    }

    public static MongoCollection connectToCollection(MongoDatabase database, String collection) {
        MongoCollection<Document> mongoCollection = database.getCollection(collection);
        return mongoCollection;
    }

    public static boolean deleteProfessor(MongoCollection<Document> collection, int professorId) {
        if (existsDocument(collection, "id", professorId)) {
            Bson query = Filters.eq("id", professorId);
            collection.deleteOne(query);
            System.out.println("-> Professor deleted successfully");
            return true;
        } else {
            System.out.println("-> Professor deletion failed - Professor not found");
            return false;
        }
    }

    public static boolean insertDocument(MongoCollection collection, HashMap<Object, Object> map) {
        Object documentId = map.get("id");
        if (!existsDocument(collection, "id", (int) documentId)) {
            Document document = createDocument(map);
            try {
                collection.insertOne(document);
                System.out.println("-> Inserted successfully");
                return true;
            } catch (Exception e) {
                System.out.println("-> Insertion failed");
                return false;
            }
        } else {
            System.out.println("-> Insertion failed");
            return false;
        }
    }

    private static Document createDocument(HashMap<Object, Object> map) {
        Document document = new Document();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            document.append(entry.getKey().toString(), entry.getValue());
        }
        return document;
    }

    public static ArrayList<Object> getFieldValues(MongoCollection<Document> collection, String field) {
        ArrayList<Object> readedValues = new ArrayList<>();
        if (existsField(collection, field)) {
            try (MongoCursor<Document> cursor = collection.find().iterator()) {
                while (cursor.hasNext()) {
                    Document document = cursor.next();
                    readedValues.add(document.get(field));
                }
            }
        }
        return readedValues;
    }

    public static boolean updateDocument(MongoCollection<Document> collection, String searchField, Object searchValue, String targetField, Object newValue) {
        if (existsDocument(collection, searchField, searchValue)) {
            Document document = new Document(searchField, searchValue);
            Bson update = Updates.set(targetField, newValue);
            collection.updateOne(document, update);
            System.out.println("-> Updated succesfully");
            return true;
        } else {
            System.out.println("-> Updated failed");
            return false;
        }
    }

    public static boolean deleteDocument(MongoCollection<Document> collection, String searchField, Object searchValue) {
        if (existsDocument(collection, searchField, searchValue)) {
            Bson query = Filters.eq(searchField, searchValue);
            collection.deleteOne(query);
            System.out.println("-> Deleted successfully");
            return true;
        } else {
            System.out.println("-> Deleted failed");
            return false;
        }
    }

    public static Object getDocumentValue(MongoCollection<Document> collection, String searchField, Object searchValue, String targetField) {
        if (existsDocument(collection, searchField, searchValue)) {
            Document query = new Document(searchField, searchValue);
            Document document = collection.find(query).first();
            Object value = document.get(targetField);
            return value;
        } else {
            return null;
        }
    }

    public static boolean existsDocument(MongoCollection collection, String field, Object value) {
        Document query = new Document(field, value);
        FindIterable<Document> documents = collection.find(query);
        return documents.first() != null;
    }

    public static boolean existsProfessorById(MongoCollection<Document> collection, int professorId) {
        Bson filter = eq("id", professorId);
        return collection.find(filter).limit(1).iterator().hasNext();
    }

    public static boolean existsField(MongoCollection<Document> collection, String field) {
        // Obtenemos un documento de la colección como ejemplo
        Document sampleDoc = collection.find().first();
        // Verificamos si el documento es null y si contiene la clave dada
        return sampleDoc != null && sampleDoc.containsKey(field);
    }

    public static Document search(MongoCollection<Document> collection, int id) {
        Bson filter = Filters.eq("id", id);
        Document foundDocument = collection.find(filter).first();

        return foundDocument;
    }

    public static HashMap<Object, Object> obtain(MongoCollection<Document> collection, int id) {
        Document obtainedDocument = search(collection, id);
        HashMap<Object, Object> obtained = new HashMap<>();

        if (obtainedDocument != null) {
            obtained = convertDocumentStringIntoKeyValues(obtainedDocument.toString());
        }
        return obtained;
    }

    public static ArrayList<HashMap<Object, Object>> obtainAll(MongoCollection<Document> collection) {
        MongoCursor<Document> cursor = collection.find().iterator();
        ArrayList<HashMap<Object, Object>> allObtained = new ArrayList<>();
        HashMap<Object, Object> obtained = new HashMap<>();

        while (cursor.hasNext()) {
            Document obtainedDocument = cursor.next();
            if (obtainedDocument != null) {
                obtained = convertDocumentStringIntoKeyValues(obtainedDocument.toString());
                allObtained.add(obtained);
            }
        }

        return allObtained;
    }

    public static HashMap<Object, Object> convertDocumentStringIntoKeyValues(String documentString) {
        HashMap<Object, Object> converted = new HashMap<>();
        String[] keyValues = documentString.split(", ");

        for (int i = 1; i < keyValues.length; i++) {

            int separator = keyValues[i].indexOf("=");
            String key = keyValues[i].substring(0, separator);
            String value;
            if (i < keyValues.length - 1) {
                value = keyValues[i].substring(separator + 1, keyValues[i].length());
            } else {
                value = keyValues[i].substring(separator + 1, keyValues[i].length() - 2);
            }
            System.out.println("KEY:" + key + "\n VALUE:" + value);
            converted.put(key, value);

        }
        return converted;
    }

    public static boolean insertDocument(MongoCollection<Document> collection, Document document) {
        if (!existsDocument(collection, document)) {
            try {
                collection.insertOne(document);
                System.out.println("-> Inserted successfully");
                return true;
            } catch (Exception e) {
                System.out.println("-> Insertion failed");
                return false;
            }
        } else {
            System.out.println("-> Insertion failed");
            return false;
        }
    }

    public static boolean existsDocument(MongoCollection<Document> collection, Document document) {
        FindIterable<Document> documents = collection.find(document);
        return documents.first() != null;
    }
}
