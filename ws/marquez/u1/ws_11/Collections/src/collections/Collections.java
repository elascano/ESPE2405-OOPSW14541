/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import ec.edu.espe.collections.model.Chicken;
import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */

public class Collections {
    
    public static void main(String[] args) {
        Collection things;
        
        Person person = new Person(1,"Jenniffer");
        Chicken chicken = new Chicken(3, "Lola");
        
        things = new ArrayList();
        
        System.out.println("size of things --> " + things.size());
        
        things.add(230);
        things.add(1.2F);
        things.add(true);
        things.add("OPP 14541");
        things.add(person);
        things.add(chicken);
        
        System.out.println("things -->" + things);
        
        System.out.println("size of things --> " + things.size());
        
        things.remove(person);
        
        System.out.println("size of things --> " + things.size());
        
        
        
        
    }
}