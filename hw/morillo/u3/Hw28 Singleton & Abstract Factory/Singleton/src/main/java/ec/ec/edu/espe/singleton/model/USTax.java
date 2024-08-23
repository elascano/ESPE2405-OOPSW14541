/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ec.edu.espe.singleton.model;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class USTax {

    private static USTax instance;

    private USTax() {
        System.out.println("USTax instancia creada");
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public float salesTotal() {
        System.out.println("Calculando el total de ventas");
        return 0.0f;
    }
}
