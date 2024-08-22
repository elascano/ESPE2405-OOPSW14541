/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class MacButton extends Button{

    public MacButton() {
        super("MacOS button");
    }

    @Override
    public void paint() {
        System.out.println("I'm MacOSButton: " + caption);
    }
    
}
