
package utils;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class JsonManager extends FileManager {//1.5
   
    //-0.25
    @Override
    public void openFile() {
        
        System.out.println("Opening JSON file");
    }

    @Override
    public void closeFile() {
        
        System.out.println("Closing JSON file");
    }

    @Override
    public void add(String data) {
        
        System.out.println("Adding data to JSON file: " + data);
    }
}
