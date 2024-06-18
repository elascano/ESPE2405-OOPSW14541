package taxes;

/**
 *
 * @author Saray Canarte, Code Creators, DCCO - ESPE
 */
public class Sales {
    public static float computeIVA (float taxPercentaje, float baseAmount){
        float iva;
        iva = baseAmount * taxPercentaje/100;
        return iva;
    }
    
    public static float computeIce (){
        //TODO
        return 0.0F;        
    }
}
