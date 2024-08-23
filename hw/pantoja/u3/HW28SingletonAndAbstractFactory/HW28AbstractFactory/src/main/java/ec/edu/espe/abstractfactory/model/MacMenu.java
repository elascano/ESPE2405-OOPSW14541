
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
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
