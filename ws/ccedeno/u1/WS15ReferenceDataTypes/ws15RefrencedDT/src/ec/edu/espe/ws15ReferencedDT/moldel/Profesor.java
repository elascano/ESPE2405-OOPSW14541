/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ws15ReferencedDT.moldel;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Profesor {
    private int id;
    private int edad;
    private String name;
    private float salary;

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", edad=" + edad + ", name=" + name + ", salary=" + salary + '}';
    }

    
    
    public Profesor(int id, int edad, String name, float salary) {
        this.id = id;
        this.edad = edad;
        this.name = name;
        this.salary = salary;
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

    
    
}


