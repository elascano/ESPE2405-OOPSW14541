/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 * @version 1.0.0
 */
public class Cage {
    int id;
    String type;

    public Cage(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cage{");
        sb.append("id=").append(id);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
