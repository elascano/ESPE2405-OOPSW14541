
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Cristian Mateo lisintuña
 */
public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }
}
