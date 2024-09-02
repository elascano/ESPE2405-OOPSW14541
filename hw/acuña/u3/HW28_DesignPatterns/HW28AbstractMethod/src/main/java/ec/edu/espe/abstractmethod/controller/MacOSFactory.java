package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE
 */
public class MacOSFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
    
}
