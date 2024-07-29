/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public abstract class DataManager {    //1,5 puntos   -0,5 falta sout setDatabase
    private ArrayList<Table> tables;
    private String dataBase;

    public DataManager(ArrayList<Table> tables, String dataBase) {
        this.tables = tables;
        this.dataBase = dataBase;
    }
    
    public void setDatabase(String dataBase){
        
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
