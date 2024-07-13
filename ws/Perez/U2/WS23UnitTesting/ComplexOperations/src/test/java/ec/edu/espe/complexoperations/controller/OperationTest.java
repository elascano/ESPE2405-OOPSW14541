package ec.edu.espe.complexoperations.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of addTwoNumbers method, of class Operation.
     */
    @Test
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        float addend1 = 4.09F;
        float addend2 = 3.2F;
        float expResult = 7.29F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
@Test
public void testAddOneNegativeNumberAndOnePositive(){
        System.out.println("addTwoNumbers");
        float addend1 = 1.2F;
        float addend2 = -2.3F;
        float expResult = -1.1F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
}
    
}
