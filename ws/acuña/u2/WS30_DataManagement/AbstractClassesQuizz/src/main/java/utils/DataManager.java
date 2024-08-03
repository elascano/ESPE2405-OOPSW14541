package utils;

import java.util.ArrayList;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE
 *
 */

public abstract class DataManager { // 2
    private ArrayList<Table> tables;
    private String dataBase;
    
    public void setDataBase(String dataBase) {
        System.out.println("Connecting to de data Base");
    }

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

}