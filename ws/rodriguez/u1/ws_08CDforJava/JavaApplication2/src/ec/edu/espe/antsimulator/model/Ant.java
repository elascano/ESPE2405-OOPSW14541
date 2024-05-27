/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */
public class Ant {
    private Cell position;
    private int weight;
    
     public void run(){
        System.out.println("Ant is running");
        
    }

    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weight=" + weight + '}';
    }

    
    public void carry(Food food){
        System.out.println("This ant is carrying -->" + food);
        
    }
    
     public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
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
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

   
    
    
   
    
    
    
}
