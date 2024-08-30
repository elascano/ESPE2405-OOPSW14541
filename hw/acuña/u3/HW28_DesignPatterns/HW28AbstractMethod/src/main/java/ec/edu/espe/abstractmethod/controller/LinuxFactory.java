package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }
    
}
