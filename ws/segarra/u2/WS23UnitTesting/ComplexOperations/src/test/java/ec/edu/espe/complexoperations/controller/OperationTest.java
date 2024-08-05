/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.complexoperations.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class OperationTest {

    public OperationTest() {
    }

    /**
     * Test of addTwoNumbers method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        float addend1 = 1;
        float addend2 = 2;
        float expResult = 3.0F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAddOneNegativeNumberAndOnePositive1() {
        System.out.println("addTwoNumbers");
        float addend1 = 1.2F;
        float addend2 = -2.3F;
        float expResult = -1.1F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAddOneNegativeNumberAndOnePositive2() {
        System.out.println("addTwoNumbers");
        float addend1 = 5.4F;
        float addend2 = -3.6F;
        float expResult = 1.8F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAddOneNegativeNumberAndOnePositive3() {
        System.out.println("addTwoNumbers");
        float addend1 = -6.2F;
        float addend2 = 7.7F;
        float expResult = 1.5F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAddTwoNegativeNumbers1() {
        System.out.println("addTwoNumbers");
        float addend1 = -0.9F;
        float addend2 = -5.1F;
        float expResult = -6;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAddTwoNegativeNumbers2() {
        System.out.println("addTwoNumbers");
        float addend1 = -16.3F;
        float addend2 = -1.8F;
        float expResult = -18.1F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAddTwoPositiveNumbers1() {
        System.out.println("addTwoNumbers");
        float addend1 = 3.2F;
        float addend2 = 5.3F;
        float expResult = 8.5F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAddTwoPositiveNumbers2() {
        System.out.println("addTwoNumbers");
        float addend1 = 1.2F;
        float addend2 = 2.3F;
        float expResult = 3.5F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAddTwoPositiveNumbers3() {
        System.out.println("addTwoNumbers");
        float addend1 = 10.2F;
        float addend2 = 0.3F;
        float expResult = 10.5F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAddTwoNegativeNumbers3() {
        System.out.println("addTwoNumbers");
        float addend1 = -16.2F;
        float addend2 = -5.9F;
        float expResult = -22.1F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }
}
