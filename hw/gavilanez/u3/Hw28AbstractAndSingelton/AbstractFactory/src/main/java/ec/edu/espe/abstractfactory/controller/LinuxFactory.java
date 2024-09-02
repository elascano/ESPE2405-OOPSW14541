
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory{
    public Button createButton(){
        return (new LinuxButton());
    }
    public Menu createMenu(){
        return (new LinuxMenu());
    }
}
