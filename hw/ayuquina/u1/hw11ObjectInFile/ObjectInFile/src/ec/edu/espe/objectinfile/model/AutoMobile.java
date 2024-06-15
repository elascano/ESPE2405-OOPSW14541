package ec.edu.espe.objectinfile.model;

import java.io.Serializable;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class AutoMobile implements Serializable{
    private int id;
    private String typeOfAutoMobile;
    private int numberOfWheels;
    private boolean inMotion;

    public AutoMobile(int id, String typeOfAutoMobile, int numberOfWheels, boolean inMotion) {
        this.id = id;
        this.typeOfAutoMobile = typeOfAutoMobile;
        this.numberOfWheels = numberOfWheels;
        this.inMotion = inMotion;
    }

    @Override
    public String toString() {
        return "AutoMobile{" + "id=" + id + ", typeOfAutoMobile=" + typeOfAutoMobile + ", numberOfWheels=" + numberOfWheels + ", inMotion=" + inMotion + '}';
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfAutoMobile() {
        return typeOfAutoMobile;
    }
    
    public void setTypeOfAutoMobile(String typeOfAutoMobile) {
        this.typeOfAutoMobile = typeOfAutoMobile;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isInMotion() {
        return inMotion;
    }

    public void setInMotion(boolean inMotion) {
        this.inMotion = inMotion;
    }
}
