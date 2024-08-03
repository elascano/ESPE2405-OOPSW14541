
package utils;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class CvsManager extends FileManager {//1.5
    @Override
    
    //-0.25
    public void openFile() {
        
        System.out.println("Opening CSV file");
    }

    @Override
    public void closeFile() {
        
        System.out.println("Closing CSV file");
    }

    @Override
    public void add(String data) {
        
        System.out.println("Adding data to CSV file: " + data);
    }
}
