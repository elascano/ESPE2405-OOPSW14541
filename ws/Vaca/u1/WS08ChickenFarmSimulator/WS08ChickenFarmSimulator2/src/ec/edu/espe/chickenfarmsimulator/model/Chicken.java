/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarmsimulator.model;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Chicken Model
 * 
 * Author: Luis Vaca, TheJavaBandits, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String color;
    private String name;
    private int age;
    private boolean molting;
    private Date bornOnDate;
    
    public Chicken(int id, String name, String color, int age, boolean molting, Date bornOnDate) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.age = age;
        this.molting = molting;
        this.bornOnDate = bornOnDate;
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + ", bornOnDate=" + sdf.format(bornOnDate) + '}';
    }
}