
package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.model.DatabaseConnection;

/**
 *
 * @author MSI-PULSE
 */
public class Client {
    public static void main(String[] args) {
        
        DatabaseConnection mySQLConnection = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydatabase");
        mySQLConnection.executeQuery("SELECT * FROM users");
        
        
        DatabaseConnection postgreSQLConnection = DatabaseConnection.getInstance("jdbc:postgresql://localhost:5432/mydatabase");
        postgreSQLConnection.executeQuery("SELECT * FROM orders");
        
        
        mySQLConnection.closeConnection();
    }
}
