/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */
public class WinMenu extends Menu {
    public WinMenu() {
        super("WinMenu 1");
    }

    @Override
    public void paint() {
        System.out.println("I'm a WinMenu: " + caption);
    }
}
