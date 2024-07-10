/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Enzo Armijos,Logic Legion, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    private Date bornOnDate;

    public Chicken(int id, String name, String color, boolean molting, Date bornOnDate, int ageInYears) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.molting = molting;
        this.bornOnDate = bornOnDate;
        this.age = calculateAge();
    }

    public int calculateAge() {
        Date currentDate = new Date();
        int age = currentDate.getYear() - bornOnDate.getYear();
        if (currentDate.getMonth() < bornOnDate.getMonth() || 
            (currentDate.getMonth() == bornOnDate.getMonth() && currentDate.getDate() < bornOnDate.getDate())) {
            age--;
        }
        return age;
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

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
    
    
    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + ", bornOnDate=" + bornOnDate + '}';
    }
}
    

