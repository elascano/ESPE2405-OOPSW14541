package ec.edu.espe.taxsingleton;

import java.util.Scanner;

/**
 *
@author Nahomi Cedeño, Code Creators, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        USTax tax = USTax.getInstance();
        System.out.println("Enter the amount of sales: ");
        float saleAmount = scanner.nextFloat();
        
        float saleTax = tax.calculateSalesTax(saleAmount);
        float saleTotal = tax.calculateTaxplusSale(saleAmount, saleTax);
        
        System.out.println("Taxes for the amount of sales: " + saleTax);
        System.out.println("Total sale: " + saleTotal);
    }
}
