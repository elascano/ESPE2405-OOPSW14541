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
        Cage cageFelines = new Cage(1, "FelinesCage");
        Cage cageMonkeys = new Cage(2, "monkeysCage");
        Cage cageBirds = new Cage(3, "BirdsCage");
        Cage pool = new Cage(4, "Pool for Shark");
        Food food = new Food(1, "Rats");
        ArrayList<Animal> animals = new ArrayList<>();
        
        
        Lion lion = new Lionzines);
        animals.add(lion);
        lion.Feed(2);
        lion.feed(3, food);
        System.out.println("Lion --> " + lion);
        
        Animal animal;
        //animal = new Animal();
        
        animal = new Monkey(2, "bear", new Date(2024, 05, 03), 'f', 0, cageMonkeys);
        animal.Feed(5);
        animals.add(animal);
        System.out.println("Animal (monkey) --> " + animal);
        
        animal = new Lion(false, 2, "Lion Alexa", new Date(2024, 05, 03), 'f', 0, cageFelines);
        animal.Feed(4);
        animals.add(animal);
        System.out.println("Animal (lion) --> " + animal);

        Shark shark = new Shark(1, "Dad Shark", new Date(2024, 06, 07), 'f', 0, pool);
        animal.Feed(6);
        animals.add(shark);
        System.out.println("Animal (shark) --> " + shark);
        
        System.out.println("Animals in David's Zoo --> \n" + animals);
        
        for(Animal an1 : animals){
            System.out.println(an1);
        }
    }
}
