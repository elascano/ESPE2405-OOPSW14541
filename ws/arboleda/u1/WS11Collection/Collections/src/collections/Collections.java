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
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things;
        Person person = new Person(1, "Abner");
        Chicken chicken = new Chicken(0, "Caludia", "Black", 0, true);
        
        things = new ArrayList();
        
        System.out.println("size of things --> " + things.size());
        
        things.add(300);
        things.add(4.4F);
        things.add(false);
        things.add("OOP 14541");
        things.add(person);
        things.add(chicken);
        things.add(25);
        things.add("Abner");
        things.add(true);
        
        
        
        System.out.println("things --> " + things);
        
        System.out.println("size of things --> " + things.size());
        
        things.remove(person);
        System.out.println("size of things --> " + things.size());
    }
    
}
 