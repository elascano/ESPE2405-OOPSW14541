
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }
    
}
