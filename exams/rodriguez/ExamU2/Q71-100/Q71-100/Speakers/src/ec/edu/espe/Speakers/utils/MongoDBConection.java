package ec.edu.espe.Speakers.utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Author: David Rodriguez
 */
public class MongoDBConection {

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public MongoDBConection(String collections) {
        connect(collections);
    }

    private void connect(String collections) {
        String uri = "mongodb+srv://rodriguez:rodriguez@cluster0.0otfs2m.mongodb.net/";
        
        try {
            MongoClientURI connectionString = new MongoClientURI(uri);
            mongoClient = new MongoClient(connectionString);
            database = mongoClient.getDatabase("oop"); 
            collection = database.getCollection(collections);
            System.out.println("Connected to MongoDB and collection obtained: " + collections);
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e);
        }
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public MongoCollection<Document> getCollection() {
        return collection;
    }
}
