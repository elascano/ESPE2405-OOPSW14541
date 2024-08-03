package ec.edu.espe.exam.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author David Pantoja
 */
public class PasswordManager {

    public static boolean checkCredentials(String currentUsername, String username, String password, MongoCollection<Document> collection) {
        BasicDBObject query = new BasicDBObject();
        query.put("username", username);

        Document result = collection.find(query).first();
        if (result != null) {
            String storedPassword = result.getString("password");
            if (storedPassword.startsWith("$2a$")) {
                if (BCrypt.checkpw(password, storedPassword)) {
                    currentUsername = username;
                    return true;
                }
            } else {
                if (password.equals(storedPassword)) {
                    String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
                    result.put("password", hashedPassword);
                    collection.replaceOne(new Document("_id", result.get("_id")), result);
                    currentUsername = username;
                    return true;
                }
            }
        }

        return false;
    }

    public static void migratePasswordsToBCrypt(MongoCollection<Document> collection) {
        BasicDBObject query = new BasicDBObject();
        query.put("password", new BasicDBObject("$exists", true));

        ArrayList<Document> documents = collection.find(query).into(new ArrayList<>());
        for (Document document : documents) {
            String oldPassword = document.getString("password");

            if (!oldPassword.startsWith("$2a$")) {
                String newPassword = BCrypt.hashpw(oldPassword, BCrypt.gensalt());
                document.put("password", newPassword);
                collection.replaceOne(new Document("_id", document.get("_id")), document);
            }
        }
    }

    public static boolean createUser(String name, String lastName, String username, String password, MongoCollection<Document> collection) {
        BasicDBObject query = new BasicDBObject();
        query.put("username", username);

        Document existingUser = collection.find(query).first();
        if (existingUser != null) {
            return false;
        }

        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        Document newUser = new Document();
        newUser.append("name", name)
                .append("lastName", lastName)
                .append("username", username)
                .append("password", hashedPassword);

        collection.insertOne(newUser);

        return true;
    }

    public static boolean changePassword(String currentUsername, String newPassword, String confirmPassword, MongoCollection<Document> collection) {
        if (!newPassword.equals(confirmPassword)) {
            return false;
        }

        BasicDBObject query = new BasicDBObject();
        query.put("username", currentUsername);

        Document user = collection.find(query).first();
        if (user != null) {
            String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());
            user.put("password", hashedPassword);
            collection.replaceOne(new Document("_id", user.get("_id")), user);
            return true;
        }
        return false;
    }

    public static String getPasswordByUsername(String username, MongoCollection<Document> collection) {
        BasicDBObject query = new BasicDBObject();
        query.put("username", username);

        Document result = collection.find(query).first();
        if (result != null) {
            String hashedPassword = result.getString("password");

            if (hashedPassword.startsWith("$2a$")) {
                return BCrypt.checkpw("", hashedPassword) ? "" : null;
            } else {
                return hashedPassword;
            }
        }

        return null;
    }

    public static String generateTemporaryPassword() {
        String temporaryPassword = generateRandomPassword();
        String hashedPassword = BCrypt.hashpw(temporaryPassword, BCrypt.gensalt());
        return hashedPassword;
    }

    public static String generateRandomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int length = 8;

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static boolean updatePassword(String username, String newPassword, String temporaryPassword, MongoCollection<Document> collection) {
        BasicDBObject query = new BasicDBObject();
        query.put("username", username);

        Document user = collection.find(query).first();
        if (user != null) {
            String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());
            user.put("password", hashedPassword);
            user.put("temporaryPassword", temporaryPassword);

            // Reemplazar el documento en la base de datos
            collection.replaceOne(new Document("_id", user.get("_id")), user);

            return true;
        }

        return false;
    }
}
