package taxes;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Sales {
    public static float computeIva(float taxPercentage, float baseAmount) {
        float iva;
        iva = baseAmount * taxPercentage / 100;
        return iva;
    }

    public static float computeIce() {
        // TODO
        return 0.0F;
    }
}

