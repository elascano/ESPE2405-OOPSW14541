
package utils;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
import java.util.ArrayList;

public class DataManager {              // no asbtract -> 0 
    private ArrayList<Table> tables;
    private String database;

    public DataManager(ArrayList<Table> tables, String database) {
        this.tables = tables;
        this.database = database;
    }

    public DataManager() {
        this.tables = new ArrayList<>();
        this.database = "";
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        dataManager.setDatabase("my_database");
        System.out.println(dataManager.getDatabase());
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
}

class Table {
    
}

