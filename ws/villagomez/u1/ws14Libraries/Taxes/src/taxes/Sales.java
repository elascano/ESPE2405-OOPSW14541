package taxes;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class Sales {
    public static float computeIva(float taxPercentage, float baseAmount){
        float iva;
        //taxPercentage = 15;
        iva = baseAmount * taxPercentage / 100;
        return iva;
    }
    
    public static float computeIce(){
        return 0.0F;
    }
}
