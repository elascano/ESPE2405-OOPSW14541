/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
abstract class Menu {
    public String caption;

    public Menu(String caption) {
        this.caption = caption;
    }
    
    public abstract void paint();
}