/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class OperationsTest {
    
    public OperationsTest() {
    }

    /**
     * Test of addTwoNumbers method, of class Operations.
     */
    @org.junit.jupiter.api.Test
    public void testAddTwoNumbersNegtive() {
        System.out.println("addTwoNumbers");
        float addend1 = 1.8F;
        float addent2 = -2.4F;
        float expResult = -0.6F;
        float result = Operations.addTwoNumbers(addend1, addent2);
        assertEquals(expResult, result, 0);
        
    }
    public void testAddTwoNumbersPositive() {
        System.out.println("addTwoNumbers");
        float addend1 = 1.2F;
        float addent2 = 2.4F;
        float expResult = 3.6F;
        float result = Operations.addTwoNumbers(addend1, addent2);
        assertEquals(expResult, result, 0);
        
    }
    
}
