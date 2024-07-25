/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.complexoperations1.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class OperationTest {
    

    /**
     * Test of addtwoNumbers method, of class Operation.
     */
    @Test
    public void testAddtwoNumbers() {
        System.out.println("addtwoNumbers");
        float addend1 = 1.8F;
        float addend2 = 2.2F;
        float expResult = 4.0F;
        float result = Operation.addtwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
        
    }
}
