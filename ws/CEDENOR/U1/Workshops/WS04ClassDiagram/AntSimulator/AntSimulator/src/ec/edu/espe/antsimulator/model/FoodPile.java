/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Simone Medina, JavaSquad, DCCO-ESPE
 */
public class FoodPile {
    private Cell position;

    @Override
    public String toString() {
        return "FoodPile{" + "position=" + position + ", pileAmount=" + pileAmount + '}';
    }
    private int pileAmount;

    public FoodPile(Cell position, int pileAmount) {
        this.position = position;
        this.pileAmount = pileAmount;
    }
    
    
    public Food yieldFood(int amount){
        Food food = new Food(amount);
        return food;
    
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
