package ec.edu.espe.zoo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
} * @author Nahomi Cedeño, codecreators, DCCO-ESPE
 */


public class Animal {
    int id;
    String description;
    Date bornOnDate;
    String gender;
    String cage;
    int numberOfBones;
    boolean vertebrate;
    ArrayList<String> foods;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public int getNumberOfBones() {
        return numberOfBones;
    }

    public void setNumberOfBones(int numberOfBones) {
        this.numberOfBones = numberOfBones;
    }

    public boolean isVertebrate() {
        return vertebrate;
    }

    public void setVertebrate(boolean vertebrate) {
        this.vertebrate = vertebrate;
    }

    public ArrayList<String> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<String> foods) {
        this.foods = foods;
    }
    
    
    
    
}