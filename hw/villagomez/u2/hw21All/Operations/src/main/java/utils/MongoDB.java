package utils;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import java.util.List;
import java.util.ArrayList;
import model.Cat;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class MongoDB {

    private static final String URI = "mongodb+srv://villagomez:villagomez@cluster0.hdylr9r.mongodb.net/";
    private static final String DATABASE_NAME = "oop";
    private static final String COLLECTION_NAME = "Cats";

    public static boolean sendInDataBase(Cat cat) {
        try (MongoClient mongoClient = MongoClients.create(URI)) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

            Document catDocument = new Document()
                    .append("id", cat.getId())
                    .append("name", cat.getName())
                    .append("breed", cat.getBreed())
                    .append("age", cat.getAge())
                    .append("appStatus", cat.isAppStatus());

            collection.insertOne(catDocument);
            System.out.println("Información subida a la base de datos correctamente");
            return true;
        } catch (MongoException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deleteCatByName(String name) {
        try (MongoClient mongoClient = MongoClients.create(URI)) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

            Document filter = new Document("name", name);
            DeleteResult result = collection.deleteOne(filter);
            return result.getDeletedCount() > 0;
        } catch (MongoException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<Cat> getCats() {
        List<Cat> cats = new ArrayList<>();
        try (MongoClient mongoClient = MongoClients.create(URI)) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

            try (MongoCursor<Document> cursor = collection.find().iterator()) {
                while (cursor.hasNext()) {
                    Document doc = cursor.next();
                    Cat cat = new Cat(
                            doc.getString("name"),
                            doc.getString("breed"),
                            doc.getInteger("age")
                    );
                    cat.setId(doc.getString("id"));
                    cats.add(cat);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cats;
    }

    public static boolean deleteCatById(String id) {
        try (MongoClient mongoClient = MongoClients.create(URI)) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

            Document filter = new Document("id", id);
            DeleteResult result = collection.deleteOne(filter);
            return result.getDeletedCount() > 0;
        } catch (MongoException e) {
            e.printStackTrace();
            return false;
        }
    }

}
