package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Carlos Perez,The Javabandits, DCCO-ESPE
 */
public class MongoDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.WARNING);


        String connectionString = "mongodb+srv://carlosp:carlosp@cluster0.qouhg0b.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        MongoClientURI uri = new MongoClientURI(connectionString);
        MongoClient mongoClient = new MongoClient(uri);

        
        MongoDatabase database = mongoClient.getDatabase("oop");
        MongoCollection<Document> collection = database.getCollection("students");

        
        System.out.println("Enter student details");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Gender (true for male, false for female): ");
        boolean male = scanner.nextBoolean();
        System.out.print("Number of siblings: ");
        int siblings = scanner.nextInt();

        
        Student student = new Student(id, name, male, siblings);


        Document doc = new Document("id", student.getId())
                .append("name", student.getName())
                .append("male", student.isMale())
                .append("siblings", student.getSiblings());

        
        collection.insertOne(doc);

        
        mongoClient.close();
        scanner.close();

        System.out.println("Document inserted successfully.");
    }
    
    
}
