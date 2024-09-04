/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ClientApp;
import model.GUIFactory;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        // "Windows" or "Linux" 
        String osType = "Linux";

        GUIFactory factory = GUIFactory.getFactory(osType);
        
        if (factory != null) {  
            ClientApp app = new ClientApp(factory);
            app.paint();
        }
    }
}
