
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class WinMenu extends Menu{

    public WinMenu() {
        super("Windows menu");
    }

    @Override
    public void paint() {
        System.out.println("I'm WinMenu: " + caption);
    }
    
}
