package model;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public abstract class GUIFactory {

    public static GUIFactory getFactory(String osType) {
        if (osType.equalsIgnoreCase("Windows")) {
            System.out.println("Windows OS selected. Creating WinFactory.");
            return new WinFactory();
        } else if (osType.equalsIgnoreCase("Linux")) {
            System.out.println("Linux OS selected. Creating LinuxFactory.");
            return new LinuxFactory();
        } else {
            System.out.println("Unknown OS type. Please specify 'Windows' or 'Linux'.");
            return null;
        }
    }

    public abstract Button createButton();
    public abstract Menu createMenu();
}
