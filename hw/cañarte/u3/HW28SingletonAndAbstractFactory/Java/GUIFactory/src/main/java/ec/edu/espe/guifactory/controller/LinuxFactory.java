package ec.edu.espe.guifactory.controller;

/**
 *
 * @author Saray Canarte, Code Creators, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }
}

