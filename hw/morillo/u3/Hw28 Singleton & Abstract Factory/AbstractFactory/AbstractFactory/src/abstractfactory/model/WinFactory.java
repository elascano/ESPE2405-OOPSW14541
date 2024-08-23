/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.model;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Menu createMenu() {
        return new WinMenu();
    }
}
