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
public class Condor extends Bird{

    private String mountain;    

    public Condor(String mountain, int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
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
    public void Feed(int food) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
