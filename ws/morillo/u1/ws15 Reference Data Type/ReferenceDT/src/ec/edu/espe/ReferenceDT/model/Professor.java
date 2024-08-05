/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ReferenceDT.model;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class Professor {

    private int ID;
    private float salary;
    private int age;
    private String name;

    public Professor(int ID, float salary, int age, String name) {
        this.ID = ID;
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Professor{" + "ID=" + ID + ", salary=" + salary + ", age=" + age + ", name=" + name + '}';
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
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
}
