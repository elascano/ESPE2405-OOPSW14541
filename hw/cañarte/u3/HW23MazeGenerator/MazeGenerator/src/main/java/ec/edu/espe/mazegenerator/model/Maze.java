/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

/**
 *
 * @author Usuario
 */
public interface Maze {
    
    int getWidth();
    int getHeight();
    Room[][] getRooms();
    
    void generate(int width, int height);
    void setWidth(int width);
    void setHeight(int height);
}
