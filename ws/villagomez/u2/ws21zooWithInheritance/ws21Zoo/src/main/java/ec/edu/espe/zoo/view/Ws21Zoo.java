package ec.edu.espe.zoo.view;

import ec.espe.ws21zoo.model.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class Ws21Zoo {

    public static void main(String[] args) {
        System.out.println("Dome zoo");
        Cage cageFelines = new Cage(1, "felinesCage");
        Cage cageMonkeys = new Cage(2, "monkeysCage");
        Cage cageBirds = new Cage(3, "birdsCage");
        Cage pool = new Cage(4, "type");
        Food food = new Food(1, "Fish");
        ArrayList<Animal> animals = new ArrayList<>();

        Lion lion = new Lion(true, 1, "Lion Patricio", new Date(2024, 10, 10), 'f', 1, cageFelines);
        lion.register(cageFelines);
        animals.add(lion);
        lion.Feed(2);
        lion.feed(3, food);
        System.out.println("Lion --> " + lion);

        Animal animal;
        //animal = new Animal();

        animal = new Monkey(2, "Furry", new Date(2024, 05, 03), 'f', 0, cageMonkeys);
        animal.Feed(5);
        animals.add(animal);
        System.out.println("Animal (monkey) --> " + animal);

        animal = new Lion(false, 2, "Lion Percy", new Date(2024, 05, 03), 'f', 0, cageFelines);
        animal.Feed(4);
        animals.add(animal);
        System.out.println("Animal (lion) --> " + animal);

        Shark shark = new Shark(1, "Dad Shark", new Date(2024, 06, 07), 'f', 0, pool);
        animal.Feed(6);
        animals.add(shark);
        System.out.println("Animal (shark) --> " + shark);

        System.out.println("Animals in Domenica's Zoo --> \n " + animals);

        for (Animal an1 : animals) {
            System.out.println(an1);
        }

    }
}
