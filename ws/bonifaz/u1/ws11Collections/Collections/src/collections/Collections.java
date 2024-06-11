package collections;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things;
        Date bornOnDate = new Date();
        Person person = new Person(5, "Christian Bonifaz");
      
        Chicken chicken = new Chicken(4, "Perla", "Brown", 4, true, bornOnDate);
        
        things = new ArrayList();

        System.out.println("size at things --> " + things.size());

        things.add(455);
        things.add(5.4F);
        things.add(false);
        things.add("OOP 14541");
        things.add(person);
        things.add(chicken);

        System.out.println("things --> " + things);
        System.out.println("size of things --> "+things.size());
        
        things.remove(person);
        System.out.println("size of things --> "+things.size());

    }

}
