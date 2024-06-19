/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package incometaxcalculator.model;

import taxes.Income;

/**
 *
 * @author David Rodriguez, THEJAVABANDITS, DCCO-ESPE
 */

public class Employee {
    private String name;
    private float annualSalary;
    private float monthlySalary;
    private float tax;

    public Employee(String name, float annualSalary) {
        this.name = name;
        this.annualSalary = annualSalary;
        this.monthlySalary = annualSalary / 12.0f;
        this.tax = Income.computeIR(annualSalary);
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(float annualSalary) {
        this.annualSalary = annualSalary;
        this.monthlySalary = annualSalary / 12.0f;
        this.tax = Income.computeIR(annualSalary);
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public float getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', annualSalary=%.2f, monthlySalary=%.2f, tax=%.2f}",
                             name, annualSalary, monthlySalary, tax);
    }
}