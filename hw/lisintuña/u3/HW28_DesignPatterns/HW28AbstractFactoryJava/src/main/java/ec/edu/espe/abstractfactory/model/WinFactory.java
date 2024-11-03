
package ec.edu.espe.abstractfactory.model;

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
