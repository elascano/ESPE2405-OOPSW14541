
package utils;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */

public abstract class FileManager extends DataManager {  //1 --> 1.75
    protected String fileSystem;//0.5

    public FileManager() {//0.25
        this.fileSystem = "";
    }
    //0.5
    public abstract void openFile();
    public abstract void closeFile();
    public abstract void add(String data);
}
// -0.5 no tiene setters and getters



