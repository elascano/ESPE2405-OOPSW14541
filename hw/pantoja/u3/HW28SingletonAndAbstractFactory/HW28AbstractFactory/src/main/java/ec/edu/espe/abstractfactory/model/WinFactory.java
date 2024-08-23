
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class WinFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Menu createMenu() {
        return new WinMenu();
    }
    
}
