
package ec.edu.espe.quizz.controller;

import ec.edu.espe.quizz.controller.CylinderAreaController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Saray Cañarte & Christian Bonifaz
 */
public class CylinderAreaControllerTest {
    
    public CylinderAreaControllerTest() {
    }

    /**
     * Test of computeCylinderArea method, of class CylinderAreaController.
     */
    @Test
    public void testComputeCylinderArea1() {
        System.out.println("computeCylinderArea1");
        double radio = -2.0;
        double height = 8.0;
        String expResult = "0.00";
        String result = CylinderAreaController.computeCylinderArea(radio, height);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testComputeCylinderArea2() {
        System.out.println("computeCylinderArea2");
        double radio = 4.05;
        double height = 16.32;
        String expResult = "518.35";
        String result = CylinderAreaController.computeCylinderArea(radio, height);
        assertEquals(expResult, result);
    }
        @Test
    public void testComputeCylinderArea3() {
        System.out.println("computeCylinderArea3");
        double radio = 32.187;
        double height = 5.04;
        String expResult = "7528.67";
        String result = CylinderAreaController.computeCylinderArea(radio, height);
        assertEquals(expResult, result);
    }
        @Test
    public void testComputeCylinderArea4() {
        System.out.println("computeCylinderArea4");
        double radio = 0.05;
        double height = 4.01;
        String expResult = "1.28";
        String result = CylinderAreaController.computeCylinderArea(radio, height);
        assertEquals(expResult, result);
    }
        @Test
    public void testComputeCylinderArea5() {
        System.out.println("computeCylinderArea5");
        double radio = 0.0;
        double height = 28.0;
        String expResult = "0.00";
        String result = CylinderAreaController.computeCylinderArea(radio, height);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testComputeCylinderArea6() {
        System.out.println("computeCylinderArea6");
        double radio = -9.0;
        double height = 2.0;
        String expResult = "0.00";
        String result = CylinderAreaController.computeCylinderArea(radio, height);
        assertEquals(expResult, result);
    }
        @Test
    public void testComputeCylinderArea7() {
        System.out.println("computeCylinderArea7");
        double radio = 42.0;
        double height = 0.32;
        String expResult = "11167.98";
        String result = CylinderAreaController.computeCylinderArea(radio, height);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testComputeCylinderArea8() {
        System.out.println("computeCylinderArea8");
        double radio = 100.32;
        double height = 150.012;
        String expResult = "157791.56";
        String result = CylinderAreaController.computeCylinderArea(radio, height);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testComputeCylinderArea9() {
        System.out.println("computeCylinderArea9");
        double radio = -32.29;
        double height = -32.17;
        String expResult = "0.00";
        String result = CylinderAreaController.computeCylinderArea(radio, height);
        assertEquals(expResult, result);
    }
        @Test
    public void testComputeCylinderArea10() {
        System.out.println("computeCylinderArea10");
        double radio = 4.0;
        double height = 0.0;
        String expResult = "0.00";
        String result = CylinderAreaController.computeCylinderArea(radio, height);
        assertEquals(expResult, result);
    }
}
