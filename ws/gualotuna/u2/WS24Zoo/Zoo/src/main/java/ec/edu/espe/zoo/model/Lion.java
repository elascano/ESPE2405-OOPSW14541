/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class Lion extends Feline{
    
    private boolean mane;

    @Override
    public String toString() {
        return "Lion{" + "mane=" + mane + super.toString() + '}';
    }

    public Lion(boolean mane, int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones, int numberOfLegs) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, numberOfLegs);
        this.mane = mane;
    }

    
    
    
    
    @Override
    public void feed(int food) {
        System.out.println("feeding a Lion");
    }

   
    public void feed(int quantity, Food food){
        System.out.println("feeding the lion with " + quantity + " " + food + "s");
        System.out.println("number of legs " + getNumberOfLegs());
    }
    
    
    /**
     * @return the mane
     */
    public boolean isMane() {
        return mane;
    }

    /**
     * @param mane the mane to set
     */
    public void setMane(boolean mane) {
        this.mane = mane;
    }
    
}
