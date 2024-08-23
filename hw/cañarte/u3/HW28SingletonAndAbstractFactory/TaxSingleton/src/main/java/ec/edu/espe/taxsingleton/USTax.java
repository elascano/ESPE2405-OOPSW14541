package ec.edu.espe.taxsingleton;

/**
 *
 * @author Saray Canarte, Code Creators, DCCO-ESPE
 */
public class USTax {
   
    private static USTax instance;
    
    private USTax() {
        //this is the private constructor
    }
    
    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax(); 
        }
        return instance;
    }

    public float calculateSalesTax(float saleAmount) {
        float taxRate = 9.38f/100;
        return saleAmount * taxRate;
    }
    public float calculateTaxplusSale(float saleAmount, float tax){
        float saleTotal = saleAmount + tax;
        return saleTotal;
     }
}

