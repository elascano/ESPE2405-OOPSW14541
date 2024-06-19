
package taxes;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Sales {
    public static float computeIva(float taxPercentage, float baseAmount){
        float iva;
        iva = baseAmount * taxPercentage / 100;
        return iva;
    }
    public static float computeIce(){
        return 0.0F;
    }
}
