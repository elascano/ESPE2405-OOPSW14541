/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class MacMenu extends Menu {

    public MacMenu() {
        super("MacOS menu");
    }

    @Override
    public void paint() {
        System.out.println("I'm MacOSMenu: " + caption);
    }

}
