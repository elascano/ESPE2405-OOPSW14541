
package ec.edu.espe.guifactory.controller;

/**
 *
 * @author Saray Canarte, Code Creators, DCCO-ESPE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0)
            return new WinFactory();
        else
            return new LinuxFactory();
    }

    
    public abstract Button createButton();
    public abstract Menu createMenu();

   
    private static int readFromConfigFile(String key) {
        if (key.equals("OS_TYPE")) {
            // Assuming 0 represents Windows and 1 represents Linux
            return 1; 
        }
        return -1;
    }
}
