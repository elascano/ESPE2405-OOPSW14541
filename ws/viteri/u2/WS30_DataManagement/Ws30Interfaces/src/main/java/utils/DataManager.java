/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public abstract class DataManager {  //2
    private ArrayList<Table> table;
    private String database;

    public ArrayList getTable() {
        return table;
    }

    public void setTable(ArrayList table) {
        this.table = table;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public DataManager(ArrayList table, String database) {
        this.table = table;
        this.database = database;
    }
    public void setDataBase(String database){
        System.out.println("connecting"+database);
        
    }
}
