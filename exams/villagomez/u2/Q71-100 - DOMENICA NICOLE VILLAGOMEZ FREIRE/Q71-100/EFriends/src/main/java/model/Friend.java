/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author G406
 */
public class Friend {
    private int id;
    private String name;
    private int age;
    private int moneyPerMonth;

    public Friend(int id, String name, int age, int moneyPerMonth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.moneyPerMonth = moneyPerMonth;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the moneyPerMonth
     */
    public int getMoneyPerMonth() {
        return moneyPerMonth;
    }

    /**
     * @param moneyPerMonth the moneyPerMonth to set
     */
    public void setMoneyPerMonth(int moneyPerMonth) {
        this.moneyPerMonth = moneyPerMonth;
    }
    
    
}
