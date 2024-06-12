
package ec.edu.espe.shopping.view;

import ec.edu.espe.shopping.model.CellPhone;

/**
 *
 * @author Christian Acuña, Logic Legion, DCCO-ESPE
 */
public class ShoppingCenter {
    public static void main(String[] args) {
        float totalPrice;
        CellPhone cellPhone;
        
        cellPhone = new CellPhone(0, "Motorola", "Black", 2000.0F);
        System.out.println("cellPhone --> " + cellPhone);
    }
}
