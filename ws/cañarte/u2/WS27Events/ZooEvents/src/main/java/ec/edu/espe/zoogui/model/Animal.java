package ec.edu.espe.zoogui.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Animal {

   
   public int id;
   public String description;
   public Date bornOnDate;
   public String gender;
   public String cage;
   public int numberOfBones;
   public boolean vertebrate;
   public ArrayList<String> food;

    public Animal() {
        id = 0;
        description = "animal";
        bornOnDate = new Date();
        gender = "male";
        cage = "nocage";
        numberOfBones = 0;
        vertebrate = true;
        food = new ArrayList<>();
    } 
    
   public Animal(int id, String description, Date bornOnDate, String gender, String cage, int numberOfBones, boolean vertebrate, ArrayList<String> food) {
        this.id = id;
        this.description = description;
        this.bornOnDate = bornOnDate;
        this.gender = gender;
        this.cage = cage;
        this.numberOfBones = numberOfBones;
        this.vertebrate = vertebrate;
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
     * @return the food
     */
    public ArrayList<String> getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(ArrayList<String> food) {
        this.food = food;
    }
   
   
}
