package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public abstract class Animal {

    private int id;
    private String description;
    private Date dateOnborn;
    private char gender;
    private int numberOfBones;
    private Cage cage;
    protected int numberOfLegs;

    public Animal(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        this.id = id;
        this.description = description;
        this.dateOnborn = dateOnborn;
        this.gender = gender;
        this.numberOfBones = numberOfBones;
        this.cage = cage;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", description=" + description + ", dateOnborn=" + dateOnborn + ", gender=" + gender + ", numberOfBones=" + numberOfBones + ", cage=" + cage + '}';
    }

    public abstract void Feed(int food);

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
     * @return the dateOnborn
     */
    public Date getDateOnborn() {
        return dateOnborn;
    }

    /**
     * @param dateOnborn the dateOnborn to set
     */
    public void setDateOnborn(Date dateOnborn) {
        this.dateOnborn = dateOnborn;
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
}
