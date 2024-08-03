package ec.edu.espe.complexoperation.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class Operation {

    public static float addTwoNumbers(float addend1, float addend2) {
        BigDecimal bd1 = BigDecimal.valueOf(addend1);
        BigDecimal bd2 = BigDecimal.valueOf(addend2);
        BigDecimal sum = bd1.add(bd2);
        return sum.setScale(2, RoundingMode.HALF_UP).floatValue(); 
    }
}

