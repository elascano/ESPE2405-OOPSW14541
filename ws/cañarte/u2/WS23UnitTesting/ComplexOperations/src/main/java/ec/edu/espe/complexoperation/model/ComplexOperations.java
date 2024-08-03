
package ec.edu.espe.complexoperation.model;

import ec.edu.espe.complexoperation.controller.Operation;
import ec.edu.espe.complexoperation.view.OperationPrinting;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class ComplexOperations {
    public static void main (String []args){
        System.out.println("Welcome to Complex Operation, Saray Canarte");
        float addend1;
        float addend2;
        float sum;
        
        addend1 = 1;
        addend2 = 2;
        sum = Operation.addTwoNumbers(addend1, addend2);
        OperationPrinting.printAddition(addend1, addend2, sum);
        
                
        addend1 = 1.2F;
        addend2 = 2.4F;
        sum = Operation.addTwoNumbers(addend1, addend2);
        OperationPrinting.printAddition(addend1, addend2, sum);
        
        addend1 = 2.2F;
        addend2 = 1.8F;
        sum = Operation.addTwoNumbers(addend1, addend2);
        OperationPrinting.printAddition(addend1, addend2, sum);
        
        
    }

    
}
