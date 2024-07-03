/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw15mongoshellandcode;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.Scanner;
/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class MongoDBExample {
    public static void main(String[] args) {
        // Reemplaza esto con tu URI de conexión de MongoDB Atlas
        String uri = "mongodb+srv://alexisviterigithub:ajviteri2@ajviteri2.y5pwei7.mongodb.net/";

        // Crear un cliente de MongoDB
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            // Seleccionar la base de datos
            MongoDatabase database = mongoClient.getDatabase("oop");

            // Seleccionar la colección
            MongoCollection<Document> collection = database.getCollection("student");

            // Crear un Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Leer los datos del usuario
            System.out.print("Id: ");
            String id = scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Male (True or False): ");
            boolean male = scanner.nextBoolean();

            System.out.print("Siblings: ");
            int sibling = scanner.nextInt();

            // Crear un documento
            Document student = new Document("id", id)
                                    .append("name", name)
                                    .append("male", male)
                                    .append("sibling", sibling);

            collection.insertOne(student);

            System.out.println("Document is update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}