package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.quizz.model.Cylinder;
import org.bson.Document;
/**
 *
 * @author Saray Cañarte & Christian Bonifaz
 */
public class MongoDBUtil {

    public static boolean create(Cylinder cylinder) {
        String uri = "mongodb+srv://canarte:canarte@cluster0.devwm9s.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase dataBase = openConnectionToMongo(mongoClient);
            Document dataOfAnimal = new Document()
                .append("radio", cylinder.getRadio())
                .append("height", cylinder.getHeight())
                .append("area", cylinder.getArea());

            String collection = "Cylinder Area";
            MongoCollection<Document> mongoCollection = accessToCollections(dataBase, collection);
            insertOneData(dataOfAnimal, mongoCollection);
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
}

