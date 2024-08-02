
package utils;

import java.util.ArrayList;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class JsonManager extends FileManager{ //1.5

    public JsonManager(String fileSystem, ArrayList<Table> tables, String database) {
        super(fileSystem, tables, database);
    }
//1.5
    @Override
    public void openFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void closeFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
