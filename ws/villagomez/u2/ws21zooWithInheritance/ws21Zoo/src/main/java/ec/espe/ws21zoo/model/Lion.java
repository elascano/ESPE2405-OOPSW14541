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
public class Lion extends Feline{
    
    private boolean mane;

    public Lion(boolean mane, int id, String description, Date bornOnDate, char gender, int numberOfBones, Cage cage) {
        super(id, description, bornOnDate, gender, cage, numberOfBones);
        this.mane = mane;
    }

    
    public void feed(int quantity, Food food){
        System.out.println("Feeding the lion with " + quantity + " of " + food);
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

    public void Feed(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
