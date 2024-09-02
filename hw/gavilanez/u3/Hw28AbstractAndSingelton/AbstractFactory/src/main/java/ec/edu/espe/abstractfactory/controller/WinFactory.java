
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class WinFactory extends GUIFactory{
    public Button createButton(){
        return (new WinButton());
    }
    public Menu createMenu(){
        return (new WinMenu());
    }
}
