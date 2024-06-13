/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ir.model;

import IR.IR.ImpuestoRenta;

/**
 *
 * @author Nahomi Cedeno
 */
public class Person {
    private String nombre;
    private double sueldoMensual;

    public Person(String nombre, double sueldoMensual) {
        this.nombre = nombre;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public double getIngresoAnual() {
        return sueldoMensual * 12;
    }

    public double getImpuestoRenta() {
        return ImpuestoRenta.calcularImpuestoRenta(getIngresoAnual());
    }
}

