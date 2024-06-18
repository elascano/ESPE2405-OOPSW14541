/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarmsimulator.model;

/**
 * Chicken Model
 *
 * Author: Luis Vaca, MSI-PULSE, DCCO-ESPE
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

    public Chicken(int id, String color, String name, String age, boolean molting, int bornOnYear, int bornOnMonth, int bornOnDay) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.age = age;
        this.molting = molting;
        this.bornOnYear = bornOnYear;
        this.bornOnMonth = bornOnMonth;
        this.bornOnDay = bornOnDay;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

        if (type == 0) {
            chickenData = id + ":" + color + ":" + name + ":" + age + ":" + molting + ":" + bornOnYear + ":" + bornOnMonth + ":" + bornOnDay;
        }
        if (type == 1) {
            chickenData = id + "," + color + "," + name + "," + age + "," + molting + "," + bornOnYear + "," + bornOnMonth + "," + bornOnDay;
        }
        if (type == 2) {
            chickenData = "{"
                    + "\"id\":" + id + ","
                    + "\"color\":\"" + color + "\","
                    + "\"name\":\"" + name + "\","
                    + "\"age\":" + age + ","
                    + "\"molting\":" + molting + ","
                    + "\"bornYear\":" + bornOnYear + ","
                    + "\"bornMonth\":" + bornOnMonth + ","
                    + "\"bornDay\":" + bornOnDay
                    + "}";
        }
        return chickenData;
    }
}