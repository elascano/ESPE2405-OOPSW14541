package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.zoogui.model.Animal;
import org.bson.Document;

public class MongoDBUtil {

    public static boolean create(Animal animal) {
        String uri = "mongodb+srv://canarte:canarte@cluster0.devwm9s.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase dataBase = openConnectionToMongo(mongoClient);
            Document dataOfAnimal = new Document()
                .append("id", animal.getId())
                .append("description", animal.getDescription())
                .append("bornOnDate", animal.getBornOnDate())
                .append("gender", animal.getGender())
                .append("cage", animal.getCage())
                .append("numberOfBones", animal.getNumberOfBones())
                .append("vertebrate", animal.isVertebrate())
                .append("food", animal.getFood());

            String collection = "Animal";
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

