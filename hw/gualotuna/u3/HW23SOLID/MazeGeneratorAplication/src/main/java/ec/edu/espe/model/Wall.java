/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class Wall {
    public int id;
    public char position;

    public Wall(int id, char position) {
        this.id = id;
        this.position = position;
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
     * @return the position
     */
    public char getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(char position) {
        this.position = position;
    }
}
