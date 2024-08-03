/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package utils;

import ec.edu.espe.geometricfigurescalculator.model.Cylinder;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Volumen of a Cilinder - Doménica Villagómez, Alexis Viteri
 */
public class DataBase {
    
    public void sendInDataBase(Cylinder cylinder) {
        // Reemplaza esto con tu URI de conexión de MongoDB Atlas
        String uri = "mongodb+srv://alexisviterigithub:ajviteri2@ajviteri2.y5pwei7.mongodb.net/";

        // Crear un cliente de MongoDB
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            // Seleccionar la base de datos
            MongoDatabase database = mongoClient.getDatabase("oop");

            // Seleccionar la colección
            MongoCollection<org.bson.Document> collection = database.getCollection("cylinders");
            // Crear un documento
            double radius = cylinder.getRadius();
            double height = cylinder.getHeight();
            double volume = cylinder.getVolume();
            
            Document cylinders = new Document("radius", radius)
                                    .append("height", height)
                                    .append("volume", volume);

            collection.insertOne(cylinders);

            System.out.println("Document is update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
