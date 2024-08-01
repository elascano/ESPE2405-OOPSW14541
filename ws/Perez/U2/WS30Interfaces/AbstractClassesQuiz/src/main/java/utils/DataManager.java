/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public abstract class DataManager { //1 
    private ArrayList <Table> table;
    private String database;

    /**
     * @return the table
     */
    
    public DataManager(ArrayList<Table> table, String database) {// no es el metodo aducuado 
        this.table = table;
        this.database = database;
    }

    public ArrayList <Table> getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(ArrayList <Table> table) {
        this.table = table;
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
