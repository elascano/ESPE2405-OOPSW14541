/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection;

import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import ec.edu.espe.chickenfarmsimulator.model.Chicken;
import java.util.Collection;


/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class ws09Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things;
        Person person = new Person(1, " David Pantoja");
        Chicken chicken = new Chicken(1, "David" , "red" , false, 2004, 12, 23);
        
        things = new ArrayList();
        
        
        
        System.out.println("Size at the beginning: " + things.size());

        things.add(1800);
        things.add("hello Quito");
        things.add(505.F);
        things.add(person);
        things.add(true);
        things.add(chicken);
        
        System.out.println("things -->" + things);
        
        System.out.println("size of things -->" + things.size());
        
        things.remove(person);
        
        System.out.println("size of things -->" + things.size());
        

               

    }
    
}
