package ec.edu.espe.beverageapp.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO - ESPE
 */
public class Coffee extends CoffeeinBeverage{


    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean wantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }
    
    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            answer = in.readLine();  
        } catch (IOException e) {
            System.out.println("An error occurred while trying to read your input. Please try again.");
            e.printStackTrace(); 
        }

        return answer;
    }   
  
}
