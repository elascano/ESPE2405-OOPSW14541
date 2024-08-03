package utils;

import java.util.ArrayList;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class CsvManager extends FileManager{ //1.5
    ArrayList<Table> table;

    public CsvManager(ArrayList<Table> table, String database) {
        super(table, database);
    }
    
}
