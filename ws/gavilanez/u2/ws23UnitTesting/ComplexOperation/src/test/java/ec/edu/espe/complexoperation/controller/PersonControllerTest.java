/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.complexoperation.controller;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class PersonControllerTest {
    
    public PersonControllerTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
    }

    /**
     * Test of computeAgeInDays method, of class PersonController.
     */
    @Test
    public void testComputeAgeInDays() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = null;
        int expResult = 0;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of computeAgeInYears method, of class PersonController.
     */
    @Test
    public void testComputeAgeInYears() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = null;
        int expResult = 0;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
