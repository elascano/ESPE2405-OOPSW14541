/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.controller;

import abstractfactory.model.Button;
import abstractfactory.model.GUIFactory;
import abstractfactory.model.Menu;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
 */
public class ClientApp {
    private GUIFactory factory;
    private Button button;
    private Menu menu;

    public ClientApp(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.menu = factory.createMenu();
    }

    public void render() {
        button.paint();
        menu.paint();
    }
}
