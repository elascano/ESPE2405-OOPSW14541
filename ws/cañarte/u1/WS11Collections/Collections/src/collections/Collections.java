
package collections;

import ec.edu.espe.collections.model.Chicken;
import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class Collections {
    public static void main (String []args){
        Collection things;
        Person person = new Person (1, "Saray");
        Chicken chicken = new Chicken (77, "Rosca", "White", 2, true);
        
        things = new ArrayList ();
        System.out.println("size of things --> " + things.size());
        
        things.add(170);
        things.add(3.17F);
        things.add(false);
        things.add("OOP 14541");
        things.add(person);
        things.add(chicken);
        
        System.out.println("things --> "+ things);
        System.out.println("size of things --> " + things.size());
        
        things.remove(person);
        System.out.println("things --> "+ things);
        System.out.println("Size of things -->"+ things.size());
        
    } 
    
}
