/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class Lion extends Mammal{

    private boolean mane;

    public Lion(boolean par, int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
        this.mane = mane;
    }

    

    @Override
    public String toString() {
        return "Lion{" + "mane=" + mane + super.toString() +'}';
    }
    
    
    @Override
    public void Feed(int food) {
        System.out.println("feeling the lion wifh"+ food + "mice");
    }

    public void feed(int quality,Food food) {
        System.out.println("feeling the lion wifh"+ quality + "" + food + "(s)");
        System.out.println("number of legs"+ numberOfLegs);
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
