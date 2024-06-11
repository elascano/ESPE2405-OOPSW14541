/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import ec.edu.espe.collection.model.Chicken;
import ec.edu.espe.collection.model.Person;
import java.util.Collection;
import java.util.ArrayList;
/**
 *
 * @author Luis Vaca,Code Creators,DCCO-ESPE
 */
public class Collectionsss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection things;
        
        Person persona = new Person(1,"Luis");
        Chicken lucho = new Chicken(1,"Blue","Juan","12",true,2020,3,4);
        
        things = new ArrayList<>();
        
        System.out.println("size of things -->"+ things.size());
        
        things.add(400);
        things.add(3.4F);
        things.add( true);
        things.add("OPP 14541");
        things.add(persona);
        things.add(lucho);
        
        System.out.println("things --> "+ things);
        
        System.out.println("size of things -->"+things.size());
        
        things.remove(persona);
        things.remove(lucho);
        System.out.println("size of things -->"+things.size());
        
        
    }
    
}
