/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ec.edu.espe.weightunittest.controller.ControllerWeight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeightCalculatorTest {

    @Test
    public void testPositiveMassAndGravityEarth() {
        ControllerWeight calculator = new ControllerWeight();
        double weight = calculator.calculateWeight(10, 9.81);
        assertEquals(98.1, weight, 0.01);
    }

    @Test
    public void testPositiveMassAndGravityMoon() {
        ControllerWeight calculator = new ControllerWeight();
        double weight = calculator.calculateWeight(10, 1.62);
        assertEquals(16.2, weight, 0.01);
    }

    @Test
    public void testPositiveMassAndZeroGravity() {
        ControllerWeight calculator = new ControllerWeight();
        double weight = calculator.calculateWeight(10, 0);
        assertEquals(0, weight, 0.01);
    }

    @Test
    public void testZeroMassAndPositiveGravity() {
        ControllerWeight calculator = new ControllerWeight();
        double weight = calculator.calculateWeight(0, 9.81);
        assertEquals(0, weight, 0.01);
    }

    @Test
    public void testNegativeMassAndPositiveGravityWithError() {
        ControllerWeight calculator = new ControllerWeight();
        double weight = calculator.calculateWeight(-10, 9.81);
        // Error intentional: incorrect expected value
        assertEquals(-97.1, weight, 0.01);
    }

    @Test
    public void testPositiveMassAndNegativeGravityWithError() {
        ControllerWeight calculator = new ControllerWeight();
        double weight = calculator.calculateWeight(10, -9.81);
        // Error intentional: incorrect expected value
        assertEquals(-99.1, weight, 0.01);
    }

    @Test
    public void testNegativeMassAndNegativeGravity() {
        ControllerWeight calculator = new ControllerWeight();
        double weight = calculator.calculateWeight(-10, -9.81);
        assertEquals(98.1, weight, 0.01);
    }

    @Test
    public void testLargeMassAndPositiveGravity() {
        ControllerWeight calculator = new ControllerWeight();
        double weight = calculator.calculateWeight(1_000_000, 9.81);
        assertEquals(9_810_000, weight, 0.01);  
    }

    @Test
    public void testPositiveMassAndLargeGravityWithError() {
        ControllerWeight calculator = new ControllerWeight();
        double weight = calculator.calculateWeight(10, 1_000_000);
        // Error intentional: incorrect expected value
        assertEquals(10_000_001, weight, 0.01);
    }

    @Test
    public void testSmallMassAndGravity() {
        ControllerWeight calculator = new ControllerWeight();
        double weight = calculator.calculateWeight(0.000001, 0.000001);
        assertEquals(1e-12, weight, 0.01);
    }
}
