package ec.edu.espe.complexoperations.controler;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ChelooWs
 */
public class OperationTest {
    
    public OperationTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of addTwoNumbers method, of class Operation.
     */
    @org.junit.jupiter.api.Test
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        float addend1 = 1;
        float addend2 = 2;
        float expResult = 3.0F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
      }
    public void testAddTwoNumbersOneNegative() {
        System.out.println("addTwoNumbers");
        float addend1 = -1.0F;
        float addend2 = 2.0F;
        float expResult = 3.0F;
        float result = Operation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");      
        

    }
    
}
