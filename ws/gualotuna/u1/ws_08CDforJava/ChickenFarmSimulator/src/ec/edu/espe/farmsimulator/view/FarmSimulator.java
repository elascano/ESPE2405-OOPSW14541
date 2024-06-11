
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.controller.ChickenOutput;
import ec.edu.espe.farmsimulator.controller.ChickenInput;


/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        System.out.println("Brayan's Chicken Farm Simulator V 0.5");
        
        Chicken chicken = ChickenInput.enterData();
        ChickenOutput.saveFile(chicken);
        
        System.out.println("Chicken --> \n" + chicken);
        
              
        
    }
    
}
