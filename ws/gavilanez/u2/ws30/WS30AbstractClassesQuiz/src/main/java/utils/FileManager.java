package utils;

import java.util.ArrayList;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public abstract class FileManager extends DataManager {//1.5

    String fileSystem;

    public FileManager(ArrayList<Table> tables, String database,String fileSystem) {
        super(tables, database);
        
    }

    public abstract void openFile();
    
    public abstract void closeFile();    
    
    public abstract void add();

}
