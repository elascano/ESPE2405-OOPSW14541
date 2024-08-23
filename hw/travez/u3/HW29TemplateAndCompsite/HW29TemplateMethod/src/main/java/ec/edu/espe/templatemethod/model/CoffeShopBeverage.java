/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.templatemethod.model;

/**
 *
 * @author Ismael Travez, TheJavaBandits, DCCO-ESPE
 */
public abstract class CoffeShopBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourlnCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }
    
    void boilWater(){
        System.out.println("Boiling water");
    }
    
    abstract void brew();
    
    void pourlnCup(){
        System.out.println("Pourling into cup");
    }
    
    abstract void addCondiments();
    
    abstract boolean wantsCondiments();
}
