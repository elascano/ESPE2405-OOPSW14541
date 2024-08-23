
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class WinButton extends Button{

    public WinButton() {
        super("Windows button");
    }
    
    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
    
}
