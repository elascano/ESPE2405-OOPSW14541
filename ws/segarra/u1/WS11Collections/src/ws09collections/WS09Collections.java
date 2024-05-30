/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws09collections;

import ec.edu.espe.collections.model.Chicken;
import ec.edu.espe.collections.model.Persona;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class WS09Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things;
        Persona person = new Persona(1, "Eduardo Segarra");
        Chicken hen = new Chicken(20, "black", "Lucy", "20/10/2022", true, 1, 10, 26);
        
        things = new ArrayList<>();
        
        System.out.println("size of the thing --> " + things.size());
        
        things.add(48213);
        things.add(31515.15);
        things.add(false);
        things.add("Bye World");
        things.add(person);
        things.add(hen);
        
        System.out.println("things --> " + things);
        System.out.println("size of the thing --> " + things.size());
        
        things.remove(person);
        things.remove(hen);
        
        System.out.println("size of the thing --> " + things.size());
    }
    
}
