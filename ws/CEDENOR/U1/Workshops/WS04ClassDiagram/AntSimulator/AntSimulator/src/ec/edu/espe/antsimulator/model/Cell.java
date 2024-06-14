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
public class Cell {
    private int row;
    private int col;

    @Override
    public String toString() {
        return "Cell{" + "row=" + row + ", col=" + col + '}';
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
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
