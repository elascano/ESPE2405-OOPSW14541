/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.payrollmanagement.view;

import ec.espe.edu.payrollmanagement.model.Employee;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class PayrollManagementSystem {
    public static void main(String[] args) {
        Employee employee;
        
        employee = new Employee("Alberto", 2000F, 0);
        System.out.println("Employee --> " + employee);
    }
}
