/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author USUARIO
 */
public class Cell {
    private int row;
    private int col;
    
public Cell(int row, int col){
    this.row= row;
    this.col= col;
}      

    @Override
    public String toString() {
        return "Cell{" + "row=" + row + ", col=" + col  + '}';
    }

    
    /**
     * @return the row
     */
    public int row() {
        return getRow();
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }

    
    
}

