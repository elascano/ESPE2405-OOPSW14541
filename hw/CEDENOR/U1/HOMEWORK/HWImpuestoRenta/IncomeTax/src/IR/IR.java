
package IR;

/**
 *
 * @author Nahomi Cedeno
 */
public class IR {
    public class ImpuestoRenta {
    private static final double[][] TABLA_IR = {
        {0, 11902, 0, 0.00},
        {11902, 15159, 0, 0.05},
        {15159, 19682, 163, 0.10},
        {19682, 26031, 615, 0.12},
        {26031, 34255, 1377, 0.15},
        {34255, 45407, 2611, 0.20},
        {45407, 60450, 4841, 0.25},
        {60450, 80605, 8602, 0.30},
        {80605, 107199, 14648, 035},
        {107.199, Double.MAX_VALUE, 23956,  0.37}
    };

    public static double calcularImpuestoRenta(double ingresoAnual) {
        for (double[] fila : TABLA_IR) {
            if (ingresoAnual <= fila[1]) {
                return (ingresoAnual - fila[0]) * fila[3] + fila[2];
            }
        }
        return 0;
    }
}
    
}
