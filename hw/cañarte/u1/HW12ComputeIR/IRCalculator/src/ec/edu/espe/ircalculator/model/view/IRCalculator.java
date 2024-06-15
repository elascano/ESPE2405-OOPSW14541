
package ec.edu.espe.ircalculator.model.view;

import java.util.Scanner;

/**
 *
 * @author Saray Canarte, Code Creators, DCCO - ESPE
 */
public class IRCalculator {
     public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("IR CALCULATOR: ");
       
       System.out.println("Enter base monthly salary: ");
       float monthlySalary = scanner.nextFloat(); 
       taxes.Income.computeIR(monthlySalary );
         
     }   
}
