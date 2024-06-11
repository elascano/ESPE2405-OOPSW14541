/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programminglanguages;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class ProgrammingLanguages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tablaDel2(); 
    }

    // Función para imprimir la tabla del 2
    public static void tablaDel2() {
        // Recorremos los números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            // Calculamos el resultado de la multiplicación
            int resultado = 2 * i;
            // Imprimimos el resultado en consola
            System.out.println("2 x" + i + " = " + resultado);
        }
    }
}

