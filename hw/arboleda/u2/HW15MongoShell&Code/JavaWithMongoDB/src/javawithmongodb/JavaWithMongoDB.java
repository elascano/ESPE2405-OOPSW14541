package javawithmongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */

public class JavaWithMongoDB {

    private static MongoCollection<Document> collection;

    public static void main(String[] args) {
        // URI proporcionada
        String uri = "mongodb+srv://adarboleda:adarboleda@cluster0.es09omc.mongodb.net/";

        // Crear un cliente MongoDB
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        // Conectar a la base de datos "test" (puedes cambiar el nombre de la base de datos si es necesario)
        MongoDatabase database = mongoClient.getDatabase("oop");

        // Obtener una colección (puedes cambiar el nombre de la colección si es necesario)
        collection = database.getCollection("students");

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert Document");
            System.out.println("2. Read Documents");
            System.out.println("3. Update Document");
            System.out.println("4. Delete Document");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Is male? (true/false): ");
                    boolean male = scanner.nextBoolean();
                    System.out.print("Enter number of siblings: ");
                    int siblings = scanner.nextInt();
                    insertDocument(id, name, male, siblings);
                    break;
                case 2:
                    readDocuments();
                    break;
                case 3:
                    System.out.print("Enter ID of document to update: ");
                    String editId = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    updateDocument(editId, newName);
                    break;
                case 4:
                    System.out.print("Enter ID of document to delete: ");
                    String deleteId = scanner.nextLine();
                    deleteDocument(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);

        // Close the scanner
        scanner.close();

        // Close the client
        mongoClient.close();
    }

    // Method to insert a document with the specified structure
    public static void insertDocument(String id, String name, boolean male, int siblings) {
        Document document = new Document("id", id)
                .append("name", name)
                .append("male", male)
                .append("siblings", siblings);
        collection.insertOne(document);
        System.out.println("Document inserted: " + document.toJson());
    }

    // Method to read documents
    public static void readDocuments() {
        for (Document doc : collection.find()) {
            System.out.println(doc.toJson());
        }
    }

    // Method to update a document
    public static void updateDocument(String id, String newName) {
        collection.updateOne(Filters.eq("id", id), Updates.set("name", newName));
        System.out.println("Document with ID " + id + " has been updated.");
    }

    // Method to delete a document
    public static void deleteDocument(String id) {
        collection.deleteOne(Filters.eq("id", id));
        System.out.println("Document with ID " + id + " has been deleted.");
    }
}
