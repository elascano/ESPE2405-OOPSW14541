/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.ws21zoo.model;

import java.util.Date;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class Monkey extends Primate{

    public Monkey(int id, String description, Date bornOnDate, char gender, int numberOfBones, Cage cage) {
        super(id, description, bornOnDate, gender, cage, numberOfBones);
    }
    
      public void feed(int quantity, Food food){
        System.out.println("Feeding the monkey with " + quantity + " of " + food);
    } 
}
