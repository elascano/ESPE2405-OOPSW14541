package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE
 */
public class MacMenu extends Menu {

    public MacMenu() {
        super("MacOS menu");
    }

    @Override
    public void paint() {
        System.out.println("In MacOSMenu: " + caption);
    }

}
