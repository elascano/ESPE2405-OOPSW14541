package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class LinuxMenu extends Menu{

    public LinuxMenu() {
        super("Linux menu");
    }

    @Override
    public void paint() {
        System.out.println("In LinuxMenu: " + caption);
    }
    
}
