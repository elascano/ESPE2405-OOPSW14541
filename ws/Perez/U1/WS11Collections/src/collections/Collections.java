package collections;
import static java.awt.Color.blue;
import java.util.ArrayList;
import java.util.Collection;
import model.Person;
import model.Chicken;
/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Collections {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things;
        Person person = new Person(1,"Carlos");
        Chicken chicken = new Chicken(2,"red","Claudio","5",true);
        things = new ArrayList();
        System.out.println("size of things -->"+things.size());
        things.add (400);
        things.add (3.4F);
        things.add (true);
        things.add ("OOP 14541");
        things.add(person);
        things.add(chicken);
        System.out.println("things -->"+things);
        System.out.println("Chicken -->"+chicken);
        System.out.println("size of things -->"+things.size());
        things.remove(person);
        System.out.println("size of things -->"+things.size());
        
    }
    
}
