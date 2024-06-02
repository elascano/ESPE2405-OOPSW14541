package ec.edu.espe.chickenfarmsimlator.view;

import ec.edu.espe.chickenfarmsimlator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        //System.out.println("Hello chickens from Danny Ayuquina");

        Chicken chicken = new Chicken(1, "Lucy", "white and brown", 0, true, new Date());
        //System.out.println("Chicken --> \n" + chicken);

        Short minuend;
        short subtrahend;
        short difference;

        minuend = (short) 70000;
        System.out.println(minuend);

        float addend1 = 1.2F;
        float addend2 = 2.4F;
        float sum;
        sum = addend1 + addend2;
        System.out.println(sum);

        char vowell = '5';
        subtrahend = (short) vowell;
        difference = (short) (minuend - subtrahend);
        System.out.println(subtrahend);

        System.out.println(difference);
    }
}
