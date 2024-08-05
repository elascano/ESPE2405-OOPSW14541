/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.militarydininghall.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ec.edu.espe.militarydininghall.controller.CloudController;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import javax.swing.table.DefaultTableModel;
import utils.Validation;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
//ESTE ES EL NUEVO
public class DateBook {

    private long id;
    private Map<String, Boolean> reservedDays;

    public DateBook() {
        // It have to be empty for working
    }

    public DateBook(long id, Map<String, Boolean> reservedDays) {
        this.id = id;
        this.reservedDays = reservedDays;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the reservedDays
     */
    public Map<String, Boolean> getReservedDays() {
        return reservedDays;
    }

    /**
     * @param reservedDays the reservedDays to set
     */
    public void setReservedDays(Map<String, Boolean> reservedDays) {
        this.reservedDays = reservedDays;
    }

    public String toJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addDay(String date, boolean assistance) {
        reservedDays.put(date, assistance);
    }

    public void removeDay(String date) {
        reservedDays.remove(date);
    }
    
    public void changeAssistance(String date, boolean assistance){
        removeDay(date);
        addDay(date, assistance);
    }
}
