/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author G406
 */
public class MongoDB {

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    /*private MongoDBConnection() {
    }

    public static synchronized MongoDatabase getDatabase() {
        if (database == null) {
            String uri = "mongodb+srv://villagomez:villagomez@cluster0.hdylr9r.mongodb.net/";
            mongoClient = MongoClients.create(uri);
            database = mongoClient.getDatabase(
        
        "poo);
        }
        return database;
    }

    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
            database = null;
        }
    }*/
}
