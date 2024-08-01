package utils;

import java.util.ArrayList;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public abstract class DataManager {  //2
    public ArrayList <Table> tables;
    public String database;
    
    public void setDatabase (String database){
        System.out.println("Asigning database" + database);
    }

    public DataManager(ArrayList<Table> tables, String database) {
        this.tables = tables;
        this.database = database;
    }
   
    /**
     * @return the tables
     */
    public ArrayList <Table> getTables() {
        return tables;
    }

    /**
     * @param tables the tables to set
     */
    public void setTables(ArrayList <Table> tables) {
        this.tables = tables;
    }

    /**
     * @return the database
     */
    public String getDatabase() {
        return database;
    }
    
    
}
