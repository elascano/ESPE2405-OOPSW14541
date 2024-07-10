/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.complexoperations.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
    /**
     * Test of addTwoNumbers method, of class Operation.
     */
    
    @Test
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        float addend1 = 1;
        float addend2 = 2;
        float expResult = 3.0F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
      }
    
    @Test
    public void testAddTwoNumbersOneNegative() {
        System.out.println("addTwoNumbers");
        float addend1 = 1.8F;
        float addend2 = -2.4F;
        float expResult = -0.6F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);   
    }
    
    @Test
    public void testAddTwoNumbersPositive() {
        System.out.println("addTwoNumbers");
        float addend1 = 1.2F;
        float addend2 = 2.4F;
        float expResult = 3.6F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);;      
    }
}