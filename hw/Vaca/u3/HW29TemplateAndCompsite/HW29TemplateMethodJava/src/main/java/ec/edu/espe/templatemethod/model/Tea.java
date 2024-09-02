
package ec.edu.espe.templatemethod.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author MSI-PULSE
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
