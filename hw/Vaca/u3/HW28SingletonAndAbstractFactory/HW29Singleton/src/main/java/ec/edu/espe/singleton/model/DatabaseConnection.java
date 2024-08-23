
package ec.edu.espe.singleton.model;

/**
 *
 * @author MSI-PULSE
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private static String databaseUrl;

    
    private DatabaseConnection(String databaseUrl) {
        this.databaseUrl = databaseUrl;
        System.out.println("Connecting to the database: " + databaseUrl);
    }

    
    public static DatabaseConnection getInstance(String databaseUrl) {
        if (instance == null) {
            instance = new DatabaseConnection(databaseUrl);
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
