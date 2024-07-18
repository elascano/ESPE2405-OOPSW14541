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
 * @author Cristian Lisintuña
 */
public class Animal {
    private int id;
    private String description;
    private Date bornOnDate;
    private String gender;
    private String cage;
    private int numberofBones;
    private boolean vertebrate;
    private List<String>foods;
    
    
public Animal() {
        id = 0;
        description = "animal";
        bornOnDate = new Date();
        gender = "male";
        cage = "nocage";
        numberofBones = 0;
        vertebrate = true;
        foods = new ArrayList<>();
    }

    public Animal(int id, String description, Date bornOnDate, String gender, String cage, int numberofBones, boolean vertebrate, ArrayList<String> foods) {
        this.id = id;
        this.description = description;
        this.bornOnDate = bornOnDate;
        this.gender = gender;
        this.cage = cage;
        this.numberofBones = numberofBones;
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
     * @return the bornDate
     */
    public Date getBornDate() {
        return bornOnDate;
    }

    /**
     * @param bornDate the bornDate to set
     */
    public void setBornDate(Date bornDate) {
        this.bornOnDate = bornDate;
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
     * @return the numberofBones
     */
    public int getNumberofBones() {
        return numberofBones;
    }

    /**
     * @param numberofBones the numberofBones to set
     */
    public void setNumberofBones(int numberofBones) {
        this.numberofBones = numberofBones;
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
    public List<String> getFoods() {
        return foods;
    }

    /**
     * @param foods the foods to set
     */
    public void setFoods(ArrayList<String> foods) {
        this.foods = foods;
    }
            
    
}
