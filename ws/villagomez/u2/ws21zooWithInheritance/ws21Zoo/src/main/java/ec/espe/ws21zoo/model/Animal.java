/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.ws21zoo.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public abstract class Animal {

    private int id;
    private String description;
    private Date bornOnDate;
    private char gender;
    private Cage cage;
    private int numberOfBones;
    protected int numberOfLegs;
    
    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", description=" + description + ", bornOnDate=" + bornOnDate + ", gender=" + gender + ", cage=" + cage + ", numberOfBones=" + numberOfBones + '}';
    }

    public Animal(int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones) {
        this.id = id;
        this.description = description;
        this.bornOnDate = bornOnDate;
        this.gender = gender;
        this.cage = cage;
        this.numberOfBones = numberOfBones;
    }

    public abstract void feed(int food);

    public void register(Cage cage) {
        System.out.println("Register the animal ---> " + this.getClass().getSimpleName() + "in cage " + cage);
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
     * @return the numberOfBones
     */
    public int getNumberOfBones() {
        return numberOfBones;
    }

    /**
     * @param numberOfBones the numberOfBones to set
     */
    public void setNumberOfBones(int numberOfBones) {
        this.numberOfBones = numberOfBones;
    }

    public void Feed(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
