/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuar
 */
public class CalculatorOfCylinderVolumeTest {

    public CalculatorOfCylinderVolumeTest() {
    }

    /**
     * Test of computeVolume method, of class CalculatorOfCylinderVolume.
     */
    @Test
    public void testComputeVolumeInt() {
        System.out.println("Volume: ");
        double radius = 3.00;
        double height = 5.00;
        double expResult = 141.37;
        double result = CalculatorOfCylinderVolume.computeVolume(radius, height);
        assertEquals(expResult, result, 3);

    }

    @Test
    public void testComputeVolumeHeightNegative() {
        System.out.println("Volume: ");
        double radius = 3.00;
        double height = -2.00;
        double expResult = 0.00;
        double result = CalculatorOfCylinderVolume.computeVolume(radius, height);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testComputeVolumeRadiusNegative() {
        System.out.println("Volume: ");
        double radius = -6.00;
        double height = 5.00;
        double expResult = 0.00;
        double result = CalculatorOfCylinderVolume.computeVolume(radius, height);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testComputeVolumeTwoDecimals() {
        System.out.println("Volume: ");
        double radius = 0.2;
        double height = 0.5;
        double expResult = 0.06;
        double result = CalculatorOfCylinderVolume.computeVolume(radius, height);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testComputeVolumeTwoNegatives() {
        System.out.println("Volume: ");
        double radius = -3.0;
        double height = -4.0;
        double expResult = 0;
        double result = CalculatorOfCylinderVolume.computeVolume(radius, height);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testComputeVolumeString() {
        System.out.println("Volume: ");
        double radius = 0.35;
        double height = 4.00;
        double expResult = 1.53;
        double result = CalculatorOfCylinderVolume.computeVolume(radius, height);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testComputeVolumeOnefloatOneInt() {
        System.out.println("Volume: ");
        double radius = 2.11;
        double height = 6.55;
        double expResult = 91.61;
        double result = CalculatorOfCylinderVolume.computeVolume(radius, height);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testComputeVolumeTwoDecimalOf0() {
        System.out.println("Volume: ");
        double radius = 0.5;
        double height = 0.01;
        double expResult = 7.85;
        double result = CalculatorOfCylinderVolume.computeVolume(radius, height);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testComputeVolumeDifferentLvlDecimals() {
        System.out.println("Volume: ");
        double radius = 13.0;
        double height = 5.2;
        double expResult = 2760.83;
        double result = CalculatorOfCylinderVolume.computeVolume(radius, height);
        assertEquals(expResult, result, 1);
    }

}
