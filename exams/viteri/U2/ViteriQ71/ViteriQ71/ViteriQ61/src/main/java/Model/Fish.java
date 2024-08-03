/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author G406
 */
public class Fish {
    int id;
    String name;
    String type;
    int age;

    @Override
    public String toString() {
        return "Fish{" + "id=" + id + ", name=" + name + ", type=" + type + ", age=" + age + ", isMale=" + isMale + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public Fish(int id, String name, String type, int age, boolean isMale) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.isMale = isMale;
    }
    boolean isMale;
}
