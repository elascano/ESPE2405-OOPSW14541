package utils;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.zoo.model.Animal;
import org.bson.Document;


public class MongoDBUtils {
    private static final String CONNECTION_STRING = "mongodb+srv://carlosp:carlosp@cluster0.qouhg0b.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"; // Reemplaza con tu conexión de MongoDB Atlas
    private static final String DATABASE_NAME = "oop";
    private static final String COLLECTION_NAME = "Animals";

    private static MongoClient getClient() {
        return MongoClients.create(CONNECTION_STRING);
    }

    public static boolean saveAnimal(Animal animal) {
        try (MongoClient mongoClient = getClient()) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

            Document animalDoc = new Document("id", animal.getId())
                    .append("description", animal.getDescription())
                    .append("bornOndate", animal.getBornOndate())
                    .append("gender", animal.getGender())
                    .append("cage", animal.getCage())
                    .append("numberOfBones", animal.getNumberOfBones())
                    .append("vertebrate", animal.isVertebrate())
                    .append("foods", animal.getFoods());

            collection.insertOne(animalDoc);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

