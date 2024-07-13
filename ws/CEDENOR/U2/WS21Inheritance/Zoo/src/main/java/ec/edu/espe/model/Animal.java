/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.util.Date;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO-ESPE
 */
public abstract class Animal {
    
    private int id;
    private String description;
    private Date bornOnDate;
    private char gender;
    private Cage cage;
    private int numberOfbones;

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", description=" + description + ", bornOnDate=" + bornOnDate + ", gender=" + gender + ", cage=" + cage + ", numberOfbones=" + numberOfbones + '}';
    }

    public Animal(int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfbones) {
        this.id = id;
        this.description = description;
        this.bornOnDate = bornOnDate;
        this.gender = gender;
        this.cage = cage;
        this.numberOfbones = numberOfbones;
    }
    
    public abstract void feed(int food);
    
    public void register(Cage cage){
        System.out.println("");
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the cage
     */
    public Cage getCage() {
        return cage;
    }

    /**
     * @param cage the cage to set
     */
    public void setCage(Cage cage) {
        this.cage = cage;
    }

    /**
     * @return the numberOfbones
     */
    public int getNumberOfbones() {
        return numberOfbones;
    }

    /**
     * @param numberOfbones the numberOfbones to set
     */
    public void setNumberOfbones(int numberOfbones) {
        this.numberOfbones = numberOfbones;
    }
}

