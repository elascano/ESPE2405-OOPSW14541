/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class WinFactory extends GUIFactory {
    public Button createButton(){
        System.out.println("Creating Windows Button");
        return (new WinButton());
    }
    
    public Menu createMenu(){
        System.out.println("Creating Windows Menu");
        return (new WinMenu());
    }
    
    
}
