/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class Animal {
    private int id;
    private String description;
    private Date bornOfDate;
    private String gender;
    private String Cage;
    private int numberOfBones;
    private boolean vertebrate;
    private ArrayList<String> foods;

    public Animal() {
        id = 0;
        description = "animal";
        bornOfDate = new Date();
        gender = "male";
        Cage = "nocage";
        numberOfBones = 0;
        vertebrate = true;
        foods = new ArrayList<>();
    }

    public Animal(int id, String description, Date bornOfDate, String gender, String Cage, int numberOfBones, boolean vertebrate, ArrayList<String> foods) {
        this.id = id;
        this.description = description;
        this.bornOfDate = bornOfDate;
        this.gender = gender;
        this.Cage = Cage;
        this.numberOfBones = numberOfBones;
        this.vertebrate = vertebrate;
        this.foods = foods;
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
     * @return the bornOfDate
     */
    public Date getBornOfDate() {
        return bornOfDate;
    }

    /**
     * @param bornOfDate the bornOfDate to set
     */
    public void setBornOfDate(Date bornOfDate) {
        this.bornOfDate = bornOfDate;
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
     * @return the Cage
     */
    public String getCage() {
        return Cage;
    }

    /**
     * @param Cage the Cage to set
     */
    public void setCage(String Cage) {
        this.Cage = Cage;
    }

    /**
     * @return the numberOfBones
     */
    public int getNumberOfBones() {
        return numberOfBones;
    }

    /**
     * @param numberOfBones the nimbreOfBones to set
     */
    public void setNumberOfBones(int numberOfBones) {
        this.numberOfBones = numberOfBones;
    }

    /**
     * @return the vertebrate
     */
    public boolean isVertebrate() {
        return vertebrate;
    }

    /**
     * @param vertebrate the vertebrate to set
     */
    public void setVertebrate(boolean vertebrate) {
        this.vertebrate = vertebrate;
    }

    /**
     * @return the foods
     */
    public ArrayList<String> getFoods() {
        return foods;
    }

    /**
     * @param foods the foods to set
     */
    public void setFoods(ArrayList<String> foods) {
        this.foods = foods;
    }
    
    
}
