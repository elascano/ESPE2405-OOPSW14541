/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.model;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    private USTax(){
        
    }
    public static USTax getInstance(){
        if(instance==null){
            instance = new USTax();
        }
        return instance;
    }
    public float salesTotal(){
        return 12.23f;
    }
}
