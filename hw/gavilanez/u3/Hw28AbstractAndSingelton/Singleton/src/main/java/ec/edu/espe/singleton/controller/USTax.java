/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.controller;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    private UStax();
    
    public static USTax getInstance(){
        if (instance == null){
            instance = new USTax();
            return instance;
        }
        
        public float salesTotal(){
            
        }
    }
}
