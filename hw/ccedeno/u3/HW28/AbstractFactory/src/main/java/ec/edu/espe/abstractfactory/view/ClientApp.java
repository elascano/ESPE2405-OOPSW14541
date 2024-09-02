
package ec.edu.espe.abstractfactory.view;

import ec.edu.espe.abstractfactory.controller.Button;
import ec.edu.espe.abstractfactory.controller.GUIFactory;
import ec.edu.espe.abstractfactory.controller.Menu;
import ec.edu.espe.abstractfactory.controller.LinuxFactory;
import ec.edu.espe.abstractfactory.controller.WinFactory;
/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
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

