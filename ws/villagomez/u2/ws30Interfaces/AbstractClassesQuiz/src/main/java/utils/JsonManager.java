package utils;

import java.util.ArrayList;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */

abstract class JsonManager extends FileManager {//1,5
    
    public JsonManager(ArrayList<Table> tables, String dataBase, String fileSystem) {
        super(tables, dataBase, fileSystem);
    }

    @Override
    public abstract void add(String data);

    @Override
    public abstract void closeFile();

    @Override
    public abstract void openFile();

    @Override
    public void setFileSystem(String fileSystem) {
        super.setFileSystem(fileSystem); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getFileSystem() {
        return super.getFileSystem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
    
}
