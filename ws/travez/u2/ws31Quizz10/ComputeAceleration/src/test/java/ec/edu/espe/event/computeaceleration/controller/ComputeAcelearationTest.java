/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.event.computeaceleration.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class ComputeAcelearationTest {
    
    public ComputeAcelearationTest() {
    }

    @Test
    public void testComputeAcelerationWithPositivesInputs1() {
        System.out.println("computeAceleration");
        float force = 10.0F;
        float mass = 2.0F;
        float expResult = 5F;
        float result = ComputeAcelearation.computeAceleration(force, mass);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testComputeAcelerationWithPositivesInputs2() {
        System.out.println("computeAceleration");
        float force = 3.0F;
        float mass = 9.0F;
        float expResult = 0.3333F;
        float result = ComputeAcelearation.computeAceleration(force, mass);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testComputeAcelerationWithPositivesInputs3() {
        System.out.println("computeAceleration");
        float force = 27.0F;
        float mass = -3.0F;
        float expResult = 0.0F;
        float result = ComputeAcelearation.computeAceleration(force, mass);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testComputeAcelerationWithNegativeForce1() {
        System.out.println("computeAceleration");
        float force = 26.0F;
        float mass = 9.0F;
        float expResult = 2.888F;
        float result = ComputeAcelearation.computeAceleration(force, mass);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testComputeAcelerationWithNegativeMass1() {
        System.out.println("computeAceleration");
        float force = -10.0F;
        float mass = 5.0F;
        float expResult = 0.0F;
        float result = ComputeAcelearation.computeAceleration(force, mass);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testComputeAcelerationWithPositivesInputs4() {
        System.out.println("computeAceleration");
        float force = 25.0F;
        float mass = 0.5F;
        float expResult = 50.0F;
        float result = ComputeAcelearation.computeAceleration(force, mass);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testComputeAcelerationWithPositivesInputs5() {
        System.out.println("computeAceleration");
        float force = 14.0F;
        float mass = 7.0F;
        float expResult = 2.0F;
        float result = ComputeAcelearation.computeAceleration(force, mass);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testComputeAcelerationWithPositivesInputs6() {
        System.out.println("computeAceleration");
        float force = 22.0F;
        float mass = 4.0F;
        float expResult = 5.5F;
        float result = ComputeAcelearation.computeAceleration(force, mass);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testComputeAcelerationWithPositivesInputs7() {
        System.out.println("computeAceleration");
        float force = 6.0F;
        float mass = 30.0F;
        float expResult = 0.2F;
        float result = ComputeAcelearation.computeAceleration(force, mass);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testComputeAcelerationWithPositivesInputs8() {
        System.out.println("computeAceleration");
        float force = 925.0F;
        float mass = 0.5F;
        float expResult = 1850.0F;
        float result = ComputeAcelearation.computeAceleration(force, mass);
        assertEquals(expResult, result, 0);
    }
    
}
