/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.IR.model;

import incomeTax.IncomeTax;

public class Persona {
    private String nombre;
    private double salario;

    // Constructor
    public Persona(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para calcular impuesto a la renta y actualizar salario
    public double calcularImpuestoYActualizarSalario() {
        double impuestoRenta = IncomeTax.calcularImpuestoRentaEcuador(this.salario * 12); // Calcula el impuesto anual

        // Resta el impuesto al salario
        double salarioDespuesImpuesto = this.salario - impuestoRenta;

        // Actualiza el salario de la persona
        this.salario = salarioDespuesImpuesto;

        // Retorna el impuesto calculado
        return impuestoRenta;
    }
}
