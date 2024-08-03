package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.zoo.model.Animal;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */
public class MongoManager {

    public static boolean create(Animal animal) {

        String uri = "mongodb+srv://rodriguez:rodriguez@cluster0.0otfs2m.mongodb.net/";

        MongoDatabase dataBase = openConnectionToMongo(uri);
        Document dataOfAnimal = new Document().append("id", animal.getId()).append("descripción",animal.getDescription()).append("bornOnDate", animal.getBornOnDate()).append("gender", animal.getGender()).append("cage", animal.getCage()).append("numberOfBones",animal.getNumberOfBones()).append("vertebrate", animal.isVertebrate()).append("food", animal.getFoods());

        String collection = "animal";
        MongoCollection<Document> mongoCollection = accessToCollections(dataBase, collection);
        insertOneData(dataOfAnimal, mongoCollection);
        return false;
    }

    //Abir conexión con mongoDB
    public static MongoDatabase openConnectionToMongo(String uri) {
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase dataBase = mongoClient.getDatabase("oop");

        return dataBase;
    }

    //Acceso a colecciones
    public static MongoCollection<Document> accessToCollections(MongoDatabase dataBase, String collection) {
        MongoCollection<Document> mongoCollection = dataBase.getCollection(collection);
        return mongoCollection;
    }

    //Tipo de ingreso de datos
    public static void insertOneData(Document data, MongoCollection<Document> mongoCollection) {
        mongoCollection.insertOne(data);
    }

    public static void insertMoreThanOneData(List<Document> listOfData, MongoCollection<Document> mongoCollection) {
        mongoCollection.insertMany(listOfData);
    }

    //Obtención de datos
    public static void getAllCollection(MongoCollection<Document> mongoCollection) {
        //Si solo busco en base a un solo dato 
        Document findDocument = new Document("male", true);
        //Si quiero todo el documento:
        //Document findDocument = new Document();

        MongoCursor<Document> resultDocument = mongoCollection.find(findDocument).iterator();
        
        System.out.println("***************************************");
        System.out.println("People male");
        System.out.println("***************************************");
        while (resultDocument.hasNext()) {
            System.out.println(resultDocument.next().getString("name"));
        }
        
        //return resultDocument;
    }
    
    //Actualización de documentos
    public static void editDocuments(String key, String data,String newData, MongoCollection<Document> mongoCollection){
        Document findDocument = new Document(key,data);
        
        Document updateDocument = new Document("$set",new Document(key,newData));
        
        mongoCollection.findOneAndUpdate(findDocument, updateDocument);
    }
    
    
    //Eliminar documentos
    public static void deleteDocuments(String key, String data, MongoCollection<Document> mongoCollection){
        //TODO: Combinar con método de obtención de datos
        Document findDocument = new Document("male", true);
        mongoCollection.findOneAndDelete(findDocument);
    }
}
