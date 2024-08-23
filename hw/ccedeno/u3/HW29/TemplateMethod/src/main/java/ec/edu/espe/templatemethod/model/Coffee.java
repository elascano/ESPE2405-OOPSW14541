package ec.edu.espe.templatemethod.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
