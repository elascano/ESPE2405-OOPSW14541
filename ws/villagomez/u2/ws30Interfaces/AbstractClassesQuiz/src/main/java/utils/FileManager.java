package utils;

import java.util.ArrayList;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */

public abstract class FileManager extends DataManager {//1.......2

    private String fileSystem;//0.5

    public FileManager(ArrayList<Table> tables, String dataBase,String fileSystem) {
        super(tables, dataBase);
        this.fileSystem=fileSystem;
    }

    /**
     * @return the fileSystem
     */
    public String getFileSystem() {//0,5
        return fileSystem;
    }

    /**
     * @param fileSystem the fileSystem to set
     */
    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
    }
    //0.5
    public abstract void openFile ();
    
    public abstract void closeFile ();
    
    public abstract void add ( String data);
}
