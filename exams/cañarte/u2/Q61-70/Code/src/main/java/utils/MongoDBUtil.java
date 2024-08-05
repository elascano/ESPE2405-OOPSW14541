package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
/**
 *
 * @author Saray Cañarte 
 */
/*public class MongoDBUtil {

    public static boolean create(Countries countries) {
        String uri = "mongodb+srv://canarte:canarte@cluster0.devwm9s.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase dataBase = openConnectionToMongo(mongoClient);
            Document Countries = new Document()
                .append("id", countries.getId())
                .append("name", countries.getName())
                .append("initialpbi", countries.getInitialPbi()
                .append("finalpbi", countries.getInitialPbi()
                .append("result", countries.getResult());

            String collection = "Countries";
            MongoCollection<Document> mongoCollection = accessToCollections(dataBase, collection);
            insertOneData(Countries, mongoCollection);
            return true; 
        } catch (Exception e) {
            e.printStackTrace();
            return false; 
        }
    }

    public static MongoDatabase openConnectionToMongo(MongoClient mongoClient) {
        return mongoClient.getDatabase("oop");
    }

    public static MongoCollection<Document> accessToCollections(MongoDatabase dataBase, String collection) {
        return dataBase.getCollection(collection);
    }

    public static void insertOneData(Document data, MongoCollection<Document> mongoCollection) {
        mongoCollection.insertOne(data);
    }
}*/