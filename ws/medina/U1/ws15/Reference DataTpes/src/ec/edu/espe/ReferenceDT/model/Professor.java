/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ReferenceDT.model;

/**
 *
 * @author Simone Medina, JavaSquad, DCCO-ESPE
 */
public class Professor {
    private int id;
    private String name;
    private float salary;
    private int edad;

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", edad=" + edad + '}';
    }

    public Professor(int id, String name, float salary, int edad) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.edad = edad;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
