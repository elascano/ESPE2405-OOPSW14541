package taxes;

/**
 *
 * @author Saray Canarte, Code Creators, DCCO - ESPE
 */
public class Income {
    public static float computeIR(float salary){
        float annualIncome = salary*12;
        float deductibleExpense = 0.0F;
        
        float taxBase= annualIncome - deductibleExpense;
        int taxLevel = findTaxLevel(taxBase);
        
        float basicFractionTax = taxTable[taxLevel][2];
        
        float excessFraction = taxBase - taxTable[taxLevel][0];
        float excessFractionTax = excessFraction * taxTable[taxLevel][3];
        
        float IrTotal = basicFractionTax + excessFractionTax;
        System.out.println("Basic Fraction Tax = " + basicFractionTax);
        System.out.println("Excess Fraction Tax = " + excessFractionTax);
        System.out.println("The total IR based on the salary " + salary + " is --> " + IrTotal);
        
        return IrTotal;
    }
    
    private static final float[][] taxTable = {
        {0, 11902, 0, 0.00f},
        {11902,15159, 0, 0.05f},
        {15159,19682, 163, 0.10f},
        {19682, 26031, 615, 0.12f},
        {26031,34255, 1377, 0.15f},
        {34255,45407, 2611, 0.20f},
        {45407,60450, 4841, 0.25f},
        {60450,80605, 8602, 0.30f},
        {80605,107199, 14648, 0.35f},
        {107199, Float.MAX_VALUE, 23956, 0.37f} 
    };
    
    private static int findTaxLevel(float taxBase) {
        for (int i = 0; i < taxTable.length; i++) {
            if (taxBase >= taxTable[i][0] && taxBase <= taxTable[i][1]) {
                return i;
            }
        }
        return -1; 
    }
}
