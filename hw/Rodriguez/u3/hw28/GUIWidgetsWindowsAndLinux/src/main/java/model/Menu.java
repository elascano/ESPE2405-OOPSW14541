/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */
public abstract class Menu {
    protected String caption;

    public Menu(String caption) {
        this.caption = caption;
        System.out.println("Creating Menu: " + caption);
    }

    public abstract void paint();
}
