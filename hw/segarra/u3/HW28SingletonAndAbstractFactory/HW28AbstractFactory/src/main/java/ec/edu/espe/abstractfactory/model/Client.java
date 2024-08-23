/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espe.abstractfactory.model;

import ec.edu.espe.abstractfactory.model.GUIFactory;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
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
