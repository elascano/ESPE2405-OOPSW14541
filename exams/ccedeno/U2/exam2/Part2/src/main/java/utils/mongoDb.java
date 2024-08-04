package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import ec.edu.espe.Part2.model.Player;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author G406
 */
public class mongoDb {
    private static final String URI = "mongodb+srv://cedeno:cedeno@cluster0.s2nvcgm.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "POO";

    private static MongoDatabase getDatabase() {
        MongoClient mongoClient = MongoClients.create(URI);
        return mongoClient.getDatabase(DATABASE_NAME);
    }
    
    public static void savePlayer(Player player) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection("Player");

        Document document = new Document("id", player.getId())
                .append("name", player.getName())
                .append("description", player.getDescription())
                .append("goal", player.getGoal())
                .append("asist", player.getAsist())
                .append("GA", player.getGA());

        collection.insertOne(document);
    }
}
