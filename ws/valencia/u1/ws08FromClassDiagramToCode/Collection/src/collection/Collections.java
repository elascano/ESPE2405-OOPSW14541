/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection;

import ec.edu.espe.collections.model.Chicken;
import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author USUARIO
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Collection things;
        Person person = new Person (9, "Yuliana");
        Chicken chicken = new Chicken(4, "kuki","black");
        things = new ArrayList();
        
        System.out.println("Size of things --> " +things.size());
        
        things.add(230);
        things.add(5.5F);
        things.add(false);
        things.add("OPP 14541");
        things.add(person);
        things.add(chicken);
        
        System.out.println("things --->" + things);
        
        System.out.println("size of things --> " + things.size());
        
        things.remove(person);
        System.out.println("Size of things -->" + things.size());


    }

}
