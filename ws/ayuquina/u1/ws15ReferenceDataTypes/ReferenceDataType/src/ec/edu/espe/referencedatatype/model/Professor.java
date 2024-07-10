/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.referencedatatype.model;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Professor {
    int id;
    String name;
    float salary;
    int age;

    public Professor(int id, String name, float salary, int edad) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = edad;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getEdad() {
        return age;
    }

    public void setEdad(int edad) {
        this.age = edad;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", edad=" + age + '}';
    }
    
}
