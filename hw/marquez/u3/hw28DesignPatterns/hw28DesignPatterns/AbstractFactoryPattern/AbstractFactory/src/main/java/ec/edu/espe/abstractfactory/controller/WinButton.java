/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class WinButton extends Button {

    @Override
    public void paint() {
        System.out.println("I'm a WinButton " + caption);
    }

}
