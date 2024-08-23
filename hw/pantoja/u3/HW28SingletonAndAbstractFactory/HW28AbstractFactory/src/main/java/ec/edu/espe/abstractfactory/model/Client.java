
package ec.edu.espe.abstractfactory.model;

import ec.edu.espe.abstractfactory.model.GUIFactory;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class Client {

    public static void main(String[] args) {
        String osType = "Linux";
        
        GUIFactory aFactory = GUIFactory.getFactory(osType);
        
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
        
        Menu aMenu = aFactory.createMenu();
        aMenu.caption = "Pause";
        aMenu.paint();
    }
}
