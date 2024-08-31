package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE
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
