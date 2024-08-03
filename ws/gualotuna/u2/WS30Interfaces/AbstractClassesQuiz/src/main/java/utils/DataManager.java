/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public abstract class DataManager {//1.5
    private ArrayList<Table> tables;
    private String database;
    
    public void setDatabases(String database){
        // -0.5
    }

    public DataManager(ArrayList<Table> tables, String database) {
        this.tables = tables;
        this.database = database;
    }
    
    
        

    /**
     * @return the tables
     */
    public ArrayList<Table> getTables() {
        return tables;
    }

    /**
     * @param tables the tables to set
     */
    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }

    /**
     * @return the database
     */
    public String getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(String database) {
        this.database = database;
    }
    
    
}
