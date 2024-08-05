package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.examnunit2.model.Computer;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @authors Saray Canarte, Christian Bonifaz, Andres Cedeno. Code Creators,
 * DCCO-ESPE
 */
public class MongoDBUtils {

    private static final String DATABASE_NAME = "exam_unit_2";

    public static MongoDatabase getDatabase() {
        MongoClient mongoClient = MongoClientSingleton.getInstance();
        return mongoClient.getDatabase(DATABASE_NAME);
    }

    public static void saveComputer(Computer computer) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection("Computers");

        Document document = new Document("id", computer.getId())
                .append("name", computer.getName())
                .append("processorSpeed", computer.getProcessorSpeed())
                .append("ramSize", computer.getRamSize());

        collection.insertOne(document);
    }

    public static List<Document> getAllComputers() {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection("Computers");
        List<Document> documents = new ArrayList<>();

        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                documents.add(cursor.next());
            }
        }

        return documents;
    }

    public static boolean validateUser(String username, String password) {
        boolean isValid = false;

        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection("Computers");
        Document user = collection.find(eq("user", username)).first();
        if (user != null) {
            String storedPassword = user.getString("password");
            if (storedPassword.equals(password)) {
                isValid = true;
            }
        }
        return isValid;
    }

    public static boolean updateComputer(String oldId, String newId, String name, double newProcessorSpeed, int newRamSize) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection("Computers");
        Document user = collection.find(eq("id", oldId)).first();
        if (user != null) {
            collection.updateOne(eq("id", oldId), Updates.combine(
                    Updates.set("id", newId),
                    Updates.set("processorSpeed", newProcessorSpeed),
                    Updates.set("ramSize", newRamSize)
            ));
            return true;
        }
        return false;
    }

    public static boolean verificationIdComputer(int id) {
        boolean verification = false;
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection("Computers");
        Document user = collection.find(eq("id", id)).first();
        if (user == null) {
            verification = true;
        }
        return verification;
    }

    public static boolean deleteComputerById(String id) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection("Computers");
        DeleteResult result = collection.deleteOne(eq("id", id));
        return result.getDeletedCount() > 0;
    }

    public static Document getComputerById(String id) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection("Computers");
        return collection.find(eq("id", id)).first();
    }

    public static void updateComputer(Document updateComputer) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection("Computers");
        collection.replaceOne(eq("id", updateComputer.getString("id")), updateComputer);
    }

    public static List<Document> getAllCollection(MongoCollection<Document> mongoCollection) {

        //Si quiero todo el documento:
        List<Document> documents = mongoCollection.find().into(new ArrayList<>());

        return documents;
    }
    public static MongoDatabase openConnectionToMongo() {
        String uri = "mongodb+srv://abnerarboleda:adarboleda@cluster0.g1ipbq9.mongodb.net/";
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase dataBase = mongoClient.getDatabase("exam_unit_2");

        return dataBase;
    }
    
    public static void closeConnectionToMongo() {
        String uri = "mongodb+srv://abnerarboleda:adarboleda@cluster0.g1ipbq9.mongodb.net/";
        MongoClient mongoClient = MongoClients.create(uri);
        mongoClient.close();

    }

    //Acceso a colecciones
    public static MongoCollection<Document> accessToCollections(MongoDatabase dataBase, String collection) {
        MongoCollection<Document> mongoCollection = dataBase.getCollection(collection);
        return mongoCollection;
    }
    private static MongoClient mongoClient;
    
    // Método para acceder a una colección específica
    public static MongoCollection<Document> accessToCollections(String databaseName, String collectionName) {
        MongoDatabase database = accessToDatabase(databaseName);
        return database.getCollection(collectionName);
    }
    public static MongoDatabase accessToDatabase(String databaseName) {
        
        if (mongoClient == null) {
            // Usa tu propia URI de MongoDB
            String connectionString = "mongodb+srv://logiclegion:logiclegion123@cluster0.pkfbgix.mongodb.net/";
            mongoClient = MongoClients.create(connectionString);
        }
        return mongoClient.getDatabase(databaseName);
    }
}
