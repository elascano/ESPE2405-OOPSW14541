/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Luis Vaca, TheCommitCrew, DCCO-ESPE
 */
public class Animal {
    private int id;
    private String description;
    private Date bornOnDate;
    private String gender;
    private String cage;
    private int numberOfBones;
    private boolean vetebrate;
    private List<String> food;
    
    public Animal() {
        id = 0;
        description = "animal";
        bornOnDate = new Date();
        gender = "male";
        cage = "nocage";
        numberOfBones = 0;
        vetebrate = true;
        food = new ArrayList<>();
    }

    public Animal(int id, String description, Date bornOnDate, String gender, String cage, int numberOfBones, boolean vetebrate, ArrayList<String> food) {
        this.id = id;
        this.description = description;
        this.bornOnDate = bornOnDate;
        this.gender = gender;
        this.cage = cage;
        this.numberOfBones = numberOfBones;
        this.vetebrate = vetebrate;
        this.food = food;
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
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the cage
     */
    public String getCage() {
        return cage;
    }

    /**
     * @param cage the cage to set
     */
    public void setCage(String cage) {
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

    /**
     * @return the vetebrate
     */
    public boolean isVetebrate() {
        return vetebrate;
    }

    /**
     * @param vetebrate the vetebrate to set
     */
    public void setVetebrate(boolean vetebrate) {
        this.vetebrate = vetebrate;
    }

    /**
     * @return the food
     */
    public List<String> getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(List<String> food) {
        this.food = food;
    }

 
}
