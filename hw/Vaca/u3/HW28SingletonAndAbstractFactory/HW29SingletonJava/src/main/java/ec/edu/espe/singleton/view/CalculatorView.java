/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.controller.CalculatorController;
import java.util.Scanner;
/**
 *
 * @author MSI-PULSE
 */


public class CalculatorView {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        CalculatorController controller = new CalculatorController();

        System.out.print("Enter sale amount: ");
        double saleAmount = scanner.nextDouble();

        double total = controller.getTotalSale(saleAmount);
        System.out.println("Total sale amount including tax: $" + total);
    }

    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        view.start();
    }
}