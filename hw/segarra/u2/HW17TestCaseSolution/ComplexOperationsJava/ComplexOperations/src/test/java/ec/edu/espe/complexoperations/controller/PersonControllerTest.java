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
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class PersonControllerTest {
    
    public PersonControllerTest() {
    }

    @Test
    public void testComputeAgeInDays1() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2004-01-31");
        int expResult = 7464;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears1() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2004-01-31");
        int expResult = 20;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComputeAgeInDays2() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2009-07-27");
        int expResult = 5460;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears2() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2009-07-27");
        int expResult = 14;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComputeAgeInDays3() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("1998-06-29");
        int expResult = 9506;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears3() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("1998-06-29");
        int expResult = 26;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComputeAgeInDays4() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("1972-02-17");
        int expResult = 19135;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears4() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("1972-02-17");
        int expResult = 52;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComputeAgeInDays5() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2012-05-01");
        int expResult = 4451;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears5() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2012-05-01");
        int expResult = 12;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComputeAgeInDays6() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2022-03-30");
        int expResult = 831;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears6() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2022-03-30");
        int expResult = 2;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComputeAgeInDays7() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2005-04-12");
        int expResult = 7027;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears7() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2005-04-12");
        int expResult = 19;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComputeAgeInDays8() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("1983-07-24");
        int expResult = 14960;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears8() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("1983-07-24");
        int expResult = 40;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComputeAgeInDays9() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2016-08-15");
        int expResult = 2884;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears9() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2016-08-15");
        int expResult = 7;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComputeAgeInDays10() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2017-03-16");
        int expResult = 2671;
        int result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears10() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2017-03-16");
        int expResult = 7;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
}
