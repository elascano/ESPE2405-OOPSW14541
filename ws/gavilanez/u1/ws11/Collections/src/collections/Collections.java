/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import ec.edu.espe.colections.model.Person;
import ec.edu.espe.colections.model.Chicken;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class Collections {
    
    public static void main(String[] args) {
        Collection things;
        
        Person person = new Person(1, "Kenny");
        Chicken chicken = new Chicken(1, "Blue","Lucy", true,14);
        
        things = new ArrayList<>();
        System.out.println("size of things --->"+ things.size());
        things.add(300);
        things.add(4.2F);
        things.add(true);
        things.add("OPP 14541");
        things.add(person);
        things.add(chicken);
        System.out.println("things--->"+things);
        System.out.println("size of things--->"+things.size());
        things.remove(person);
        things.remove(chicken);
        System.out.println("size of thing---->"+things.size());
      
        
       
        
    }
}
