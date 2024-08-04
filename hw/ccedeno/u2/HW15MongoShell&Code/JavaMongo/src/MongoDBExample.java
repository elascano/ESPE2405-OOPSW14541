import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class MongoDBExample {
    private static MongoCollection<Document> collection;
    public static void main(String[] args) {
       // Abrir conexión con MongoDB
        String uri = "mongodb+srv://cedeno:cedeno@cluster0.arabu7a.mongodb.net/";
        MongoClient mongoClient = MongoClients.create(uri);

        // Acceso a la base de datos
        MongoDatabase database = mongoClient.getDatabase("opp");

        // Acceso a colecciones
        MongoCollection<Document> mongoCollection = database.getCollection("student");
        
        // Insertar un documento
        Document data = new Document()
                .append("name", "David")
                .append("male", true)
                .append("age", 24);
        mongoCollection.insertOne(data);
        System.out.println("Documento insertado: " + data);

        

        // Cerrar la conexión
        mongoClient.close();
    }
}