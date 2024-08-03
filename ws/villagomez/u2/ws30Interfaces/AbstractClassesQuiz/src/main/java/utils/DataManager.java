package utils;

import java.util.ArrayList;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public abstract class DataManager {    //1,5

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

    /**
     * @param dataBase the dataBase to set
     */
    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }
    
        
    
   // protected static void setDataBase (dataBase){}
    
}
