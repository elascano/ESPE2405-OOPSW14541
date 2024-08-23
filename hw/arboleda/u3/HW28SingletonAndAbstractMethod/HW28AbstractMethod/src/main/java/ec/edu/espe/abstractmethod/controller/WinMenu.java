package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE
 */
public class WinMenu extends Menu{

    public WinMenu() {
        super("Windows menu");
    }

    @Override
    public void paint() {
        System.out.println("In WinMenu: " + caption);
    }
    
}
