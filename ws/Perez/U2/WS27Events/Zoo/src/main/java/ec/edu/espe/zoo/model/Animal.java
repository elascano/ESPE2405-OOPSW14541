package ec.edu.espe.zoo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Animal {
    private int id;
    private String description;
    private Date bornOndate;
    private String gender;
    private String cage;
    private int numberOfBones;
    private boolean vertebrate;
    private ArrayList<String> foods;

    /**
     * @return the id
     */
    
    public Animal(int id, String description, Date bornOndate, String gender, String cage, int numberOfBones, boolean vertebrate, ArrayList<String> foods) {
        this.id = id;
        this.description = description;
        this.bornOndate = bornOndate;
        this.gender = gender;
        this.cage = cage;
        this.numberOfBones = numberOfBones;
        this.vertebrate = vertebrate;
        this.foods = foods;
    }
       
    /*
    public Animal() {
        id = 0;
        description = "animal";
        bornOndate = new Date();
        gender = "male";
        cage = "nocage";
        numberOfBones = 0;
        vertebrate = true;
        foods = new ArrayList<String>();
    }
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
     * @return the bornOndate
     */
    public Date getBornOndate() {
        return bornOndate;
    }

    /**
     * @param bornOndate the bornOndate to set
     */
    public void setBornOndate(Date bornOndate) {
        this.bornOndate = bornOndate;
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
