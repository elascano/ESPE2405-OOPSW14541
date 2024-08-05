/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.Date;
import org.bson.Document;
import java.util.Scanner;
import model.Animal;
/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class DataBase {
    public void sendInDataBase(Animal animal) {
        // Reemplaza esto con tu URI de conexión de MongoDB Atlas
        String uri = "mongodb+srv://alexisviterigithub:ajviteri2@ajviteri2.y5pwei7.mongodb.net/";

        // Crear un cliente de MongoDB
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            // Seleccionar la base de datos
            MongoDatabase database = mongoClient.getDatabase("oop");

            // Seleccionar la colección
            MongoCollection<Document> collection = database.getCollection("student");
            // Crear un documento
            int id=animal.getId();
            String description=animal.getDescription();
            Date bornOnDate=animal.getBornOnDate();
            String gender=animal.getGender();
            String cage=animal.getCage();
            boolean vertebrate=animal.isVertebrate();
            int numberOfBones=animal.getNumberOfBones();
            ArrayList<String> food=animal.getFood();
            Document student = new Document("id", id)
                                    .append("description", description)
                                    .append("bornOnDate", bornOnDate)
                                    .append("gender", gender)
                                    .append("cage", cage)
                                    .append("vertebrate", vertebrate)
                                    .append("numberOfBones", numberOfBones)
                                    .append("food", food);

            collection.insertOne(student);

            System.out.println("Document is update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}