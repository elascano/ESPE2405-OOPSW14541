/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw23_solid.model;
/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public abstract class AbsRoom implements IRoom {
    protected IWall northWall, southWall, eastWall, westWall;
    protected IDoor door;

    public AbsRoom() {
        System.out.println("Creando habitación...");
        this.northWall = new Wall();
        this.southWall = new Wall();
        this.eastWall = new Wall();
        this.westWall = new Wall();
        this.door = new Door();
    }

    @Override
    public IWall getNorthWall() {
        return northWall;
    }

    @Override
    public IWall getSouthWall() {
        return southWall;
    }

    @Override
    public IWall getEastWall() {
        return eastWall;
    }

    @Override
    public IWall getWestWall() {
        return westWall;
    }

    @Override
    public IDoor getDoor() {
        return door;
    }

    @Override
    public void setDoor(IDoor door) {
        this.door = door;
    }
}