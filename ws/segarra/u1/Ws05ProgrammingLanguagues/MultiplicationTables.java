/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicationtables;

/**
 *
 * @author eduse
 */
public class MultiplicationTables {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");
            // Iterar desde 1 hasta 10 para cada tabla de multiplicar
            for (int j = 1; j <= 10; j++) {
                // Imprimir el resultado de la multiplicación
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            // Línea en blanco para separar las tablas
            System.out.println();
        }
    }
}