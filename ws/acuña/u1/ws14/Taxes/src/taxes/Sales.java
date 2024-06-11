
package taxes;

/**
 *
 * @author Marcelo Acuña, LogicLegion
 */
public class Sales {

    public static float computeIva(float taxPercentage, float baseAmount) {
        float iva;
        iva = baseAmount * taxPercentage / 100;
        return iva;
    }

    public static float computeIva() {
        return 0.0F;

    }

}