
package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.zoo.model.Animal;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Christian Bonifaz, Code Creator, DCCO-ESPE
 */
public class MongoManager {

    public static boolean create(Animal animal) {

        String uri = "mongodb+srv://bonifaz:bonifaz@cluster0.vleslwo.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        MongoDatabase dataBase = openConnectionToMongo(uri);
        Document dataOfAnimal = new Document().append("id", animal.getId()).append("descripción",animal.getDescription()).append("bornOnDate", animal.getBornOnDate()).append("gender", animal.getGender()).append("cage", animal.getCage()).append("numberOfBones",animal.getNumberOfBones()).append("vertebrate", animal.isVertebrate()).append("food", animal.getFoods());

        String collection = "Animal";
        MongoCollection<Document> mongoCollection = accessToCollections(dataBase, collection);
        insertOneData(dataOfAnimal, mongoCollection);
        return false;
    }

    //Abir conexión con mongoDB
    public static MongoDatabase openConnectionToMongo(String uri) {
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase dataBase = mongoClient.getDatabase("OOP");

        return dataBase;
    }

    public static MongoCollection<Document> accessToCollections(MongoDatabase dataBase, String collection) {
        MongoCollection<Document> mongoCollection = dataBase.getCollection(collection);
        return mongoCollection;
    }

    public static void insertOneData(Document data, MongoCollection<Document> mongoCollection) {
        mongoCollection.insertOne(data);
    }

    public static void insertMoreThanOneData(List<Document> listOfData, MongoCollection<Document> mongoCollection) {
        mongoCollection.insertMany(listOfData);
    }

  
}
