/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */
public class FoodPile {
    private Cell position;
    private int pileAmount;
    
    
    public Food yieldFood(int amount){
        Food food= new Food(amount);
        return food;
        
        
    }

    public FoodPile(Cell position, int pileAmount) {
        this.position = position;
        this.pileAmount = pileAmount;
    }
    

    @Override
    public String toString() {
        return "FoodPile{" + "position=" + getPosition() + ", pileAmount=" + getPileAmount() + '}';
    }

    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @return the pileAmount
     */
    public int getPileAmount() {
        return pileAmount;
    }

    /**
     * @param pileAmount the pileAmount to set
     */
    public void setPileAmount(int pileAmount) {
        this.pileAmount = pileAmount;
    }
    
}
