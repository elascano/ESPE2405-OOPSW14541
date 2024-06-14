package Collections;

import ec.edu.espe.collections.model.Chicken;
import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things;
        Person person = new Person(1, "Domenica");
        Chicken chicken = new Chicken(154, " Kenny", " White");
        
        things = new ArrayList();
        
        System.out.println("size of things -->" + things.size());
        
        things.add(400);
        things.add(3.47);
        things.add(true);
        things.add("OOP 14541");
        things.add(person);
        things.add(chicken);
        
        System.out.println("things -->" + things);
        System.out.println("size of things --> " + things.size());
        
        things.remove(person);
        System.out.println("Size of things --> " + things.size());
        
    }
    
}
