package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
abstract class Menu {
    public String caption;

    public Menu(String caption) {
        this.caption = caption;
    }
    
    public abstract void paint();
}
