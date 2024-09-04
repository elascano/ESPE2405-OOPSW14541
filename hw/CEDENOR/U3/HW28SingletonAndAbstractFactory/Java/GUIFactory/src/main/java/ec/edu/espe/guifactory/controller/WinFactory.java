package ec.edu.espe.guifactory.controller;

/**
 *
 @author Nahomi Cedeño, Code Creators, DCCO-ESPE
 */
public class WinFactory extends GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Menu createMenu() {
        return new WinMenu();
    }
}
