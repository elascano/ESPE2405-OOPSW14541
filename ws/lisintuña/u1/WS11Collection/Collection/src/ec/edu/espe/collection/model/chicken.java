/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.collection.model;

/**
 *
 * @author Cristian Lisintuña,Code Creators,DCCO-ESPE
 */
public class chicken {
    private int id;
    private String color;
    private String name;
    private String age;
    private boolean molting;
    private int bornOnYear;
    private int bornOnMonth;
    private int bornOnDay;

    @Override
    public String toString() {
        return "chicken{" + "id=" + id + ", color=" + color + ", name=" + name + ", age=" + age + ", molting=" + molting + ", bornOnYear=" + bornOnYear + ", bornOnMonth=" + bornOnMonth + ", bornOnDay=" + bornOnDay + '}';
    }

    public chicken(int id, String color, String name, String age, boolean molting, int bornOnYear, int bornOnMonth, int bornOnDay) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.age = age;
        this.molting = molting;
        this.bornOnYear = bornOnYear;
        this.bornOnMonth = bornOnMonth;
        this.bornOnDay = bornOnDay;
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
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
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
     * @return the bornOnYear
     */
    public int getBornOnYear() {
        return bornOnYear;
    }

    /**
     * @param bornOnYear the bornOnYear to set
     */
    public void setBornOnYear(int bornOnYear) {
        this.bornOnYear = bornOnYear;
    }

    /**
     * @return the bornOnMonth
     */
    public int getBornOnMonth() {
        return bornOnMonth;
    }

    /**
     * @param bornOnMonth the bornOnMonth to set
     */
    public void setBornOnMonth(int bornOnMonth) {
        this.bornOnMonth = bornOnMonth;
    }

    /**
     * @return the bornOnDay
     */
    public int getBornOnDay() {
        return bornOnDay;
    }

    /**
     * @param bornOnDay the bornOnDay to set
     */
    public void setBornOnDay(int bornOnDay) {
        this.bornOnDay = bornOnDay;
    }
            
}