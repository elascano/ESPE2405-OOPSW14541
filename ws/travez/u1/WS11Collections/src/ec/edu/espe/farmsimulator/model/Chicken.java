package ec.edu.espe.farmsimulator.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @autor Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class Chicken {

    int id;
    String name;
    String color;
    int age;
    boolean molting;
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
                + ", \"molting\":" + molting
                + ", \"bornOnDate\":\"" + bornOnDate + '"'
                + '}';
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean isMolting() {
        return molting;
    }
    
    public void setMolting(boolean molting) {
        this.molting = molting;
    }

    public LocalDate getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(LocalDate bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
    
    private int computeAge(LocalDate bornOnDate) {
        LocalDate now = LocalDate.now();
        Period period = Period.between(bornOnDate, now);
        return (period.getYears());
    }
    
    public String getNameClass () {
        return ("Chicken");
    }
}
