/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.distancecalculation.controller;

import ec.edu.espe.distancecalculation.model.Distance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Carlos Perez, The Javas, DCCO-ESPE
 */
public class DistanceCalculationTest {

    public DistanceCalculationTest() {
    }

    /**
     * Test of calculateDistance method, of class DistanceCalculation.
     */
    @Test
    public void testCalculateDistance0() {
        System.out.println("calculateDistance0");
        float speed = 45;
        float time = 30;
        float expResult = 1350.0f;
        Distance result = DistanceCalculation.calculateDistance(speed, time);
        assertEquals(expResult, result.getValue(), 0.01);
    }

    @Test
    public void testCalculateDistance1() {
        System.out.println("calculateDistance1");
        float speed = 10;
        float time = 15;
        float expResult = 150.0f;
        Distance result = DistanceCalculation.calculateDistance(speed, time);
        assertEquals(expResult, result.getValue(), 0.01);
    }

    @Test
    public void testCalculateDistance2() {
        System.out.println("calculateDistance2");
        float speed = 0;
        float time = 45;
        float expResult = 0.0f;
        Distance result = DistanceCalculation.calculateDistance(speed, time);
        assertEquals(expResult, result.getValue(), 0.01);
    }

    @Test
    public void testCalculateDistance3() {
        System.out.println("calculateDistance3");
        float speed = 30;
        float time = 60;
        float expResult = 1800.0f;
        Distance result = DistanceCalculation.calculateDistance(speed, time);
        assertEquals(expResult, result.getValue(), 0.01);
    }

    @Test
    public void testCalculateDistance4() {
        System.out.println("calculateDistance4");
        float speed = 60;
        float time = -1;
        float expResult = 0.0f;
        Distance result = DistanceCalculation.calculateDistance(speed, time);
        assertEquals(expResult, result.getValue(), 0.01);
    }

    @Test
    public void testCalculateDistance5() {
        System.out.println("calculateDistance5");
        float speed = 100;
        float time = 0;
        float expResult = 0.0f;
        Distance result = DistanceCalculation.calculateDistance(speed, time);
        assertEquals(expResult, result.getValue(), 0.01);
    }

    @Test
    public void testCalculateDistance6() {
        System.out.println("calculateDistance6");
        float speed = 35.5F;
        float time = 120;
        float expResult = 4260.0f;
        Distance result = DistanceCalculation.calculateDistance(speed, time);
        assertEquals(expResult, result.getValue(), 0.01);
    }

    @Test
    public void testCalculateDistance7() {
        System.out.println("calculateDistance7");
        float speed = 16.01F;
        float time = -30;
        float expResult = 0.0f;
        Distance result = DistanceCalculation.calculateDistance(speed, time);
        assertEquals(expResult, result.getValue(), 0.01);
    }

    @Test
    public void testCalculateDistance8() {
        System.out.println("calculateDistance8");
        float speed = 54.34F;
        float time = 1.001F;
        float expResult = 54.39434f;
        Distance result = DistanceCalculation.calculateDistance(speed, time);
        assertEquals(expResult, result.getValue(), 0.01);
    }

    @Test
    public void testCalculateDistance9() {
        System.out.println("calculateDistance9");
        float speed = -70.0F;
        float time = -21.85F;
        float expResult = 0.0f;
        Distance result = DistanceCalculation.calculateDistance(speed, time);
        assertEquals(expResult, result.getValue(), 0.01);
    }
}


