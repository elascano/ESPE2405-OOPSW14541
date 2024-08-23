
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
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
