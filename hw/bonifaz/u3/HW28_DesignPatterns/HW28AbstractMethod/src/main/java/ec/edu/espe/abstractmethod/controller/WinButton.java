package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class WinButton extends Button{

    public WinButton() {
        super("Windows button");
    }
    
    @Override
    public void paint() {
        System.out.println("WindowsButton: " + caption);
    }
    
}
