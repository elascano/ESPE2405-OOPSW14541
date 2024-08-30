package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.model.InterfaceCreator;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE
 */
public class Client {

    public static void main(String[] args) {
        InterfaceCreator windowsInterface = InterfaceCreator.getInstance("Windows");
        windowsInterface.createButton();
        windowsInterface.createInterface();
        
        //It's trying to create a new instance but as the class InterfaceCreator have a unique instance it will only throw "Windows"
        InterfaceCreator macOSInterface = InterfaceCreator.getInstance("MacOS");
        macOSInterface.createButton();
        macOSInterface.createInterface();
        
    }
}
