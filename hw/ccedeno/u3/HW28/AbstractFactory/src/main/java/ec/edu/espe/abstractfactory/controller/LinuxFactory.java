
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author MSI-PULSE
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
