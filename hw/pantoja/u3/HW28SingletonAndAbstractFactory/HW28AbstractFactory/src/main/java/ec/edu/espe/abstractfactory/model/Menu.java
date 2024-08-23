
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
abstract class Menu {
    public String caption;

    public Menu(String caption) {
        this.caption = caption;
    }
    
    public abstract void paint();
}
