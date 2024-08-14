/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javawhithmongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Jenniffer Marquez, JavaSquad, DCCO-ESPE
 */
public class JavaWithMongoDB {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Connect to MongoDB
        MongoClient mongoClient = MongoClients.create("mongodb+srv://Jenni:Jenni@cluster0.tjpvdfr.mongodb.net/");
        MongoDatabase database = mongoClient.getDatabase("oop");
        MongoCollection<Document> collection = database.getCollection("students");
        
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Insert a document");
            System.out.println("2. Edit a document");
            System.out.println("3. Delete a document");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    insertDocument(scanner, collection);
                    break;
                case 2:
                    updateDocument(scanner, collection);
                    break;
                case 3:
                    deleteDocument(scanner, collection);
                    break;
                case 4:
                    mongoClient.close();
                    System.out.println("Connection closed. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private static void insertDocument(Scanner scanner, MongoCollection<Document> collection) {
        System.out.println("Enter ID:");
        String id = scanner.nextLine();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter gender (true for male, false for female):");
        String male = scanner.nextLine();
        System.out.println("Enter number of siblings:");
        String siblings = scanner.nextLine();

        Document doc = new Document("id", id)
                .append("name", name)
                .append("male", male)
                .append("siblings", siblings);
        
        collection.insertOne(doc);
        System.out.println("Document inserted successfully!");
    }

    private static void updateDocument(Scanner scanner, MongoCollection<Document> collection) {
        System.out.println("Enter the ID of the document to edit:");
        String id = scanner.nextLine();
        
        System.out.println("Enter new name (leave blank to keep unchanged):");
        String name = scanner.nextLine();
        System.out.println("Enter new gender (true for male, false for female, leave blank to keep unchanged):");
        String male = scanner.nextLine();
        System.out.println("Enter new number of siblings (leave blank to keep unchanged):");
        String siblings = scanner.nextLine();

        Document updatedDoc = new Document();
        if (!name.isEmpty()) updatedDoc.append("name", name);
        if (!male.isEmpty()) updatedDoc.append("male", male);
        if (!siblings.isEmpty()) updatedDoc.append("siblings", siblings);

        if (!updatedDoc.isEmpty()) {
            collection.updateOne(eq("id", id), new Document("$set", updatedDoc));
            System.out.println("Document updated successfully!");
        } else {
            System.out.println("No changes made.");
        }
    }

    private static void deleteDocument(Scanner scanner, MongoCollection<Document> collection) {
        System.out.println("Enter the ID of the document to delete:");
        String id = scanner.nextLine();

        collection.deleteOne(eq("id", id));
        System.out.println("Document deleted successfully!");
    }
}