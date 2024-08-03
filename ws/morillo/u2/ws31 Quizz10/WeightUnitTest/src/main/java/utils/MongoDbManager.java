/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.weightunittest.model.Weight;
import org.bson.Document;



/**
 *
 * @author ASUS
 */
public class MongoDbManager {
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static MongoCollection<Document> collection;

    static {
        // Conectar a MongoDB Atlas utilizando el URI de conexión
        MongoClientURI uri = new MongoClientURI("mongodb+srv://damorillo3:damorillo3@cluster0.f4bek4r.mongodb.net/?retryWrites=true&w=majority");
        mongoClient = new MongoClient(uri);
        database = mongoClient.getDatabase("Weight");
        collection = database.getCollection("CalculateWeight");
    }

    public static void create(Weight weight) {
        Document document = new Document("mass", weight.getMass()).append("gravity", weight.getGravity()).append("weight", weight.getWeight());
        collection.insertOne(document);
    }
}
