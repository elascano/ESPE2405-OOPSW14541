package utils;

import java.util.ArrayList;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public abstract class FileManager extends DataManager {//1
    public String fileSystem;//0.5
//0.5
  public abstract void openFile();
  public abstract void closeFile();
  public abstract void add(String data);

    public FileManager(String fileSystem, ArrayList<Table> tables, String database) {
        super(tables, database);
        this.fileSystem = fileSystem;
    }
    
    /**
     * @return the fileSystem
     */
    public String getFileSystem() {
        return fileSystem;
    }

    /**
     * @param fileSystem the fileSystem to set
     */
    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
    }
    
    
}
