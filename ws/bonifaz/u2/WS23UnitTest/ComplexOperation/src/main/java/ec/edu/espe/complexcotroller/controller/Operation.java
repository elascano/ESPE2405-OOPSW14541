
package ec.edu.espe.complexcotroller.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Operation {


    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = addend1 + addend2;
        BigDecimal bd = new BigDecimal(Float.toString(sum));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
    
}
