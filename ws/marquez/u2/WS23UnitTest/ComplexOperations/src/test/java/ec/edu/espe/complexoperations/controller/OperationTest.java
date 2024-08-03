/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.complexoperations.controller;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jenniffer Marquez, JavaSquad, DCCO-ESPE
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of addTwoNumbers method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void
       
        
        testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        float addend1 = 1;
        float addend2 = 2;
        float expResult = 3.0F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of printAddition method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void testPrintAddition() {
        System.out.println("printAddition");
        float addend1 = 1.8F;
        float addend2 = -2.4F;
        float sum = -0.6F;
        Operation.printAddition(addend1, addend2, sum);
    }
    
}
