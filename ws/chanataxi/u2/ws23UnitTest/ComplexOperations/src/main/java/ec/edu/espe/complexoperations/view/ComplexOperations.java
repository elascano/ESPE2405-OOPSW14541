/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.espe.complexoperations.view;

/**
 *
 * @author Marco Chanataxi, Dev Dynasty, DCCO-ESPE
 */
public class ComplexOperations {

 public class ComplexOperation {

    public static void main(String[] args) {
        System.out.println("Welcome to Complex Operation! \n Marco Chanataxi");
        
        float addend1;
        float addend2;
        float sum;
        
        //keyboar imput
        addend1 = 1;
        addend2 = 2;
        
        sum = addTwoNumbers(addend1, addend2);
        printAdditon(addend1, addend2, sum);
        
        addend1 = 1.2F;
        addend2 = 2.4F;
        
        sum = addTwoNumbers(addend1, addend2);
        printAdditon(addend1, addend2, sum);
        
        addend1 = 2.2F;
        addend2 = -1.8F;
        
        sum = addTwoNumbers(addend1, addend2);
        printAdditon(addend1, addend2, sum);
        
    }

    private static void printAdditon(float addend1, float addend2, float sum) {
        System.out.println("The addition of " + addend1 + " + " + addend2 + " -> " + sum);
    }

    private static float addTwoNumbers(float addend1, float addend2) {
        float sum;
        sum = addend1+addend2;
        return sum;
    }
}
 

}
