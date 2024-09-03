package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
abstract class Button {
    public String caption;

    public Button(String caption) {
        this.caption = caption;
    }
    
    public abstract void paint();
}
