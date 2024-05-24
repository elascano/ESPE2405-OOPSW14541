package ec.edu.espe.farmsimulator.model;
import java.util.Date;
/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean moling;
    private Date bornOnDate;

    public Chicken(int id, String name, String color, int age, boolean moling, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.moling = moling;
        this.bornOnDate = bornOnDate;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", moling=" + moling + ", bornOnDate=" + bornOnDate + '}';
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
     * @return the moling
     */
    public boolean isMoling() {
        return moling;
    }

    /**
     * @param moling the moling to set
     */
    public void setMoling(boolean moling) {
        this.moling = moling;
    }

    /**
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
    
}
