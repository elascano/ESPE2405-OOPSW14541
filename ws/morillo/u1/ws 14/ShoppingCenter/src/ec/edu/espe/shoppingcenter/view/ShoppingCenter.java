package ec.edu.espe.shoppingcenter.view;

import ec.edu.espe.shoppingcenter.model.CellPhone;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class ShoppingCenter {

    public static void main(String[] args) {
        float totalPrice;
        CellPhone cellPhone;
        cellPhone = new CellPhone(0, "xiaomi", "blue", 2000, 15.0F);
        System.out.println("cellphone ---> " + cellPhone);
    }
}
