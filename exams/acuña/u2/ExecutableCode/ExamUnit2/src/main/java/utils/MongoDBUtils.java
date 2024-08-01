package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.examnunit2.model.Vehicle;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @authors Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class MongoDBUtils {

    private static final String URI = "mongodb+srv://acuna:acuna@cluster0.znfrgif.mongodb.net/";
    private static final String DATABASE_NAME = "exam2";
    private static final String COLLECTION_NAME = "Vehicle";
    private static MongoClient mongoClient;

    // Método para obtener la instancia de la base de datos
    public static MongoDatabase getDatabase() {
            mongoClient = MongoClientSingleton.getInstance();
        return mongoClient.getDatabase(DATABASE_NAME);
    }

    // Método para acceder a una colección específica
    public static MongoCollection<Document> accessToCollection(String collectionName) {
        MongoDatabase database = getDatabase();
        return database.getCollection(collectionName);
    }

    // Método para guardar un vehículo
    public static void saveVehicle(String id, String brand, String color, int year,double price) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

        Document document = new Document("id", id)
            .append("brand", brand)
            .append("color", color)
            .append("year", year)
            .append("price", price);

        try {
            collection.insertOne(document);
            System.out.println("Vehicle saved successfully.");
        } catch (Exception e) {
            System.err.println("Error saving vehicle: " + e.getMessage());
        }
    }

    // Método para obtener todos los vehículos
    public static List<Document> getAllVehicles() {
        MongoCollection<Document> collection = accessToCollection(COLLECTION_NAME);
        List<Document> documents = new ArrayList<>();

        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                documents.add(cursor.next());
            }
        }

        return documents;
    }

    // Método para validar un usuario (ejemplo, si fuera necesario)
    public static boolean validateUser(String username, String password) {
        boolean isValid = false;

        MongoCollection<Document> collection = accessToCollection(COLLECTION_NAME);
        Document user = collection.find(eq("user", username)).first();
        if (user != null) {
            String storedPassword = user.getString("password");
            if (storedPassword.equals(password)) {
                isValid = true;
            }
        }
        return isValid;
    }

    // Método para actualizar un vehículo
    public static boolean updateVehicle(String oldId, String newId, String brand, String color, double year, double price) {
        MongoCollection<Document> collection = accessToCollection(COLLECTION_NAME);
        Document vehicle = collection.find(Filters.eq("id", oldId)).first();
        if (vehicle != null) {
            collection.updateOne(Filters.eq("id", oldId), Updates.combine(
                Updates.set("id", newId),
                Updates.set("brand", brand),
                Updates.set("color", color),
                Updates.set("year", year),
                Updates.set("price", price)
            ));
            return true;
        }
        return false;
    }

    // Método para verificar si un ID de vehículo es único
    public static boolean verificationIdVehicle(String id) {
        MongoCollection<Document> collection = accessToCollection(COLLECTION_NAME);
        Document vehicle = collection.find(eq("id", id)).first();
        return vehicle == null;
    }

    // Método para eliminar un vehículo por ID
    public static boolean deleteVehicleById(String id) {
        MongoCollection<Document> collection = accessToCollection(COLLECTION_NAME);
        DeleteResult result = collection.deleteOne(Filters.eq("id", id));
        return result.getDeletedCount() > 0;
    }

    // Método para obtener un vehículo por ID
    public static Document getVehicleById(String id) {
        MongoCollection<Document> collection = accessToCollection(COLLECTION_NAME);
        return collection.find(eq("id", id)).first();
    }

    // Método para actualizar un vehículo (por Document)
    public static void updateVehicle(Document updateVehicle) {
        MongoCollection<Document> collection = accessToCollection(COLLECTION_NAME);
        collection.replaceOne(eq("id", updateVehicle.getString("id")), updateVehicle);
    }

    // Método para obtener todos los documentos de una colección
    public static List<Document> getAllCollection(MongoCollection<Document> mongoCollection) {
        return mongoCollection.find().into(new ArrayList<>());
    }

    // Método para cerrar la conexión a MongoDB
    public static void closeConnectionToMongo() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
        }
    }
}