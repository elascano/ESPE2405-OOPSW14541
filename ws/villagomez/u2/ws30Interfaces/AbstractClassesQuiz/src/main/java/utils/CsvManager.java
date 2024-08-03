package utils;

import java.util.ArrayList;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */

abstract class CsvManager extends FileManager {//1,5
    
    public CsvManager(ArrayList<Table> tables, String dataBase, String fileSystem) {
        super(tables, dataBase, fileSystem);
    }
    
    
    
}