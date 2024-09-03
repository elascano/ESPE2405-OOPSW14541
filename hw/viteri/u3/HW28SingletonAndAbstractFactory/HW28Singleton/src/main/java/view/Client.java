/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.InterfaceCreator;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Client {

    public static void main(String[] args) {
        InterfaceCreator windowsInterface = InterfaceCreator.getInstance("Windows");
        windowsInterface.createButton();
        windowsInterface.createInterface();
        
        //It's trying to create a new instance but as the class InterfaceCreator have a unique instance it will only throw "Windows"
        InterfaceCreator macOSInterface = InterfaceCreator.getInstance("MacOS");
        macOSInterface.createButton();
        macOSInterface.createInterface();
        
    }
}
