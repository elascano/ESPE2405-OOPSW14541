
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class WinButton extends Button{
    public void paint(){
        System.out.println("I'm a WinButton: " + caption);
    }
}
