package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Danny Ayuquina, Enzo Armijos, LogicLegion, DCCO-ESPE
 */
public class ComputeTest {
    
    public ComputeTest() {
    }

    /**
     * Test of computeVolumeOfCone method, of class Compute.
     */
    @Test
    public void testComputeVolumeOfConeCorrectValue1() {
        System.out.println("computeVolumeOfCone");
        double radio = 2.9;
        double height = 5.0;
        Compute instance = new Compute();
        double expResult = 44.03;
        double result = instance.computeVolumeOfCone(radio, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testComputeVolumeOfConeCorrectValue2() {
        System.out.println("computeVolumeOfCone");
        double radio = 1.7;
        double height = 9.8;
        Compute instance = new Compute();
        double expResult = 29.65;
        double result = instance.computeVolumeOfCone(radio, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testComputeVolumeOfConeCeroTimesCero() {
        System.out.println("computeVolumeOfCone");
        double radio = 0.0;
        double height = 0.0;
        Compute instance = new Compute();
        double expResult = 0.0;
        double result = instance.computeVolumeOfCone(radio, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testComputeVolumeOfConeCeroTimesANumber() {
        System.out.println("computeVolumeOfCone");
        double radio = 0.0;
        double height = 7.7;
        Compute instance = new Compute();
        double expResult = 0.0;
        double result = instance.computeVolumeOfCone(radio, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testComputeVolumeOfConeANumberTimesCero() {
        System.out.println("computeVolumeOfCone");
        double radio = 5.4;
        double height = 0.0;
        Compute instance = new Compute();
        double expResult = 0.0;
        double result = instance.computeVolumeOfCone(radio, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testComputeVolumeOfConeNegativeNumbers() {
        System.out.println("computeVolumeOfCone");
        double radio = -2.3;
        double height = -1;
        Compute instance = new Compute();
        double expResult = 0;
        double result = instance.computeVolumeOfCone(radio, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testComputeVolumeOfConeRadioNegativeNumber() {
        System.out.println("computeVolumeOfCone");
        double radio = -8;
        double height = 4.5;
        Compute instance = new Compute();
        double expResult = 0.0;
        double result = instance.computeVolumeOfCone(radio, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testComputeVolumeOfConeHeightNegativeNUmbers() {
        System.out.println("computeVolumeOfCone");
        double radio = 7.5;
        double height = -3;
        Compute instance = new Compute();
        double expResult = 0;
        double result = instance.computeVolumeOfCone(radio, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testComputeVolumeOfConeRoundPeriodicResultToMinor() {
        System.out.println("computeVolumeOfCone");
        double radio = 1/3;
        double height = 4;
        Compute instance = new Compute();
        double expResult = 0.46;
        double result = instance.computeVolumeOfCone(radio, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testComputeVolumeOfConeRoundPeriodicResultToMajor() {
        System.out.println("computeVolumeOfCone");
        double radio = 4;
        double height = 2/3;
        Compute instance = new Compute();
        double expResult = 11.17;
        double result = instance.computeVolumeOfCone(radio, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
}
