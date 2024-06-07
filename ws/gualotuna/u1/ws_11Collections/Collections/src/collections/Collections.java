/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import ec.edu.espe.collections.model.Chicken;
import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class Collections {
    
    public static void main(String[] args) {
        Collection things;
        
        Person person = new Person(1,"Brayan");
        
        Chicken chicken = new Chicken(1,"Lucy", 0, "Red", true);
        
        things = new ArrayList();
        
        System.out.println("size of things --> " + things.size());
        
        things.add(23);
        things.add(2.2F);
        things.add(true);
        things.add("Chicken New");
        things.add(chicken);
        
        System.out.println("things -->" + things);
        
        System.out.println("size of things --> " + things.size());
        
        things.remove(chicken);
        
        System.out.println("size of things --> " + things.size());
        
        
        
        
    }
    
    
}
