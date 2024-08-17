/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.mongoshell.view;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class HW15MongoShellCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MongoClientURI uri = new MongoClientURI("mongodb+srv://ismael:ismael@cluster0.tayl6re.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
        MongoClient mongoClient = new MongoClient(uri);

        MongoDatabase database = mongoClient.getDatabase("oop");
        MongoCollection<Document> collection = database.getCollection("students");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Is male? (true/false): ");
        boolean male = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Enter the number of siblings: ");
        int siblings = Integer.parseInt(scanner.nextLine());

        Document document = new Document()
                .append("id", id)
                .append("name", name)
                .append("male", male)
                .append("siblings", siblings);

        collection.insertOne(document);

        mongoClient.close();
    }

}
