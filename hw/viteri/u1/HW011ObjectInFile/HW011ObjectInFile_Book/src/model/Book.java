/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import Taxes.sales;
/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Book {
    private int id;
    private String author;
    private String name;
    private String gender;
    private float pvp;
    private float basePrice;

    public Book(int id, String author, String name, String gender, float basePrice) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.gender = gender;
        this.pvp = pvp;
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", author=" + author + ", name=" + name + ", gender=" + gender + ", basePrice=" + basePrice + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
        this.pvp = basePrice + sales.computeIva(12.0F, basePrice);
    }


    
    
}
