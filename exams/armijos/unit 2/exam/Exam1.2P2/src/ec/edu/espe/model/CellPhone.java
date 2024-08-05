/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author G406
 */
public class CellPhone {
    private String id;
    private String name;
    private int storage;
    private int camera;

    public CellPhone(String id, String name, int storage, int camera) {
        this.id = id;
        this.name = name;
        this.storage = storage;
        this.camera = camera;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "CellPhone{" + "id=" + id + ", name=" + name + ", storage=" + storage + ", camera=" + camera + '}';
    }
    
}