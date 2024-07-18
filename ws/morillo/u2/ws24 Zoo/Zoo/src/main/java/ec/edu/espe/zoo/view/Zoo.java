package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("David's Zoo");
        Cage cageFelines = new Cage(1, " FelinesCage");
        Cage cageMonkeys = new Cage(2, " MonkeysCage");
        Cage cageBirds = new Cage(3, " BirdsCage");
        Cage pool = new Cage(4, " Pool for Shark");
        Food food = new Food(1, " Zebra");
        ArrayList<Animal> animals = new ArrayList<>();
        
        
        Lion lion = new Lion( true, 1, " Lion Alex", new Date(2024, 03, 05), 'm', 206, cageFelines);
        lion.register(cageFelines);
        animals.add(lion);
        lion.Feed(2);
        lion.feed(3, food);
        System.out.println("Lion --> " + lion);
        
        Animal animal;
        
        animal = new Monkey(2, "George", new Date(2024, 05, 03), 'm', 0, cageMonkeys);
        System.out.println("Animal (Monkey) --> " + animal);
        animal.Feed(5);
        animals.add(animal);
        
        animal = new Lion(false, 2, "Lion Alexa", new Date(2024, 05, 03), 'f', 0, cageFelines);
        System.out.println("Animal (Lion) --> " + animal);
        animal.Feed(4);
        animals.add(animal);
        
        Shark shark = new Shark(1, "Dad Shark", new Date(2024, 06, 07), 'm', 0, pool);
        System.out.println("Shark --> " + shark);
        shark.Feed(6);
        animals.add(shark);
        
        
        Eagle eagle = new Eagle(1, "Eagle Arpia", new Date(2021, 05, 06), 'f', 0, cageBirds);
        System.out.println("Eagle --> " + eagle);
        eagle.Feed(2);
        animals.add(eagle);
        
        
        System.out.println("Animals in David's Zoo -->");
        
        for(Animal an1 : animals){
            System.out.println(an1);
        }
    }
}
