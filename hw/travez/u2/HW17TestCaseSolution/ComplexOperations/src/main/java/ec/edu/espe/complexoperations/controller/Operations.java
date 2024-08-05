package ec.edu.espe.complexoperations.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class Operations {

    public static float addTwoNumbers(float addend1, float addend2) {
        float sum;
        DecimalFormat df = new DecimalFormat("#.00");
        sum = (addend1 + addend2);
        BigDecimal bd = new BigDecimal(sum);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        sum = bd.floatValue();
        return sum;
    }

}
