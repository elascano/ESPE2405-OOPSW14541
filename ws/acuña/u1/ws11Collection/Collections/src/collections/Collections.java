
package collections;

import ec.edu.espe.collections.model.Chicken;
import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things;
        Person person = new Person(1, "Marcelo\n");
        Chicken chicken = new Chicken(0, "Nohelia", "Pink", 2, false);
        
        things = new ArrayList();
        
        System.out.println("size of things --> " + things.size());
        
        things.add(300);
        things.add(4.4F);
        things.add(false);
        things.add("OOP 14541");
        things.add(person);
        
        
        things.add(chicken);
        things.add(77);
        things.add("Marcelo");
        things.add(true);
        
        
        
        System.out.println("things --> " + things);
        
        System.out.println("size of things --> " + things.size());
        
        things.remove(person);
        System.out.println("size of things --> " + things.size());
    }
    
}
 