/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.complexoperation.view;

import ec.edu.espe.complexoperation.controller.Operation;

/**
 *
 * @author G406
 */
public class ComplexOperation {

    public static void main(String[] args) {
        System.out.println("Wellcome to complex operations!! c: \nIsmael Travez");
        float addend1, addend2, sum;
        
        //keyboard input
        addend1 = 1;
        addend2 = 2;
        
        sum = Operation.addTwoNumbers(addend1, addend2);
        
        OperationPrinting.printAddition(addend1, addend2, sum);
        
        
        //keyboard input
        addend1 = 1.4F;
        addend2 = 2.3F;
        
        sum = Operation.addTwoNumbers(addend1, addend2);
        
        OperationPrinting.printAddition(addend1, addend2, sum);
        
        
        //keyboard input
        addend1 = 2.4F;
        addend2 = 1.3F;
        
        sum = Operation.addTwoNumbers(addend1, addend2);
        
        OperationPrinting.printAddition(addend1, addend2, sum);
        

    }


}
