/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.model;

/**
 *
 * @author DELL
 */
public class DatabaseManager {
    private static DatabaseManager uniqueInstance;
    private static String dbUrl;

    // Constructor privado para evitar la creación directa de instancias.
    private DatabaseManager(String dbUrl) {
        this.dbUrl = dbUrl;
        System.out.println("Estableciendo conexión con la base de datos: " + dbUrl);
    }

    // Método para obtener la única instancia de la clase.
    public static DatabaseManager getConnection(String dbUrl) {
        if (uniqueInstance == null) {
            uniqueInstance = new DatabaseManager(dbUrl);
        }
        return uniqueInstance;
    }

    // Método para ejecutar consultas en la base de datos.
    public static void runQuery(String sql) {
        System.out.println("Ejecutando consulta en " + dbUrl + ": " + sql);
    }

    // Método para cerrar la conexión con la base de datos.
    public static void terminateConnection() {
        System.out.println("Cerrando conexión con la base de datos: " + dbUrl);
    }
    
}
