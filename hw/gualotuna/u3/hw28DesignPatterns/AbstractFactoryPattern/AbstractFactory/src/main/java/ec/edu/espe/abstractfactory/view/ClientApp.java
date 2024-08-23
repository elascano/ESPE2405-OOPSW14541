package ec.edu.espe.abstractfactory.view;

import ec.edu.espe.abstractfactory.controller.Button;
import ec.edu.espe.abstractfactory.controller.GUIFactory;
import ec.edu.espe.abstractfactory.controller.Menu;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class ClientApp {
    public static void main(String[] args) {
        //Buttons
        GUIFactory winFactory = GUIFactory.getFactory(0);
        
        Button winButton = winFactory.createButton();
        winButton.caption = "Play";
        winButton.paint();
        
        GUIFactory linuxFactory = GUIFactory.getFactory(1);
        
        Button linuxButton = linuxFactory.createButton();
        linuxButton.caption = "Play";
        linuxButton.paint();
        
        //Menus
        Menu winMenu = winFactory.createMenu();
        winMenu.caption = "Configurations";
        winMenu.paint();
        
        Menu linuxMenu = linuxFactory.createMenu();
        linuxMenu.caption = "Configurations";
        linuxMenu.paint();
    }
}
