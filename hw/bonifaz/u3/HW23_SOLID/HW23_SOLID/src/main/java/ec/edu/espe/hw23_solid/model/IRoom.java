/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.hw23_solid.model;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public interface IRoom {
    IWall getNorthWall();
    IWall getSouthWall();
    IWall getEastWall();
    IWall getWestWall();
    IDoor getDoor();
    void setDoor(IDoor door);
}