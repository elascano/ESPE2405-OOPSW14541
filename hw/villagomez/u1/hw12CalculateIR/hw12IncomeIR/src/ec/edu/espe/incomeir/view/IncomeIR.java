/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.incomeir.view;

import java.util.Scanner;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class IncomeIR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate of Impuesto a la Renta");
        System.out.println("Enter your monthly salary: ");
        float salary = input.nextFloat();
        
        float taxPerYear = taxes.Income.computeIR(salary);
        
        System.out.println("The annual IR is: " + taxPerYear);
        System.out.println("The monthly IR is: " + taxPerYear/12);
        
        System.out.println("The monthly salary with IR is: " + (salary - (taxPerYear/12)));
        System.out.println("The annual salary with IR is: " + ((salary*12) - taxPerYear));
        
    }
}
