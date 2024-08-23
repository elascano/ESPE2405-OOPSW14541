
package utils;

/**
 *
 * @author MSI-PULSE
 */
public class Database {
    private static Database instance;
    private static String databaseUrl;

    
    private Database(String databaseUrl) {
        this.databaseUrl = databaseUrl;
        System.out.println("Connecting to the database: " + databaseUrl);
    }

    
    public static Database getInstance(String databaseUrl) {
        if (instance == null) {
            instance = new Database(databaseUrl);
        }
        return instance;
    }

    
    public static void executeQuery(String query) {
        System.out.println("Executing query on " + databaseUrl + ": " + query);
    }

    
    public static void closeConnection() {
        System.out.println("Closing connection to the database: " + databaseUrl);
    }
}
