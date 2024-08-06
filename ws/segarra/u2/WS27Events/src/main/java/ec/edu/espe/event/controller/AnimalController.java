/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.event.controller;

import ec.edu.espe.event.model.Animal;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class AnimalController {
    
    public static boolean create(Animal animal){
        // Conect to MongoDB   
        MongoClientURI uri = new MongoClientURI("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");
        MongoClient mongoClient = new MongoClient(uri);

        // Obtain the data
        MongoDatabase database = mongoClient.getDatabase("oop");

        // Obtain the collection
        MongoCollection<Document> collection = database.getCollection("Animals");

        // Converting the object into a JSON and then into a BSON document
        Gson gson = new Gson();
        String json = gson.toJson(animal);
        Document studentDocument = Document.parse(json);

        // Insert the document in the collection
        collection.insertOne(studentDocument);

        // Close the conection
        mongoClient.close();
        
        return true;
    }
    
}
