/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.speedcalculator.controller;

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
public class SpeedCalculatorTest {
    
    public SpeedCalculatorTest() {
    }
    
    
    /**
     * Test of calculateSpeed method, of class SpeedCalculator.
     */
    @Test
    public void testCalculateSpeed() {
        System.out.println("calculateSpeed");
        double distance = 8;
        double time = 9;
        SpeedCalculator instance = new SpeedCalculator();
        double expResult = 0.889;
        double result = instance.calculateSpeed(distance, time);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateSpeedDistanceNegativeTimeZero() {
        System.out.println("calculateSpeed");
        double distance = -1;
        double time = 0;
        SpeedCalculator instance = new SpeedCalculator();
        double expResult = 0;
        double result = instance.calculateSpeed(distance, time);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateSpeedDistanceZero() {
        System.out.println("calculateSpeed");
        double distance = 0;
        double time = 1;
        SpeedCalculator instance = new SpeedCalculator();
        double expResult = 0;
        double result = instance.calculateSpeed(distance, time);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateDistanceGraterThanTime() {
        System.out.println("calculateSpeed");
        double distance = 9;
        double time = 8;
        SpeedCalculator instance = new SpeedCalculator();
        double expResult = 1.125;
        double result = instance.calculateSpeed(distance, time);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateSpeedFloats() {
        System.out.println("calculateSpeed");
        double distance = 1.2;
        double time = 3.6;
        SpeedCalculator instance = new SpeedCalculator();
        double expResult = 0.333;
        double result = instance.calculateSpeed(distance, time);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateSpeedNegativeFloats() {
        System.out.println("calculateSpeed");
        double distance = -3.6;
        double time = -8.1;
        SpeedCalculator instance = new SpeedCalculator();
        double expResult = 0;
        double result = instance.calculateSpeed(distance, time);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateSpeedDistanceEqualTime() {
        System.out.println("calculateSpeed");
        double distance = 8;
        double time = 8;
        SpeedCalculator instance = new SpeedCalculator();
        double expResult = 1;
        double result = instance.calculateSpeed(distance, time);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateSpeedDistanceDoubleOfTime() {
        System.out.println("calculateSpeed");
        double distance = 10;
        double time = 5;
        SpeedCalculator instance = new SpeedCalculator();
        double expResult = 2;
        double result = instance.calculateSpeed(distance, time);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateSpeedAnotherFloat() {
        System.out.println("calculateSpeed");
        double distance = 10.5;
        double time = 5.1;
        SpeedCalculator instance = new SpeedCalculator();
        double expResult = 2.059;
        double result = instance.calculateSpeed(distance, time);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateSpeedDistanceNegative() {
        System.out.println("calculateSpeed");
        double distance = -13;
        double time = 4;
        SpeedCalculator instance = new SpeedCalculator();
        double expResult = 0;
        double result = instance.calculateSpeed(distance, time);
        assertEquals(expResult, result, 0);
    }
    
}
