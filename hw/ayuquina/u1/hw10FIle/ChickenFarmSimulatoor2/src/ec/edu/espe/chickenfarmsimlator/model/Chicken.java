package ec.edu.espe.chickenfarmsimlator.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Chicken {
    
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    private LocalDate bornOnDate;
    
    public Chicken(int id, String name, String color, boolean molting, LocalDate bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = computeAge(bornOnDate);
        this.molting = molting;
        this.bornOnDate = bornOnDate;
    }
    
    @Override
    public String toString() {
        return "{"
                + "\"id\":" + id
                + ", \"name\":\"" + name + '"'
                + ", \"color\":\"" + color + '"'
                + ", \"age\":" + age
                + ", \"molting\":" + molting
                + ", \"bornOnDate\":\"" + bornOnDate + '"'
                + "}";
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
    public LocalDate getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(LocalDate bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    //Methods
    private int computeAge(LocalDate bornOnDate) {
        LocalDate now = LocalDate.now();
        Period period = Period.between(bornOnDate, now);
        return (period.getYears());
    }
    
}
