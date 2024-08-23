package ec.edu.espe.abstractmethod.controller;

import ec.edu.espe.abstractmethod.controller.GUIFactory;

/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE
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
