/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @Yuliana Valencia, Commit Crew, DCCO-ESPE
 *
 */
public class Colony {
    private Nest nest;
    private Ant ants[];
    
    
    public void run (){
        System.out.println("The colony is runnig");
    }

    public Colony(Nest nest, Ant[] ants) {
           this.ants = new Ant[ants.length];
           this.nest = nest;
           this.ants = ants;
}
    @Override
    public String toString() {
        String localAnts = "";
        for (int i=0;i<getAnts().length; i++){
            localAnts = localAnts + getAnts()[i];
        }
            
        return "Colony{" + "nest=" + getNest() + ", ants=" + localAnts + '}';
    }

    /**
     * @return the nest
     */
    public Nest getNest() {
        return nest;
    }

    /**
     * @param nest the nest to set
     */
    public void setNest(Nest nest) {
        this.nest = nest;
    }

    /**
     * @return the ants
     */
    public Ant[] getAnts() {
        return ants;
    }

    /**
     * @param ants the ants to set
     */
    public void setAnts(Ant[] ants) {
        this.ants = ants;
    }


       
        
   
   
    
    
    
}
