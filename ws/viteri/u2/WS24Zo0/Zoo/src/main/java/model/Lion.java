/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Lion extends Feline{
    private boolean mane;
    
    public Lion(int id, String description, Date bornOnDate,char gender, int numberOfBones, Cage cage, int par2, boolean vertebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate);
    }

    @Override
    public String toString() {
        return "Lion{" + "mane=" + mane + '}';
    }
    /**
     * @return the mane
     */
    public boolean isMane() {
        return mane;
    }
    public void feed(int food) {
        System.out.println("feeding the lion with "+food+" mice");
    }
    public void feed(int quantity, Food food) {
        System.out.println("feeding the lion with "+food+" mice");
    }

    /**
     * @param mane the mane to set
     */
    public void setMane(boolean mane) {
        this.mane = mane;
    }
    
}
