package ec.edu.espe.mongoshelldb.view;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.Scanner;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class MongoShellDB {

    public static void main(String[] args) {
       
        MongoClient mongoClient = MongoClients.create("mongodb+srv://villagomez:villagomez@cluster0.hdylr9r.mongodb.net/");

        MongoDatabase database = mongoClient.getDatabase("oop");

        MongoCollection<Document> collection = database.getCollection("students");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

         System.out.print("It's male? true/false: ");
        boolean male = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Enter the number of siblings: ");
        int siblings = Integer.parseInt(scanner.nextLine());

        scanner.close();

        Document document = new Document("ID", id)
                .append("name", name)
                .append("male", male)
                .append("siblings", siblings);

        collection.insertOne(document);

        System.out.println("Document saved successfully");

        mongoClient.close();
    }
}
