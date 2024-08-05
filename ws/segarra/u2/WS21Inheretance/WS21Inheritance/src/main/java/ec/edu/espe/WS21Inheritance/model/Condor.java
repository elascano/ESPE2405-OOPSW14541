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
public class Condor extends Bird{

    protected String montain;

    public Condor(String montain, int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones, boolean vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
        this.montain = montain;
    }

    @Override
    public void feed(int food) {
        System.out.println("feeding a condor with dead animals");    
    }

    /**
     * @return the montain
     */
    public String getMontain() {
        return montain;
    }

    /**
     * @param montain the montain to set
     */
    public void setMontain(String montain) {
        this.montain = montain;
    }

    @Override
    public String toString() {
        return "Condor{" + "montain=" + montain + super.toString() + '}';
    }
    
    
}
