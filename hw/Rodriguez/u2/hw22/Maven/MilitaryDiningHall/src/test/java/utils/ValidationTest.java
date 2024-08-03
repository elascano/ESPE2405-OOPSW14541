package utils;
import ec.edu.espe.militarydininghall.model.Commensal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author The Javabandits, DCCO-ESPE
 */
public class ValidationTest {
    
    public ValidationTest() {    }
    
     /**
     * Test of ValidCommensal method, of class commen.
     */
    @Test
    public void testValidCommensalValid() {
        System.out.println("ValidCommensal");
        Commensal commensal = new Commensal( "1752874568", "Carlos", "carlospe@gmail.com", "12345", "Colonel", "publicservan", 0);
        boolean expResult = true;
        boolean result = Validation.ValidCommensal(commensal);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidCommensalnull() {
        System.out.println("ValidCommensal");
        Commensal commensal = null;
        boolean expResult = false;
        boolean result = Validation.ValidCommensal(commensal);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidCommensalnullId() {
        System.out.println("ValidCommensal");
        Commensal commensal = new Commensal( null, "Carlos", "carlospe@homail.com","12346","Colonel","publicservant", 0);
        boolean expResult = false;
        boolean result = Validation.ValidCommensal(commensal);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidCommensalnullName() {
        System.out.println("ValidCommensal");
        Commensal commensal = new Commensal("1752874568", null, "carlospe@homail.com","12346","Colonel","publicservant", 0);
        boolean expResult = false;
        boolean result = Validation.ValidCommensal(commensal);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidCommensalnullEmail() {
        System.out.println("ValidCommensal");
        Commensal commensal = new Commensal( "1752874568", "Carlos", null ,"12346","Colonel","publicservant", 0);
        boolean expResult = false;
        boolean result = Validation.ValidCommensal(commensal);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidCommensalnullPassword() {
        System.out.println("ValidCommensal");
        Commensal commensal = new Commensal( "1752874568", "Carlos", "carlospe@homail.com",null,"Colonel","publicservant", 0);
        boolean expResult = false;
        boolean result = Validation.ValidCommensal(commensal);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidCommensalnullgrade() {
        System.out.println("ValidCommensal");
        Commensal commensal = new Commensal("1752874568", "Carlos", "carlospe@homail.com","12346",null,"publicservant", 0);
        boolean expResult = false;
        boolean result = Validation.ValidCommensal(commensal);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidCommensalnulltype() {
        System.out.println("ValidCommensal");
        Commensal commensal = new Commensal( "1752874568", "Carlos", "carlospe@homail.com","12346","Colonel",null, 0);
        boolean expResult = false;
        boolean result = Validation.ValidCommensal(commensal);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidCommensalAlternatignnull() {
        System.out.println("ValidCommensal");
        Commensal commensal = new Commensal( null, "Carlos", null ,"12346",null,"publicservant", 0);
        boolean expResult = false;
        boolean result = Validation.ValidCommensal(commensal);
        assertEquals(expResult, result);
    }    
    @Test
    public void testValidCommensalAllnull() {
        System.out.println("ValidCommensal");
        Commensal commensal = new Commensal( null, null, null ,null,null,null, 0.0f);
        boolean expResult = false;
        boolean result = Validation.ValidCommensal(commensal);
        assertEquals(expResult, result);
    }
    /**
     * Test of ValidBalance method, of class Validation.
     */
    @Test
    public void testValidBalance() {
        System.out.println("ValidBalance");
        double balance = 0.0;
        boolean expResult = true;
        boolean result = Validation.ValidBalance(balance);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidBalancePositive() {
        System.out.println("ValidBalance");
        double balance = 100.0;
        boolean expResult = true;
        boolean result = Validation.ValidBalance(balance);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidBalanceZero() {
        System.out.println("ValidBalance");
        double balance = 0.0;
        boolean expResult = false;
        boolean result = Validation.ValidBalance(balance);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidBalanceNegative() {
        System.out.println("ValidBalance");
        double balance = -1.0;
        boolean expResult = false;
        boolean result = Validation.ValidBalance(balance);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidBalanceVeryHigh() {
        System.out.println("ValidBalance");
        double balance = 1000000.0;
        boolean expResult = true;
        boolean result = Validation.ValidBalance(balance);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidBalanceVeryLow() {
        System.out.println("ValidBalance");
        double balance = -100000.0;
        boolean expResult = false;
        boolean result = Validation.ValidBalance(balance);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidBalancePositiveDecimals() {
        System.out.println("ValidBalance");
        double balance = 0.0000001;
        boolean expResult = true;
        boolean result = Validation.ValidBalance(balance);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidBalanceNegativeDecimals() {
        System.out.println("ValidBalance");
        double balance = -0.0000001;
        boolean expResult = false;
        boolean result = Validation.ValidBalance(balance);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidBalancePositiveDouble() {
        System.out.println("ValidBalance");
        double balance = Double.MAX_VALUE;
        boolean expResult = true;
        boolean result = Validation.ValidBalance(balance);
        assertEquals(expResult, result);
    }      
    @Test
    public void testValidBalanceNegativeDouble() {
        System.out.println("ValidBalance");
        double balance = -Double.MAX_VALUE;
        boolean expResult = false;
        boolean result = Validation.ValidBalance(balance);
        assertEquals(expResult, result);
    }   
    

    /**
     * Test of validateId method, of class Validation.
     */
    @Test
    public void testValidateId() {
        System.out.println("validateId");
        String idInput = "1752874568";
        boolean expResult = true;
        boolean result = Validation.validateId(idInput);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidateIdwithNegative() {
        System.out.println("validateId");
        String idInput = "-99861";
        boolean expResult = false;
        boolean result = Validation.validateId(idInput);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidateIdwithLetters() {
        System.out.println("validateId");
        String idInput = "cedula";
        boolean expResult = false;
        boolean result = Validation.validateId(idInput);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidateIdwithNegativeandLetters() {
        System.out.println("validateId");
        String idInput = "151fef5";
        boolean expResult = false;
        boolean result = Validation.validateId(idInput);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidateIdVeryLong() {
        System.out.println("validateId");
        String idInput = "175287456888";
        boolean expResult = false;
        boolean result = Validation.validateId(idInput);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidateIdwithVeryShort() {
        System.out.println("validateId");
        String idInput = "1752";
        boolean expResult = false;
        boolean result = Validation.validateId(idInput);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidateIdOnlyZero() {
        System.out.println("validateId");
        String idInput = "0000000000";
        boolean expResult = false;
        boolean result = Validation.validateId(idInput);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidateIdwithInvalidId() {
        System.out.println("validateId");
        String idInput = "1752874556";
        boolean expResult = false;
        boolean result = Validation.validateId(idInput);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidateIdMultipleZeros() {
        System.out.println("validateId");
        String idInput = "1070805809";
        boolean expResult = false;
        boolean result = Validation.validateId(idInput);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidateIdRepeatedDigits() {
        System.out.println("validateId");
        String idInput = "5555555555";
        boolean expResult = false;
        boolean result = Validation.validateId(idInput);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidEmailFormat method, of class Validation.
     */
    @Test
    public void testIsValidEmailFormatGmail() {
        System.out.println("isValidEmailFormat");
        String email = "carlospe0505@gmail.com";
        boolean expResult = true;
        boolean result = Validation.isValidEmailFormat(email);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsValidEmailFormatHotmail() {
        System.out.println("isValidEmailFormat");
        String email = "espaedit@hotmail.com";
        boolean expResult = true;
        boolean result = Validation.isValidEmailFormat(email);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsValidEmailFormatYahoo() {
        System.out.println("isValidEmailFormat");
        String email = "jlascano@yahoo.com";
        boolean expResult = true;
        boolean result = Validation.isValidEmailFormat(email);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsValidEmailFormatOutlook() {
        System.out.println("isValidEmailFormat");
        String email = "carlitos24@outlook.com";
        boolean expResult = true;
        boolean result = Validation.isValidEmailFormat(email);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsValidEmailFormatInvalidDomain() {
        System.out.println("isValidEmailFormat");
        String email = "carlospe@gato.com";
        boolean expResult = false;
        boolean result = Validation.isValidEmailFormat(email);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsValidEmailFormatnoaroba() {
        System.out.println("isValidEmailFormat");
        String email = "pedrov20.gmail.com";
        boolean expResult = false;
        boolean result = Validation.isValidEmailFormat(email);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsValidEmailFormatnoDomain() {
        System.out.println("isValidEmailFormat");
        String email = "pepitoper@.com";
        boolean expResult = false;
        boolean result = Validation.isValidEmailFormat(email);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsValidEmailFormatnoExtension() {
        System.out.println("isValidEmailFormat");
        String email = "carlsope@gmail";
        boolean expResult = false;
        boolean result = Validation.isValidEmailFormat(email);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsValidEmailFormatEmpty() {
        System.out.println("isValidEmailFormat");
        String email = "";
        boolean expResult = false;
        boolean result = Validation.isValidEmailFormat(email);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsValidEmailFormatSpecialCharacters() {
        System.out.println("isValidEmailFormat");
        String email = "carlospe@gmail!!??.com";
        boolean expResult = false;
        boolean result = Validation.isValidEmailFormat(email);
        assertEquals(expResult, result);
    }    
    /**
     * Test of validBoolean method, of class Validation.
     */
       
    
}
