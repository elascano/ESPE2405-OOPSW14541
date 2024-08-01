/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public abstract class DataManager { //1.25  constructor -0.25, no method-0.5
    private ArrayList<Table> tables = new ArrayList<>();
    private String dataBase;

    public DataManager(String dataBase) {
        this.dataBase = dataBase;
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
     * @return the dataBase
     */
    public String getDataBase() {
        return dataBase;
    }

    /**
     * @param dataBase the dataBase to set
     */
    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }
    
    
}


