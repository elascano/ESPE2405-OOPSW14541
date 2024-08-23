/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class MacOSFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
    
}
