/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import model.Friend;
import org.bson.Document;

/**
 *
 * @author G406
 */
public class FriendController {

    private static final String URI = "mongodb+srv://villagomez:villagomez@cluster0.hdylr9r.mongodb.net/";
    private static final String DATABASE_NAME = "opp";
    private static final String COLLECTION_NAME = "Friends";

    public static boolean create(Friend friend) {
        try (MongoClient mongoClient = MongoClients.create(URI)) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

            Document dataOfFriend = new Document()
                    .append("name", friend.getName())
                    .append("age", friend.getAge())
                    .append("income", friend.getMoneyPerMonth())
                    .append("ageInMonths", ageInMonths(friend.getAge()))
                    .append("annualIncome", annualIncome(friend.getMoneyPerMonth()));

            collection.insertOne(dataOfFriend);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int ageInMonths(int age) {
        return age * 12;
    }

    public static double annualIncome(double moneyPerMonth) {
        return moneyPerMonth * 12;
    }
}
