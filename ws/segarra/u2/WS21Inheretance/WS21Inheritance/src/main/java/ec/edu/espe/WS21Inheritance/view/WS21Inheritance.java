/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espe.WS21Inheritance.view;

//import ec.edu.espe.WS21Inheritance.model.*; Pa importar todo
import ec.edu.espe.WS21Inheritance.model.Animal;
import ec.edu.espe.WS21Inheritance.model.Cage;
import ec.edu.espe.WS21Inheritance.model.Food;
import ec.edu.espe.WS21Inheritance.model.Lion;
import ec.edu.espe.WS21Inheritance.model.Monkey;
import ec.edu.espe.WS21Inheritance.model.Shark;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class WS21Inheritance {

    public static void main(String[] args) {
        System.out.println("Eduardo's Zoo!");

        Cage cageFelines = new Cage(1, "felinesCage");
        Cage cageMonkeys = new Cage(2, "monkeysCage");
        Cage cageBird = new Cage(3, "birdsCage");
        Cage pool = new Cage(4, "shark tank");
        Food food = new Food(1, "fish");
        ArrayList<Animal> animals = new ArrayList<>();

        Lion lion = new Lion(true, 1, "Lion Juancho", new Date(2024, 10, 10), 'm', cageFelines, 300, true);
        lion.register();
        lion.feed(2);
        lion.feed(3, food);
        animals.add(lion);
        System.out.println("lion -->" + lion);

        Animal animal;

        animal = new Monkey(2, "bear", new Date(2024, 10, 10), 'f', cageMonkeys, 0, true);
        animal.feed(5);
        animals.add(animal);
        System.out.println("animal(Monkey) --> " + animal);

        animal = new Lion(false, 3, "Lion Pepe", new Date(2024, 10, 10), 'f', cageFelines, 0, true);
        animal.feed(4);
        animals.add(animal);
        System.out.println("animal(Lion) --> " + animal);

        Shark shark = new Shark(4, "Baby shark", new Date(2024, 10, 10), 'm', pool, 0, true);
        shark.feed(1);
        animals.add(shark);
        System.out.println("Shark --> " + shark);
        
        System.out.println("Animals in my zoo --> \n" + animals);
    }
}
