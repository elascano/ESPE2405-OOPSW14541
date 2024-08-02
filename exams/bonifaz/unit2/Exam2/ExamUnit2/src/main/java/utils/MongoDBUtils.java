package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @autor Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class MongoDBUtils {

    private static final String URI =  "mongodb+srv://bonifaz:bonifaz@cluster0.vleslwo.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "exam2";
    private static final String COLLECTION_NAME = "keyboards";
    private static MongoClient mongoClient;


    public static MongoDatabase getDatabase() {
            mongoClient = MongoClientSingleton.getInstance();
        return mongoClient.getDatabase(DATABASE_NAME);
    }

    public static List<Document> getAllKeyboard() {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);
        List<Document> documents = new ArrayList<>();

        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                documents.add(cursor.next());
            }
        }
        return documents;
    }

}