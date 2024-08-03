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
        // Create a MongoDB client
        try (MongoClient mongoClient = MongoClients.create(CONNECTION_STRING)) {
            // Get the database
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            
            // Get the collection
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);
            
            // Create a document with the data
            Document document = new Document("speed", speedText)
                                    .append("time", timeText)
                                    .append("distance", distanceValue);
            
            // Insert the document into the collection
            collection.insertOne(document);
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }
}
