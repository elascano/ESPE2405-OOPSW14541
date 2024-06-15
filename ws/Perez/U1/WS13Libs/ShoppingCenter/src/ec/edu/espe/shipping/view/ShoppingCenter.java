package ec.edu.espe.shipping.view;

import ec.edu.espe.shipping.model.CellPhone;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class ShoppingCenter {
    public static void main(String[] args) {
        CellPhone cellPhone1;

        cellPhone1 = new CellPhone(0, "motorola", "black", 2000.0F);
        System.out.println("cellPhone --> " + cellPhone1);
    }
}

