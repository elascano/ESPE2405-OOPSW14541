/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.model.DatabaseManager;


/**
 *
 * @author DELL
 */
public class Application {
    

    public static void main(String[] args) {
        DatabaseManager mysqlConnection = DatabaseManager.getConnection("jdbc:mysql://localhost:3306/midatabase");
        mysqlConnection.runQuery("SELECT * FROM customers");
        
        DatabaseManager postgresConnection = DatabaseManager.getConnection("jdbc:postgresql://localhost:5432/midatabase");
        postgresConnection.runQuery("SELECT * FROM orders");
        
        mysqlConnection.terminateConnection();
    }
}
