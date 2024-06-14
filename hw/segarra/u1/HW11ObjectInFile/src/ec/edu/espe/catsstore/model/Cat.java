/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.catsstore.model;

import com.google.gson.Gson;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class Cat {
    private int id;
    private int age;
    private String color;
    private String name;
    private String race;

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
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    public Cat(int id, int age, String color, String name, String race) {
        this.id = id;
        this.age = age;
        this.color = color;
        this.name = name;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Cat{" + "id=" + id + ", age=" + age + ", color=" + color + ", name=" + name + ", race=" + race + '}';
    }
    
    public String toStringJSON() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
