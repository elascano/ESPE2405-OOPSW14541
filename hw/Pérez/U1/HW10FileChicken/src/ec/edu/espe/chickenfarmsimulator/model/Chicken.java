package ec.edu.espe.chickenfarmsimulator.model;

/**
 * Chicken Model
 * 
 * Author: Carlos Pérez, TheJavaBandits, DCCO-ESPE
 */

public class Chicken {
    private int id;
    private String color;
    private String name;
    private String age;
    private boolean molting;
    private int bornOnYear;
    private int bornOnMonth;
    private int bornOnDay;
    
    
    public Chicken(int id, String name, String color, boolean molting, int year, int month, int day) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.molting = molting;
        this.bornOnYear = year;
        this.bornOnMonth = month;
        this.bornOnDay = day;
    }
    
    // Getters and Setters
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isMolting() {
        return molting;
    }
    
    public void setMolting(boolean molting) {
        this.molting = molting;
    }
    
    public int getBornOnYear() {
        return bornOnYear;
    }
    
    public void setBornOnYear(int year) {
        this.bornOnYear = year;
    }
    
    public int getBornOnMonth() {
        return bornOnMonth;
    }
    
    public void setBornOnMonth(int bornOnMonth) {
        this.bornOnMonth = bornOnMonth;
    }
    
    public int getBornOnDay() {
        return bornOnDay;
    }
    
    public void setBornOnDay(int bornOnDay) {
        this.bornOnDay = bornOnDay;
    }
    
    @Override
    public String toString() {
        return '}' + "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", molting=" + isMolting() + ", Age: " + getBornOnYear() + " years, " + getBornOnMonth() + " months and " + getBornOnDay() + " days.";
    }
    
    public String toString(int type) {
        String chickenData = "";
        
        if(type == 1){
            chickenData = id + ", " + name + ", " + color + ", " + molting + ", " + bornOnYear + ", " + bornOnMonth + ", " + bornOnDay;
        }
        return chickenData;
    }
    
}