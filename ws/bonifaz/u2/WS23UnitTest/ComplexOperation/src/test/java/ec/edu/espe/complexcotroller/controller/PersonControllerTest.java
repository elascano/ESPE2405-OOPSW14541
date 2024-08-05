
package ec.edu.espe.complexcotroller.controller;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class PersonControllerTest {
    
    public PersonControllerTest() {
    }

    @Test
    public void testComputeAgeInDays() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2001-11-13");
        long expResult = 8273;
        long result = PersonController.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeAgeInYears() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2001-11-13");
        int expResult = 22;
        int result = PersonController.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
    }
    
}
