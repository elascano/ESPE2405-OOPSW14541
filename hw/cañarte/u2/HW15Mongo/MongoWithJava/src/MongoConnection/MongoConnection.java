package MongoConnection;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class MongoConnection {

    public static void main(String[] args) {
        // code to not show mongo messages in console
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = MongoClients.create("mongodb+srv://canarte:canarte@cluster0.devwm9s.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
        MongoDatabase database = mongoClient.getDatabase("oop");
        MongoCollection<Document> collection = database.getCollection("students");
        
        addStudent(collection);

        mongoClient.close();
    }
    
    private static void addStudent(MongoCollection<Document> collection) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            System.out.println("***Student Data***");
            System.out.println("ID:");
            String id = scanner.nextLine();
            
            System.out.println("Name:");
            String name = scanner.nextLine();

            System.out.println("Male gender? (true/false):");
            boolean male = scanner.nextBoolean();

            System.out.println("Siblings:");
            int siblings = scanner.nextInt();
            scanner.nextLine(); 

            Document student = new Document("id", id)
                    .append("name", name)
                    .append("male", male)
                    .append("siblings", siblings);

            collection.insertOne(student);
            System.out.println("Student added to database!");

            System.out.println("Do you want to add another student? (yes/no):");
            continueInput = scanner.nextLine();

        } while (continueInput.equalsIgnoreCase("yes"));
        
        scanner.close();
    }
}
