
package abstractfactory.view;
import abstractfactory.controller.ClientApp;
import abstractfactory.model.GUIFactory;
import abstractfactory.model.LinuxFactory;
import abstractfactory.model.WinFactory;
import java.util.Scanner;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
 */
// Main.java (View)

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de OS (Windows/Linux): ");
        String osType = scanner.nextLine().trim().toLowerCase();

        GUIFactory factory;
        if (osType.equals("windows")) {
            factory = new WinFactory();
        } else if (osType.equals("linux")) {
            factory = new LinuxFactory();
        } else {
            System.out.println("OS no soportado");
            return;
        }

        ClientApp app = new ClientApp(factory);
        app.createUI();
        app.render();
    }
}
