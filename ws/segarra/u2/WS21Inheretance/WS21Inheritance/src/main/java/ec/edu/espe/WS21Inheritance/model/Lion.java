/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.WS21Inheritance.model;

import java.util.Date;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class Lion extends Feline{

    boolean mane;

    public Lion(boolean mane, int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones, boolean vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
        this.mane = mane;
    }

    @Override
    public void feed(int food) {
        System.out.println("Feeding a lion");
    }

    @Override
    public String toString() {
        return "Lion{" + "mane=" + mane + super.toString() + '}';
    }
    /*
    @Override
    public void feed(int food){
        System.out.println("feeding the lion with " + food + "mice");
    }
    */
    public void feed(int quantity, Food food){
        System.out.println("feedinf the lion with " + quantity + " " + food + "(s)");
    }
    
}
