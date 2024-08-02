package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
/**
 *
 * @autor Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class MongoClientSingleton {
    private static final String URI = "mongodb+srv://bonifaz:bonifaz@cluster0.vleslwo.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static MongoClient mongoClient = null;

    private MongoClientSingleton() {
       
    }

    public static MongoClient getInstance() {
        if (mongoClient == null) {
            synchronized (MongoClientSingleton.class) {
                if (mongoClient == null) {
                    mongoClient = MongoClients.create(URI);
                }
            }
        }
        return mongoClient;
    }
}
