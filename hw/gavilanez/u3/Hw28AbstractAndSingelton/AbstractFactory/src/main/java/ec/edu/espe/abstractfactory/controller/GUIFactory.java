
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory(){
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0){
            return (new WinFactory());
        }
        else{
            return (new LinuxFactory());
        }
        
    }

    private static int readFromConfigFile(String os_type) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public abstract Button createButton();
    public abstract Menu createMenu();
}
