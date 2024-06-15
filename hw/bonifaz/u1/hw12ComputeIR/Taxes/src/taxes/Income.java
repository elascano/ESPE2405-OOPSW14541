package taxes;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Income {

    public static float computeIR(float salary) {
        float annualSalary = salary * 12;
        float ir = 0F;

        if (annualSalary >= 0 && annualSalary < 11902) {
            ir = annualSalary;

        } else if (annualSalary >= 11902 && annualSalary < 15159) {
            ir = (annualSalary - 11902) * 0.05F;

        } else if (annualSalary >= 15159 && annualSalary < 19682) {
            ir = ((annualSalary - 15159) * 0.1F) + 163;

        } else if (annualSalary >= 19682 && annualSalary < 26031) {
            ir = ((annualSalary - 19682) * 0.12F) + 615;

        } else if (annualSalary >= 26031 && annualSalary < 34255) {
            ir = ((annualSalary - 26031) * 0.15F) + 1377;

        } else if (annualSalary >= 34255 && annualSalary < 45407) {
            ir = ((annualSalary - 34255) * 0.2F) + 2611;

        } else if (annualSalary >= 45407 && annualSalary < 60450) {
            ir = ((annualSalary - 45407) * 0.25F) + 4841;

        } else if (annualSalary >= 60450 && annualSalary < 80605) {
            ir = ((annualSalary - 60450) * 0.3F) + 8602;

        } else if (annualSalary >= 80605 && annualSalary < 107199) {
            ir = ((annualSalary - 80605) * 0.35F) + 14648;

        } else if (annualSalary >= 107199) {
            ir = ((annualSalary - 107199) * 0.37F) + 23956;

        }
        return ir / 12;
    }
}
