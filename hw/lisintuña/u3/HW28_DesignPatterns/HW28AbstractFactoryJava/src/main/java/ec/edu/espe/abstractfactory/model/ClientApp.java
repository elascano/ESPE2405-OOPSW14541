package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Cristian Mateo lisintuña
 */
public class ClientApp {

    private static Application initializeApplication() {
        GUIFactory guiFactory;
        Application applicationInstance;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            guiFactory = new WinFactory();
        } else {
            guiFactory = new LinuxFactory();
        }
        applicationInstance = new Application(guiFactory);
        return applicationInstance;
    }

    public static void main(String[] args) {
        Application applicationInstance = initializeApplication();
        applicationInstance.render();
    }
}

class Application {
    private Button guiButton;
    private Menu guiMenu;

    public Application(GUIFactory guiFactory) {
        this.guiButton = guiFactory.createButton();
        this.guiMenu = guiFactory.createMenu();
    }

    public void render() {
        guiButton.paint();
        guiMenu.paint();
    }
}
