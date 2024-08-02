/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.complexoperations.controller;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis Vaca, TheJavaBandits, DCCO-ESPE
 */
public class PersonControllerTest {
    
    public PersonControllerTest() {
    }

    @Test
    public void testComputeAgeInDays() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2005-02-26");
        int expResult = 7072;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2005-02-26");
        int expResult = 19;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
}
