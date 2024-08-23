
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author MSI-PULSE
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Menu createMenu() {
        return new WinMenu();
    }
}
