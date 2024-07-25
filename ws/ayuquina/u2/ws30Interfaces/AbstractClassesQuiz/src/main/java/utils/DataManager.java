/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE // tienes 2
 */
public abstract class DataManager {

    private ArrayList<Table> tables;
    private String dataBase;

    public DataManager(ArrayList<Table> tables, String dataBase) {
        this.tables = tables;
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
    
    
    public void setDataBase(String dataBase){
        System.out.println("Bata base: "+dataBase);
    }
}
