/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public abstract class DataManager {   // 2 points
    protected List table = new ArrayList<Table>();
    protected String database;
    
    public static void setDatabase(String dataBase){
        System.out.println("setdatabase");
    }

    public DataManager(String database) {
        this.database = database;
    }
    
    /**
     * @return the table
     */
    public List getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(List table) {
        this.table = table;
    }

    /**
     * @return the database
     */
    public String getDatabase() {
        return database;
    }
}
