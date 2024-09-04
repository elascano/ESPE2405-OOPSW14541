package ec.edu.espe.guifactory.controller;

/**
 *
 * @author Nahomi Cedeño, Code Creators, DCCO-ESPE
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

