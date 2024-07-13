package ec.edu.espe.mongomanagermaven.view;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class MongoManagerMaven {

    public static void main(String[] args) {

        String uri = "mongodb+srv://ayuquina:ayuquina@cluster0.crwllgh.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        MongoDatabase dataBase = openConnectionToMongo(uri);

        String collection = "Students";
        MongoCollection<Document> mongoCollection = accessToCollections(dataBase, collection);

        System.out.println(mongoCollection);
//      editDocuments("name", "Rodrigo", "Santi", mongoCollection);

//      InsertManyData
//      List<Document> listOfData = new ArrayList<>();
//      listOfData.add(new Document().append("id","L00000099").append("name", "Danna").append("male",false).append("siblings",1));
//      listOfData.add(new Document().append("id","L00000022").append("name", "Jorge").append("male",true).append("siblings",3));
//        
//      insertMoreThanOneData(listOfData, mongoCollection);
//      InsertOneData  
//      Document data = new Document().append("id", "L00111188").append("name", "Pamela").append("male", false).append("siblings", 2);
//      insertOneData(data, mongoCollection);
    }

    //Abir conexión con mongoDB
    public static MongoDatabase openConnectionToMongo(String uri) {
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase dataBase = mongoClient.getDatabase("OOP");

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
