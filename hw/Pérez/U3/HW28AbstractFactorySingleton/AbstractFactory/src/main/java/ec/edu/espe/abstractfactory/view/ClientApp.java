/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.abstractfactory.view;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.GUIFactory;
import ec.edu.espe.abstractfactory.model.Menu;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class ClientApp {

    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
        
        Menu aMenu = aFactory.createMenu();
        aMenu.caption="File";
        aMenu.paint();
    }
}
