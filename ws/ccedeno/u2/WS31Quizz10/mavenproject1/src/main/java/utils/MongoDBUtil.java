package utils;

import com.mongodb.MongoCommandException;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.PruebaPoo.model.Car;
import org.bson.Document;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MongoDBUtil {
    
    private static final String URI = "mongodb+srv://cedeno:cedeno@cluster0.s2nvcgm.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "POO";

    public static MongoDatabase getDatabase() {
        MongoClient mongoClient = MongoClients.create(URI);
        return mongoClient.getDatabase(DATABASE_NAME);
    }
    
    public static void saveCar(Car car){
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection("Car");

        Document document = new Document("speedF", car.getSpeedF())
                .append("speedI", car.getSpeedI() )
                .append("time", car.getTime())
                .append("acceleration", car.getAcceleration());
                

        collection.insertOne(document);
        
    }
    
}
