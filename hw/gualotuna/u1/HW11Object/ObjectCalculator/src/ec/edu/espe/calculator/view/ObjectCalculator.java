/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculator.view;
import ec.edu.espe.calculator.model.Calculator;
/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class ObjectCalculator {
    public static void main(String[] args) {
        
        
        Calculator calculator = new Calculator(1, "Casio", "fx-570", 1000);
        
        System.out.println("calculator ---> " + calculator);
    }
}
