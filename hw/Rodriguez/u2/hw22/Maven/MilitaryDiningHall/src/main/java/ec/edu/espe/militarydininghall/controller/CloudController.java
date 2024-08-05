/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.militarydininghall.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.ConnectionString;
import org.bson.Document;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.militarydininghall.model.DateBook;
import ec.edu.espe.militarydininghall.model.Dish;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import org.bson.conversions.Bson;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class CloudController {

    private static final String[] collections = {
        "commensals", "militaryChefs", "administrators", "generalAdministrator",};

    public static boolean create(Object object) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");

            MongoCollection<Document> collection = database.getCollection("commensals");

            Gson gson = new Gson();
            String json = gson.toJson(object);
            Document studentDocument = Document.parse(json);

            collection.insertOne(studentDocument);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean createANewAdministrator(Object object) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");

            MongoCollection<Document> collection = database.getCollection("administrators");

            Gson gson = new Gson();
            String json = gson.toJson(object);
            Document studentDocument = Document.parse(json);

            collection.insertOne(studentDocument);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void delete(Object object) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");

            MongoCollection<Document> collection = database.getCollection("commensals");

            Gson gson = new Gson();
            String json = gson.toJson(object);
            Document studentDocument = Document.parse(json);

            collection.deleteOne(studentDocument);

        } catch (Exception e) {
            JOptionPane.showInputDialog("An error has occurred in the data load.");
        }
    }

    public static String login(String email, String password) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");

            for (String accountFiles : collections) {
                MongoCollection<Document> collection = database.getCollection(accountFiles);

                Document query = new Document("email", email).append("password", password);
                Document findedDocument = collection.find(query).first();

                if (findedDocument != null) {
                    return findedDocument.toJson();
                }
            }

            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static String findAccountById(String id) {

        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");

            for (String collectionName : database.listCollectionNames()) {
                System.out.println("Searching in collection: " + collectionName);

                MongoCollection<Document> collection = database.getCollection(collectionName);

                Document query = new Document("id", id);
                Document foundDocument = collection.find(query).first();

                if (foundDocument != null) {
                    System.out.println("Document found: " + foundDocument.toJson());
                    return foundDocument.toJson();
                }
            }
            System.out.println("No document found.");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean updateCommensalBalance(String id, double additionalBalance) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");

            for (String collectionName : collections) {
                MongoCollection<Document> collection = database.getCollection(collectionName);

                Document query = new Document("id", id);
                Document foundDocument = collection.find(query).first();

                if (foundDocument != null) {

                    double currentBalance = foundDocument.getDouble("balance");

                    double newBalance = currentBalance + additionalBalance;

                    Document update = new Document("$set", new Document("balance", newBalance));
                    collection.updateOne(query, update);

                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static DateBook getDateBook(long id) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            MongoCollection<Document> collection = database.getCollection("datebook");

            Document query = new Document("id", id);
            Document result = collection.find(query).first();

            if (result != null) {
                long retrievedId = result.getLong("id");
                Map<String, Boolean> reservedDays = (Map<String, Boolean>) result.get("reservedDays");

                DateBook dateBook = new DateBook();
                dateBook.setId(retrievedId);
                dateBook.setReservedDays(reservedDays);

                return dateBook;
            } else {
                Map<String, Boolean> emptyDays = new HashMap<>();
                DateBook datebook = new DateBook(id, emptyDays);
                CloudController.saveDateBook(datebook);
                return datebook;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveDateBook(DateBook dateBook) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            MongoCollection<Document> collection = database.getCollection("datebook");

            Document datebookDoc = new Document("id", dateBook.getId()).append("reservedDays", dateBook.getReservedDays());

            Document existingDoc = collection.find(new Document("id", dateBook.getId())).first();

            if (existingDoc != null) {

                collection.replaceOne(new Document("id", dateBook.getId()), datebookDoc);
            } else {

                collection.insertOne(datebookDoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AccountDetails getAccountDetails(String id) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");

            for (String collectionName : collections) {
                MongoCollection<Document> collection = database.getCollection(collectionName);

                Document query = new Document("id", id);
                Document foundDocument = collection.find(query).first();

                if (foundDocument != null) {
                    double currentBalance = foundDocument.getDouble("balance");
                    double lastDeposit = foundDocument.getDouble("lastDeposit");
                    double latestWithdrawals = foundDocument.getDouble("latestWithdrawals");

                    return new AccountDetails(currentBalance, lastDeposit, latestWithdrawals);
                }
            }

            return null; // Si no se encuentra el documento.
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void saveMenu(Object object) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");

            MongoCollection<Document> collection = database.getCollection("menu");

            Gson gson = new Gson();
            String json = gson.toJson(object);
            Document studentDocument = Document.parse(json);

            collection.insertOne(studentDocument);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Document> getMenuInformation() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/");
        List<Document> documents = new ArrayList<>();
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("oop");

            MongoCollection<Document> collection = database.getCollection("menu");

            FindIterable<Document> iterable = collection.find();
            for (Document doc : iterable) {
                documents.add(doc);
            }

        }
        return documents;
    }

    public static class AccountDetails {

        public double currentBalance;
        public double lastDeposit;
        public double latestWithdrawals;

        public AccountDetails(double currentBalance, double lastDeposit, double latestWithdrawals) {
            this.currentBalance = currentBalance;
            this.lastDeposit = lastDeposit;
            this.latestWithdrawals = latestWithdrawals;
        }
    }
}
