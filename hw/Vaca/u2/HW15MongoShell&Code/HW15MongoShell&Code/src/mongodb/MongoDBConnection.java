package mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.bson.Document;

import java.util.Scanner;

public class MongoDBConnection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter ID (String): ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Name (String): ");
        String name = scanner.nextLine();
        
        System.out.print("Is Male? (true/false): ");
        boolean male = scanner.nextBoolean();
        
        System.out.print("Enter Number of Siblings (int): ");
        int sibling = scanner.nextInt();
        
        
        Gson gson = new Gson();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", id);
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("male", male);
        jsonObject.addProperty("sibling", sibling);
        
        
        String jsonString = gson.toJson(jsonObject);
        System.out.println("JSON String: " + jsonString);

        
        Document document = Document.parse(jsonString);
        
        
        String connectionString = "mongodb+srv://vaca:vaca@cluster0.42hdahs.mongodb.net/";
        ConnectionString connString = new ConnectionString(connectionString);
        MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connString)
            .build();
        MongoClient mongoClient = MongoClients.create(settings);
        
        
        MongoDatabase database = mongoClient.getDatabase("oop");
        MongoCollection<Document> collection = database.getCollection("students");
        
        
        collection.insertOne(document);
        
        
        System.out.println("Inserted Document: ");
        System.out.println(document.toJson());
        
        scanner.close();
        mongoClient.close();
    }
}
