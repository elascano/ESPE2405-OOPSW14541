
package ec.edu.espe.guifactory.view;

import ec.edu.espe.guifactory.controller.GUIFactory;
import ec.edu.espe.guifactory.controller.Menu;
import ec.edu.espe.guifactory.controller.Button;

/**
 *
 * @author Saray Canarte, Code Creators, DCCO-ESPE
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
      
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint(); 

        Menu aMenu = aFactory.createMenu();
        aMenu.caption = "Start";
        aMenu.display();
    }
}

