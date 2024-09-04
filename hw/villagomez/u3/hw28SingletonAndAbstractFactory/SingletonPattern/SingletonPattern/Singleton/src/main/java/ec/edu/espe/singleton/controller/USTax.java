/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.controller;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class USTax {
    private  float iva;

    private static USTax instance;

    private USTax() {
        this.iva = 0.15F;
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }else{
            System.out.println("This class is already instanciated");
        }
        return instance;
    }
    
    public float salesTotal(float numberOfProducts, float price){
        return (price*iva*numberOfProducts) + (price*numberOfProducts) ;
    }
}
