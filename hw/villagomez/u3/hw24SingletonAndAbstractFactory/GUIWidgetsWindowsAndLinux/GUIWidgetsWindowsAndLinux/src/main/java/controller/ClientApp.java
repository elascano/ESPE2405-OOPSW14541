/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Button;
import model.GUIFactory;
import model.LinuxFactory;
import model.Menu;
import model.WinFactory;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class ClientApp {
    private Button button;
    private Menu menu;

    public ClientApp(GUIFactory factory) {
        button = factory.createButton();
        menu = factory.createMenu();
    }

    public void paint() {
        button.paint();
        menu.paint();
    }

}
