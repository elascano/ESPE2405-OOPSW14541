
package ec.edu.espe.abstractfactory.model;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.GUIFactory;
import ec.edu.espe.abstractfactory.model.Menu;
import ec.edu.espe.abstractfactory.model.LinuxFactory;
import ec.edu.espe.abstractfactory.model.WinFactory;
/**
 *
 * @author MSI-PULSE
 */

public class ClientApp {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new WinFactory();
        } else {
            factory = new LinuxFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

class Application {
    private Button button;
    private Menu menu;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        menu = factory.createMenu();
    }

    public void paint() {
        button.paint();
        menu.paint();
    }
}

