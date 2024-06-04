/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @Yuliana Valencia, Commit Crew, DCCO-ESPE
 */
public class Ant {
    private Cell position;
    private int weigth;
    
   public void run(){
       System.out.println("Ant is runnig");
   }
 
   public void carry( Food food){
       System.out.println("This ant is carrying --> " + food);
   }
   
    public Ant(Cell position, int weigth) {
        this.position = position;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weigth=" + weigth + '}';
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
     * @return the weigth
     */
    public int getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
         
}
