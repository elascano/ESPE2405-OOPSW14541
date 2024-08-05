/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.HW15Code.model;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class Student {
    private String id;
    private String name;
    private boolean male;
    private int siblings;

    public Student(String id, String name, boolean male, int siblings) {
        this.id = id;
        this.name = name;
        this.male = male;
        this.siblings = siblings;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
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
     * @return the male
     */
    public boolean isMale() {
        return male;
    }

    /**
     * @param male the male to set
     */
    public void setMale(boolean male) {
        this.male = male;
    }

    /**
     * @return the siblings
     */
    public int getSiblings() {
        return siblings;
    }

    /**
     * @param siblings the siblings to set
     */
    public void setSiblings(int siblings) {
        this.siblings = siblings;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", male=" + male + ", siblings=" + siblings + '}';
    }
    
}
