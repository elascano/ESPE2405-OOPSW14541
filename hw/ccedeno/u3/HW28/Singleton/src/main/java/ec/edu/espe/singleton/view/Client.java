
package ec.edu.espe.singleton.view;

import utils.Database;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Client {
    public static void main(String[] args) {
        
        Database mySQLConnection = Database.getInstance("jdbc:mysql://localhost:3306/mydatabase");
        mySQLConnection.executeQuery("SELECT * FROM users");
        
        
        Database postgreSQLConnection = Database.getInstance("jdbc:postgresql://localhost:5432/mydatabase");
        postgreSQLConnection.executeQuery("SELECT * FROM orders");
        
        
        mySQLConnection.closeConnection();
    }
}
