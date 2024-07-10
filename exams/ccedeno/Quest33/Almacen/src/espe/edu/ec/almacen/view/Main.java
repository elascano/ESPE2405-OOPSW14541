
package espe.edu.ec.almacen.view;

import espe.edu.ec.alamcen.model.Cellphone;
import utils.CellphoneManager;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) throws IOException {
        CellphoneManager manager = new CellphoneManager();
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Ingrese el ID del celular:");
        String id = scanner.nextLine();
        System.out.println("Ingrese la marca del celular:");
        String brand = scanner.nextLine();
        System.out.println("Ingrese el modelo del celular:");
        String model = scanner.nextLine();
        System.out.println("Ingrese el precio del celular:");
        double price = scanner.nextDouble();

        Cellphone cellphone = new Cellphone(id, brand, model, price);
        manager.addCellphone(cellphone);

       
        manager.saveToFile();

        
        manager.loadFromFile();

        
        manager.displayCellphones();
    }
}

