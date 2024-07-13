package mongoconnection;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.Scanner;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO-ESPE
 */

public class MongoDBConnection {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("mongodb+srv://nncedeno1:<beaTLES123>@cluster0.tkhbv81.mongodb.net/");
        MongoDatabase database = mongoClient.getDatabase("OOP");
        MongoCollection<Document> collection = database.getCollection("students");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Is it male? (true/false): ");
        boolean isMale = scanner.nextBoolean();
        System.out.print("Enter number of siblings: ");
        int siblings = scanner.nextInt();

        Document document = new Document()
                .append("id", id)
                .append("name", name)
                .append("male", isMale)
                .append("siblings", siblings);

        collection.insertOne(document);

        Document insertedDocument = collection.find(Filters.eq("id", id)).first();
        System.out.println("Inserted document: " + insertedDocument);

        mongoClient.close();

        System.out.println("Document inserted successfully.");
    }
}

