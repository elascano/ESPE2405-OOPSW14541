package ec.edu.espe.zoo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Animal {

    private int id;
    private String description;
    private Date bornOnDate;
    private String gender;
    private String cage;
    private int numberOfBones;
    private boolean vertebrate;
    private ArrayList<String> foods;

    public Animal() {
        id = 0;
        description = "aniumal";
        bornOnDate= new Date();
        gender = "male";
        cage = "noncage";
        numberOfBones = 0;
        vertebrate = true;
        foods = new ArrayList<>();
    }

    public Animal(int id, String description, Date bornOnDate, String gender, String cage, int numberOfBones, boolean vertebrate, ArrayList<String> foods) {
        this.id = id;
        this.description = description;
        this.bornOnDate = bornOnDate;
        this.gender = gender;
        this.cage = cage;
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
