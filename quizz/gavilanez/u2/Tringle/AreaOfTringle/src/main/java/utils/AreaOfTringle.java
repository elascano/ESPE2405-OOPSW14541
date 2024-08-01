
package utils;

import java.util.Scanner;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class AreaOfTringle {

    public static void main(String[] args) {
        double base =-1;
        double height = -1;
        double area;
        
        Scanner scanner = new Scanner(System.in);


        while (base < 0) {
            System.out.print("Enter the base of the triangle (positive number): ");
            base = scanner.nextDouble();
            if (base < 0) {
                System.out.println("Error: the base of the triangle must be positive");
            }
        }

        while (height < 0) {
            System.out.print("Enter the height of the triangle (positive number): ");
            height = scanner.nextDouble();
            if (height < 0) {
                System.out.println("Error: the height of the triangle must be positive");
            }
        }

        area = 0.5 * base * height;

        System.out.println("Area of triangle is: " + area);

        scanner.close();
    }
}
