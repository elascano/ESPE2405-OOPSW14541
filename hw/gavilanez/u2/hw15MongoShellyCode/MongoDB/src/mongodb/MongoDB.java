/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mongodb;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class MongoDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MongoClient mongoClient = MongoClients.create("mongodb+srv://gavilanez:gavilanez@cluster0.ie6zmbv.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"); // Reemplaza con tu URI de MongoDB
        
        // Base de datos
        MongoDatabase database = mongoClient.getDatabase("oop");
        
        // Acceder a una colección
        MongoCollection<Document> collection = database.getCollection("students");

        // Insertar un documento en la colección
        Document document = new Document("id:", "L0040563")
                                .append("name", "Gavilanez K")
                                .append("male", true)
                                .append("siblings", 9);
        collection.insertOne(document);
        
        // Leer documentos de la colección
        for (Document doc : collection.find()) {
            System.out.println(doc.toJson());
        }
        
        // Cerrar la conexión
        mongoClient.close();
    }
}
