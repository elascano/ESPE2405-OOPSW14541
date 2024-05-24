package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    private Date bornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", color=" + color + ", name=" + name + ", age=" + age + ", molting=" + molting + ", bornOnDate=" + bornOnDate + '}';
    }

    public Chicken(int id, String color, String name, int age, boolean molting, Date bornOnDate) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.age = age;
        this.molting = molting;
        this.bornOnDate = bornOnDate;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the molting
     */
    public boolean isMolting() {
        return molting;
    }

    /**
     * @param molting the molting to set
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
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
    
    
}
