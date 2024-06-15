/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.payrollmanagement.model;

import taxes.Income;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class Employee {
    private String name;
    private float salary;
    private float iR;

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + ", iR=" + iR + '}';
    }

    public Employee(String name, float salary, float iR) {
        this.name = name;
        this.salary = salary;
        this.iR = Income.computeIR(salary);
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
     * @return the iR
     */
    public float getiR() {
        return iR;
    }

    /**
     * @param iR the iR to set
     */
    public void setiR(float iR) {
        this.iR = Income.computeIR(salary);
    }
    
}
