/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import ed.edu.espe.collection.model.Chicken;
import ed.edu.espe.collection.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things;
        Person person = new Person(9, "David Rodriguez");
        Chicken chicken = new Chicken(2, "Juan");
        things = new ArrayList();

        System.out.println("Size of things --> " + things.size());

        things.add(100);
        things.add(8.8F);
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
