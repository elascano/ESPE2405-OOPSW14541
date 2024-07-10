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
public class Condor extends Bird{
   
    private String mountain;

    public Condor(String mountain, int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones) {
        super(id, description, bornOnDate, gender, cage, numberOfBones);
        this.mountain = mountain;
    }

    @Override
    public String toString() {
        return "Condor{" + "mountain=" + mountain + super.toString() + '}';
    }

    /**
     * @return the mountain
     */
    public String getMountain() {
        return mountain;
    }

    /**
     * @param mountain the mountain to set
     */
    public void setMountain(String mountain) {
        this.mountain = mountain;
    }

    @Override
    public void feed(int food) {
        System.out.println("Feeding a Condor with " + food + "punds of meat"); 
    }
    
}