package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam.utils.DatabaseManager;
import org.bson.Document;

/**
 *
 * @author David Pantoja
 */

public class DatabaseController {
    String clientURL;
    String databaseName;
    MongoDatabase database;

    private static DatabaseController instance;
    
    private DatabaseController() {
        this.clientURL = "mongodb+srv://cdpantoja2:pantoja@cluster0.uqhoeh0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        this.databaseName = "ExamPractice";
        this.database = DatabaseManager.connectToDatabase(clientURL, databaseName);
    }
    
    public synchronized static DatabaseController getInstance (){
        if (instance != null){
        
        } 
        else {
            instance = new DatabaseController();
        }
        
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
    public MongoCollection changeCollection(String collectionName){
        MongoCollection <Document> collection = DatabaseManager.connectToCollection(database, collectionName);
        return collection;
    }
}
