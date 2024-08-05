package mongomanager;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoManager {

    public static void main(String[] args) {
        //Abir conexión con mongoDB
        String uri = "mongodb+srv://ayuquina:ayuquina@cluster0.crwllgh.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        MongoDatabase dataBase = openConnectionToMongo(uri);

        //Acceso a colecciones
        String collection = "Students";
        MongoCollection<Document> mongoCollection = accessToCollections(dataBase,collection);

        System.out.println(mongoCollection);

        Document data = new Document().append("id", "L00111188").append("name", "Rodrigo").append("male", true).append("siblings", 0);
        
        insertData(data, mongoCollection);
        

    }

    public static MongoDatabase openConnectionToMongo(String uri) {
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase dataBase = mongoClient.getDatabase("OOP");

        return dataBase;
    }
    
    public static MongoCollection<Document> accessToCollections(MongoDatabase dataBase, String collection){
        MongoCollection<Document> mongoCollection = dataBase.getCollection(collection);
        
        return mongoCollection;
    }
    
    public static void insertData(Document data, MongoCollection<Document> mongoCollection){
        mongoCollection.insertOne(data);
    }

}
