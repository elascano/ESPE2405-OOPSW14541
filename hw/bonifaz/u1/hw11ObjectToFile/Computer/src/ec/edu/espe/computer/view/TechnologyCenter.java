
package ec.edu.espe.computer.view;

import ec.edu.espe.computer.model.Computer;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class TechnologyCenter {

    public static void main(String[] args) {

        Computer computer = new Computer(1859823, "lenovo", "gray", "ideapad300", 2014);
        object.objectManager.saveObject(computer, "computer");
        
        Computer loadComputer= object.objectManager.loadObject("computer");

        System.out.println("Computer -->" + loadComputer);

    }
}
