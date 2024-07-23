/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.complexoperations.view;

import ec.edu.espe.complexoperations.controller.Operation;
import ec.edu.espe.complexoperations.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author ASUS
 */

//Localizacion de decisiones de diseño

public class ComplexOperations {
    public static void main(String[] args){
        System.out.println("Welocome to Complex Operations! \nDavid Pantoja");
        
        
        float addend1;
        float addend2;
        float sum;
        
        
        //keyboard input
        addend1=1;
        addend2=2;
        
        sum = Operation.addTwoNumbers(addend1, addend2);
        Operation.printAddition(addend1, addend2, sum);
        
        addend1 = 1.2F;
        addend2 = 2.4F;
        
        sum = Operation.addTwoNumbers(addend1, addend2);
        Operation.printAddition(addend1, addend2, sum);
        
        addend1 = 2.2F;
        addend2 = -1.8F;
        
        sum = Operation.addTwoNumbers(addend1, addend2);
        Operation.printAddition(addend1, addend2, sum);
      
        LocalDate birthDate = LocalDate.parse("2004-12-23");
        int days;
        int years;
        
        days = PersonController.computeAgeInDays(birthDate);
        years = PersonController.computeAgeInYears(birthDate);
     
        System.out.println("David is " + days + " days old");
        System.out.println("Me was born on " + birthDate);
        System.out.println("David is " + years + "years-old");
    }

}
