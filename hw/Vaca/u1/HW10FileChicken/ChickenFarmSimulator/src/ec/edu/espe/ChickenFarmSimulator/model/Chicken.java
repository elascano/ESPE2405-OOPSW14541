/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ChickenFarmSimulator.model;

/**
 *
 * @author MSI-PULSE
 */
import java.time.LocalDate;

public class Chicken {

    private int id;
    private String color;
    private String name;
    private int age;
    private LocalDate birthDate;

    public Chicken(int id, String color, String name, int age, LocalDate birthDate) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", color=" + color + ", name=" + name + ", age=" + age + ", birthDate=" + birthDate + '}';
    }
}
