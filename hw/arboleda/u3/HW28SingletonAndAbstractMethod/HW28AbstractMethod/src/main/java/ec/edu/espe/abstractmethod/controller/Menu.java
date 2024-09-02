package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE
 */
abstract class Menu {
    public String caption;

    public Menu(String caption) {
        this.caption = caption;
    }
    
    public abstract void paint();
}
