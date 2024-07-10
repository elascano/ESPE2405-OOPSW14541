/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javawithmongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import java.util.Scanner;
import org.bson.Document;
/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class JavaWithMongoDB {
   
    
    public static void main(String[] args) {
                
        MongoClient mongoClient = MongoClients.create("mongodb+srv://bpgualotuna1:bpgualotuna1@cluster0.elvwlgc.mongodb.net/");
        
        MongoDatabase database = mongoClient.getDatabase("oop");
        
        MongoCollection<Document> collection = database.getCollection("students");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese id: ");
        String id = scan.nextLine();
        
        System.out.println("Ingrese nombre: ");
        String name = scan.nextLine();
        
        System.out.println("Ingrese si es hombre (true/false):");
        Boolean male = scan.nextBoolean();
        
        System.out.println("Ingrese cuantos hermanos tiene: ");
        int siblings = scan.nextInt();
        
        Document doc = new Document("id", id)
                .append("name", name)
                .append("male", male)
                .append("siblings",siblings);
        
         collection.insertOne(doc);
         
          System.out.println("Documento insertado con éxito!");
          
        mongoClient.close();
    }
}
