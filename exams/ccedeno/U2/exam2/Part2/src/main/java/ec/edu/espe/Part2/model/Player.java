/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Part2.model;

/**
 *
 * @author G406
 */
public class Player {
    private int id;
    private String name;
    private String description;
    private int goal;
    private int asist;
    private int GA;

    public Player(int id, String name, String description, int goal, int asist, int GA) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.goal = goal;
        this.asist = asist;
        this.GA = GA;
    }
    
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the goal
     */
    public int getGoal() {
        return goal;
    }

    /**
     * @param goal the goal to set
     */
    public void setGoal(int goal) {
        this.goal = goal;
    }

    /**
     * @return the asist
     */
    public int getAsist() {
        return asist;
    }

    /**
     * @param asist the asist to set
     */
    public void setAsist(int asist) {
        this.asist = asist;
    }

    /**
     * @return the GA
     */
    public int getGA() {
        return GA;
    }

    /**
     * @param GA the GA to set
     */
    public void setGA(int GA) {
        this.GA = GA;
    }

}

    
    

    

