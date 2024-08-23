/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory{
    
    public Button createButton() {
        System.out.println("Creating Linux Button");
        return (new LinuxButton());
    }

    
    public Menu createMenu() {
        System.out.println("Creating Linux Menu");
        return (new LinuxMenu());
    }
    
}
