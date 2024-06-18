/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.catsstore.view;

import ec.edu.espe.catsstore.model.Cat;
import files.managment;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class HW11CatsStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dataCats = "";
        Cat cat = new Cat(0, 3, "Orange and white", "Puss", "Stray");
        
        System.out.println(cat);
        managment.save(cat, "cats.json");
        dataCats = managment.load("cats.json");
        
        System.out.println("Data of the cats: \n" + dataCats);
        
    }
    
}
