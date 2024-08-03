package ec.edu.espe.Speakers.controller;

import ec.edu.espe.Speakers.model.Speakers;
import ec.edu.espe.Speakers.utils.MongoDBConection;
import org.bson.Document;

/**
 *
 * @author David Rodriguez
 */
public class CreateSpeakers {

    private MongoDBConection mongoDBConnection;

    public CreateSpeakers(MongoDBConection mongoDBConnection) {
        this.mongoDBConnection = mongoDBConnection;
    }

    public void createCellPhone(int id, String brand, float price, int stock) {
        Speakers cellPhone = new Speakers(id, brand, price, stock);

        Document document = new Document("Id", cellPhone.getId())
                .append("Brand", cellPhone.getBrand())
                .append("Price", cellPhone.getPrice())
                .append("Stock", cellPhone.getStock());

        try {
            mongoDBConnection.getCollection().insertOne(document);
            System.out.println("Document inserted successfully: " + document.toJson());
        } catch (Exception e) {
            System.err.println("Error inserting document: " + e);
        }
    }
}
