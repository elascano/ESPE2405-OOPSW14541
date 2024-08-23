package ec.edu.espe.strategypattern.view;
import ec.edu.espe.strategypattern.controller.InputHandler;
import java.util.Scanner;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class SortApp {
    public static void main(String[] args) {
        InputHandler controller = new InputHandler();
        controller.sortAndDisplay();
    }
    
}
