/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import ec.edu.espe.collections.modell.Chicken;
import ec.edu.espe.collections.modell.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Simone Medina, JavaSquad, DCCO-ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection things;
        Person person = new Person(1, "Nathaly Medina");
        Chicken chicken = new Chicken(2, "Lucy");
        things = new ArrayList();
        System.out.println("size of things --->  "+ things.size());
        things.add(20);
        things.add(3.13F);
        things.add(false);
        things.add("OOP 14541");
        things.add(person);
        things.add("Cadena");
        things.add(123444);
        things.add(chicken);
        
        
        System.out.println("things --> "+ things);
        System.out.println("size of things -->  " +things.size());
        
    }
    
}
