/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author G406
 */
public class Team {
    private int uniqueId;
    private String name;
    private String description;
    private double attribute1;
    private double attribute2;

    public Team(int uniqueId, String name, String description, double attribute1, double attribute2) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.description = description;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    // Getters y Setters
    public int getUniqueId() { return uniqueId; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getAttribute1() { return attribute1; }
    public double getAttribute2() { return attribute2; }
}

