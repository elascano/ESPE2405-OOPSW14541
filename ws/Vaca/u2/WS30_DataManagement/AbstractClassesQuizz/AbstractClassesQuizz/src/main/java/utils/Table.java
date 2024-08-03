/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Vaca, DCCO-ESPE
 */
public class Table { // 2
    
    private List columns = new ArrayList<String>();

    public Table() {
    }
    
    /**
     * @return the columns
     */
    public List getColumns() {
        return columns;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(List columns) {
        this.columns = columns;
    }
    
}
