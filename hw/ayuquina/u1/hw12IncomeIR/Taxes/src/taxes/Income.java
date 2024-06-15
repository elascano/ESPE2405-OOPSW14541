package taxes;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
//Hacer impuesto a la renta 
public class Income {

    public static float computeIR(float salary) {
        float impuestoALaRenta;
        float annualSalary = salary * 12.0F;
        if (annualSalary < 0) {
            System.out.println("Valor ingresado no válido.");
            return -1.0F;
        } else {
            if (annualSalary <= 11902) {
                System.out.println("No tiene que pagar impuesto.");
            } else {
                if (annualSalary <= 15159) {
                    System.out.println("Impuesto del 5%: " + annualSalary * 0.05F);
                    return impuestoALaRenta = annualSalary * 0.95F;
                } else {
                    if (annualSalary <= 19682) {
                        System.out.println("Impuesto del 10%: " + annualSalary * 0.1F);
                        return impuestoALaRenta = annualSalary * 0.9F;
                    } else {
                        if (annualSalary <= 26031) {
                            System.out.println("Impuesto del 12%: " + annualSalary * 0.12F);
                            return impuestoALaRenta = annualSalary * 0.88F;
                        } else {
                            if (annualSalary <= 34255) {
                                System.out.println("Impuesto del 15%: " + annualSalary * 0.15F);
                                return impuestoALaRenta = annualSalary * 0.85F;
                            } else {
                                if (annualSalary <= 45407) {
                                    System.out.println("Impuesto del 20%: " + annualSalary * 0.2F);
                                    return impuestoALaRenta = annualSalary * 0.8F;
                                } else {
                                    if (annualSalary <= 60407) {
                                        System.out.println("Impuesto del 25%: " + annualSalary * 0.25);
                                        return impuestoALaRenta = annualSalary * 0.75F;
                                    } else {
                                        if (annualSalary <= 80605) {
                                            System.out.println("Impuesto del 30%: " + annualSalary * 0.3F);
                                            return impuestoALaRenta = annualSalary * 0.7F;
                                        } else {
                                            if (annualSalary <= 107199) {
                                                System.out.println("Impuesto del 35%: " + annualSalary * 0.35F);
                                                return impuestoALaRenta = annualSalary * 0.65F;
                                            } else {
                                                System.out.println("Impuesto del 37%: " + annualSalary * 0.37F);
                                                return impuestoALaRenta = annualSalary * 0.63F;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return annualSalary;
    }
}
