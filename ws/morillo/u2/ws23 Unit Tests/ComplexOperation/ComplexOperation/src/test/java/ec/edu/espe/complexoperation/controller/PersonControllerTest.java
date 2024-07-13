/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.complexoperation.controller;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class PersonControllerTest {
    
    public PersonControllerTest() {
    }

    /**
     * Test of computeAgeInDays method, of class PersonController.
     */
    @Test
    public void testComputeAgeInDays() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2003-11-15");
        int expResult = 7541;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeAgeInYears method, of class PersonController.
     */
    @Test
    public void testComputeAgeInYears() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2003-11-15");
        int expResult = 20;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
