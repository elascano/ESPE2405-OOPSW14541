/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.complexoperations.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class OperationsTest {
    
    public OperationsTest() {
    }

    /**
     * Test of addTwoNumbers method, of class Operations.
     */
    @Test
    public void testAddTwoNumbersOneNegative() {
        System.out.println("addTwoNumbers");
        float addend1 = 1.8F;
        float addend2 = 2.4F;
        float expResult = 4.2F;
        float result = Operations.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testAddTwoNumbersPositive() {
        System.out.println("addTwoNumbers");
        float addend1 = 2.2F;
        float addend2 = -1.8F;
        float expResult = 0.4F;
        float result = Operations.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }
    
}
