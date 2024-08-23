
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
abstract class GUIFactory {
    public static GUIFactory getFactory(String OS_TYPE){
        int typeOfOS = readFromConfigFile(OS_TYPE);
        
        switch (typeOfOS) {
            case 0 -> {
                return (new WinFactory());
            }
            case 1 -> {
                return (new MacOSFactory());
            }
            case 2 -> {
                return (new LinuxFactory());
            }
            default -> {
                return (new WinFactory());
            }
        }

    }
    
    public abstract Button createButton();
    
    public abstract Menu createMenu();
    
    private static int readFromConfigFile(String OS_TYPE){
        switch (OS_TYPE) {
            case "Windows" -> {
                return 0;
            }
            case "MacOS" -> {
                return 1;
            }
            case "Linux" -> {
                return 2;
            }
            default -> {
                return 0;
            }
        }
        
    }
}
