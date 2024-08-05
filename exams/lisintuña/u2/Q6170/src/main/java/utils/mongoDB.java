/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.model.Park;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author DELL
 */
public class mongoDB {
    // Método estático para crear un usuario en la base de datos MongoDB
    public static boolean createPark(Park area) {
        // URI de conexión a MongoDB
        String uri = "mongodb+srv://mateolisintuna:CristianMateo@cluster0.vhefvyu.mongodb.net/";

        // Abre una conexión a la base de datos MongoDB
        MongoDatabase dataBase = openConnectionToMongo(uri);

        // Crea un documento con los datos del usuario
        //Document dataOfUser = new Document().append("Radio", area.getRadio().append("Area",area.getArea()));
        
        Document dataOfUser = new Document().append("Id", area.getId()).append("Name", area.getName()).append("Value",area.getValue());

        
        // Nombre de la colección donde se almacenarán los datos del usuario
        String collection = "parks";

        // Accede a la colección especificada en la base de datos
        MongoCollection<Document> mongoCollection = accessToCollections(dataBase, collection);

        // Inserta el documento en la colección
        insertOneData(dataOfUser, mongoCollection);

        // Devuelve falso indicando que la operación no tuvo éxito (posiblemente un error)
        return false;
    }
    
        public static List<Document> getMenuInformation() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://mateolisintuna:CristianMateo@cluster0.vhefvyu.mongodb.net/");
        List<Document> documents = new ArrayList<>();
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("OOP");

            MongoCollection<Document> collection = database.getCollection("parks");

            FindIterable<Document> iterable = collection.find();
            for (Document doc : iterable) {
                documents.add(doc);
            }

        }
        return documents;
    }
    
    
    
    ///metodos necesarios
    ///
    ///
    ///
    ///
    ///
    

        //Abir conexión con mongoDB
    public static MongoDatabase openConnectionToMongo(String uri) {
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase dataBase = mongoClient.getDatabase("OOP");
        

        return dataBase;
    }
    
    //lee la base de datos
    public static MongoCollection<org.bson.Document> accessToCollections(MongoDatabase dataBase, String collection) {
        MongoCollection<org.bson.Document> mongoCollection = dataBase.getCollection(collection);
        return mongoCollection;
    }
    
        //Tipo de ingreso de datos
    public static void insertOneData(org.bson.Document data, MongoCollection<org.bson.Document> mongoCollection) {
        mongoCollection.insertOne(data);
    }
    
    //public static void insertMoreThanOneData(List<org.bson.Document> listOfData, MongoCollection<org.bson.Document> mongoCollection) {
     //   mongoCollection.insertMany(listOfData);
    //}
}
