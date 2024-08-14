/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

/**
 *
* @author Nahomi Cedeño, CodeCreators, DCCO-ESPE
 */
public class Wall {
    private boolean isSolid;

    public Wall() {
        this.isSolid = true; 
    }

    public void breakWall() {
        isSolid = false; 
    }

    public boolean isSolid() {
        return isSolid;
    }
}
