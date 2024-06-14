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
public class Colony {
    private Nest nest;
    private Ant[] ants;
    
    public void run(){
        System.out.println("The colony is running");
    }

    public Colony(Nest nest, Ant[] ants) {
        this.ants = new Ant[ants.length];
        this.nest = nest;
        this.ants = ants;
    }

    @Override
    public String toString() {
        String localAnts = "";
        for(int i=0; i<ants.length; i++){
            localAnts = localAnts + ants [i];
        
        }
        return "Colony{" + "nest=" + nest + ", ants=" + localAnts + '}';
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
