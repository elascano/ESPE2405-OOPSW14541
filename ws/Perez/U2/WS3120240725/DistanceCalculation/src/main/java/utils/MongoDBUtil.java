package utils;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
/**
 *
 * @author Carlos Perez, The Javas, DCCO-ESPE
 */

public class MongoDBUtil {

    private static final String CONNECTION_STRING = "mongodb+srv://carlosp:carlosp@cluster0.qouhg0b.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "oop";
    private static final String COLLECTION_NAME = "distance";

    public static void saveDistanceData(String speedText, String timeText, float distanceValue) {
        try (MongoClient mongoClient = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

            Document document = new Document("speed", speedText)
                                    .append("time", timeText)
                                    .append("distance", distanceValue);

            collection.insertOne(document);
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }
}


