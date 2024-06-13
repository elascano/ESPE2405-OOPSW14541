package ec.edu.espe.objectinfile.model;

import java.io.Serializable;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class Plane implements Serializable{

    private int id;
    private String manufacturer;
    private String model;
    private String type;
    private String airline;

    public Plane(int id, String manufacturer, String model, String type, String airline) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "Plane{" + "id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", type=" + type + ", airline=" + airline + '}';
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
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the airline
     */
    public String getAirline() {
        return airline;
    }

    /**
     * @param airline the airline to set
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

}
