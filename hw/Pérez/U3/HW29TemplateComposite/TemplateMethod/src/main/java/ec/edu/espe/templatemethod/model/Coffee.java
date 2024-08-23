/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.templatemethod.model;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Coffee extends CaffeineBeverage {
     
    void brew() {
        System.out.println("Dripping coffee thorought filter");
    }

    
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    
    public boolean wantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = "N";

        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        return answer;
    }
    
}
