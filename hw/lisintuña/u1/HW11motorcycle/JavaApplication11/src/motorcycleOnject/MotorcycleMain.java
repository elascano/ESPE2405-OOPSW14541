/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motorcycleOnject;

/**
 *
 * @author Cristian Lisintuña
 */
public class MotorcycleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia de Motorcycle
        Motorcycle motorbike = new Motorcycle("Tundra", "Tdx-250 250cc", "2000");

        // Imprimir los datos de la moto
        System.out.print("Brand: " + motorbike.getBrand());
        System.out.print(",Model: " + motorbike.getModel());
        System.out.println(",Year: " + motorbike.getYear());
    }
}
