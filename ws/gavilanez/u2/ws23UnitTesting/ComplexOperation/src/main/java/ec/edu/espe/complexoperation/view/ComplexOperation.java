/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.complexoperation.view;

import ec.edu.espe.complexoperation.controller.Operation;
import ec.edu.espe.complexoperation.controller.PersonController;
import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class ComplexOperation {
    public static void main(String[] args) {
        System.out.println("welcome to: complex Operation \n Kenny Gavilanez");
        float addend1;
        float addend2;
        float sum;
        
        addend1=1;
        addend2=2;
        
        sum= Operation.addtwoNumbers(addend1, addend2);
        OperationPrinting.printAdditon(addend1,addend2,sum);
        
        addend1=1.4f;
        addend2=2.4f;
        
        sum= Operation.addtwoNumbers(addend1, addend2);
        OperationPrinting.printAdditon(addend1,addend2,sum);
        
        addend1=2.2f;
        addend2=1.8f;
        
        sum= Operation.addtwoNumbers(addend1, addend2);
        OperationPrinting.printAdditon(addend1,addend2,sum);
        
        LocalDate birthDate= LocalDate.parse("1970-12-17");
        int days;
        int years;
        days = PersonController.computeAgeInDays(birthDate);
        years = PersonController.computeAgeInYears(birthDate);
        System.out.println("Kenny is " +days +"days old");
        System.out.println("He was born on "+ birthDate);
        System.out.println("Kenny is " + years + "year-old");
                
    }



}
