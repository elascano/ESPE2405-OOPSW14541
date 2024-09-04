
package ec.edu.espe.abstractfactory.view;

import ec.edu.espe.abstractfactory.controller.Button;
import ec.edu.espe.abstractfactory.controller.GUIFactory;
import ec.edu.espe.abstractfactory.controller.Menu;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        
        Button aButton = aFactory.createButton();
        aButton.caption= "Play";
        aButton.paint();
        
        Menu aMenu = aFactory.createMenu();
        aMenu.caption = "Play";
        aMenu.paint();
    }
}
