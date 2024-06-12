package collections;

import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Collection things;

        Person person1 = new Person(1, "Danny Ayuquina");

        things = new ArrayList();

        things.add(300);
        things.add(3.81F);
        things.add(false);
        things.add("OOP 14541");
        things.add(person1);

        System.out.println(things);
        System.out.println("size of things --> " + things.size());

        things.remove(person1);

        System.out.println(things);
        System.out.println("size of things --> " + things.size());

    }

}
/*
 //Collection of data
        Collection things;
        
        Person person1 = new Person(1, "Danny Ayuquina");
        things = new ArrayList();
        
        things.add(300);
        things.add(3.81F);
        things.add(false);
        things.add("OOP 14541");
        things.add(person1);
        things.add(chicken);
        
        System.out.println("size of things --> "+ things.size());
        System.out.println(things);
        
        things.remove(chicken);
        
        System.out.println("size of things --> "+ things.size());
        System.out.println(things);
*/
