package taxes;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
//Impuesto que se cobra a la venta
public class Sales {
        public static float computerIva(float taxPercentage, float baseAmont){
            float iva;
            iva = baseAmont * (taxPercentage/100);
            return iva;
        }
        
        public static float computeIce(){
            //TODO
            return 0.0F;
        }
}
