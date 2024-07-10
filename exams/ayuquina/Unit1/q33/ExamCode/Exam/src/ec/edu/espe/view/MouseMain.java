/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import com.google.gson.Gson;
import ec.edu.espe.model.Mouse;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author G406
 */
public class MouseMain {

    public static void main(String[] args) throws FileNotFoundException {
        int id;
        String color;
        boolean inalambric;
        float value;
        
        ArrayList<Mouse> mouses = new ArrayList();
        
        for(int i = 0;i<2;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingreso de propiedades de un Mouse");

            System.out.print("Id: ");
            id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Color: ");
            color = scanner.nextLine();

            System.out.print("Es inalámbrico? (true/false): ");
            inalambric = scanner.nextBoolean();

            System.out.print("Valor: ");
            value = scanner.nextFloat();
            
            Mouse ms = new Mouse(id, color, inalambric, value);
            mouses.add(ms);
        }
        
        
        
        Gson gson = new Gson();
        
//        FileReader reader = new FileReader("jasonFile.json");
//        BufferedReader br = new BufferedReader(reader);
        
        gson.toJson(mouses, Mouse.class);
        
        System.out.println(gson);

    }
}
