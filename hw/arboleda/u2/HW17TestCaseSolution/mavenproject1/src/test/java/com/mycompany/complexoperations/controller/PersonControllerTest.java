/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.complexoperations.controller;

import java.time.LocalDate;
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
public class PersonControllerTest {
    
    public PersonControllerTest() {
    }
    
    /**
     * Test of computeAgeInDays method, of class PersonController.
     */
    @Test
    public void testComputeAgeInDays() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2002-06-05");
        int expResult = 8069;
        long result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    /**
     * Test of computeAgeInYears method, of class PersonController.
     */
    @Test
    public void testComputeAgeInYears() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2002-06-05");
        int expResult = 22;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
}
