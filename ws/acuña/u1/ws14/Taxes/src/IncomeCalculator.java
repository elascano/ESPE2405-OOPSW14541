
import java.util.Scanner;
import static taxes.Income.computeIR;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class IncomeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el Salario: ");
        float salary = scanner.nextFloat();

        float impuesto = computeIR(salary);
        
        System.out.println("El impuesto a la renta es: " + impuesto);
        scanner.close();
    }
}
