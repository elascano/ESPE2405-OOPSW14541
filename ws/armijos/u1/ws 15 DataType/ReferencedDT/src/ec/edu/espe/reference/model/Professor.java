/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.reference.model;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
 */
public class Professor {

    private int id;
    private String name;
    private float salario;
    private int edad;

    public Professor(int id, String name, float salario, int edad) {
        this.id = id;
        this.name = name;
        this.salario = salario;
        this.edad = edad;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", name=" + name + ", salario=" + salario + ", edad=" + edad + '}';
    }

    
}
