package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
/**
 *
 * @author Saray Canarte, Code Creators, DCCO-ESPE
 */
public class MongoClientSingleton {
    private static final String URI = "mongodb+srv://abnerarboleda:adarboleda@cluster0.g1ipbq9.mongodb.net/";
    private static MongoClient mongoClient = null;

    private MongoClientSingleton() {
        // private constructor to prevent instantiation
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

    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}
