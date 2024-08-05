
package utils;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class XmlManager extends FileManager {//1.5
    @Override
    //-0.25
    public void openFile() {
        
        System.out.println("Opening XML file");
    }

    @Override
    public void closeFile() {
        
        System.out.println("Closing XML file");
    }

    @Override
    public void add(String data) {
        
        System.out.println("Adding data to XML file: " + data);
    }
}
