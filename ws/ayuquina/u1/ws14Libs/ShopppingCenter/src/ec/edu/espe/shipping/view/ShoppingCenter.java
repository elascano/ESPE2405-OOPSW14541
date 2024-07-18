package ec.edu.espe.shipping.view;

import ec.edu.espe.shipping.model.Cellphone;
import taxes.Income;
import taxes.Sales;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class ShoppingCenter {

    public static void main(String[] args) {
        float totalPrice;
        Cellphone cellphone;
        System.out.println("Salario final: "+Income.computeIR(2000));

        cellphone = new Cellphone(0, "motorola", "black", 2000.0F);
        System.out.println(cellphone);
    }

}
