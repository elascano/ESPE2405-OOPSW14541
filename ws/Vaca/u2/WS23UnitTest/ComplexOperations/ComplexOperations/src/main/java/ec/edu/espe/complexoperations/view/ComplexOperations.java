package ec.edu.espe.complexoperations.view;

import ec.edu.espe.complexoperations.controller.Operation;
import ec.edu.espe.complexoperations.controller.PersonController;
import java.time.LocalDate;

public class ComplexOperations {

    public static void main(String[] args) {
        System.out.println("Welcome to Complex Operations! \nLuis Vaca");

        float addend1;
        float addend2;
        float sum;

        addend1 = 1;
        addend2 = 2;

        sum = Operation.addTwoNumbers(addend1, addend2);
        printAddition(addend1, addend2, sum);

        addend1 = 1.2F;
        addend2 = 2.4F;

        sum = Operation.addTwoNumbers(addend1, addend2);
        printAddition(addend1, addend2, sum);

        addend1 = 2.2F;
        addend2 = -1.8F;

        sum = Operation.addTwoNumbers(addend1, addend2);
        printAddition(addend1, addend2, sum);

        LocalDate birthDate = LocalDate.parse("2005-02-26");
        int days;
        int years;

        days = PersonController.computeAgeInDays(birthDate);
        years = PersonController.computeAgeInYears(birthDate);
        System.out.println("Luis is " + days + " days old");
        System.out.println("He was born on " + birthDate);
        System.out.println("Luis is " + years + " year-old");
    }

    private static void printAddition(float addend1, float addend2, float sum) {
        System.out.println("The addition of " + formatFloat(addend1) + " + " + formatFloat(addend2) + " is: " + formatFloat(sum));
    }

    private static String formatFloat(float number) {
        return String.format("%.2f", number); // Cambia el número de decimales aquí
    }
}
