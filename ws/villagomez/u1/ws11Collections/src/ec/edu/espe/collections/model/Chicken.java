package ec.edu.espe.collections.model;


/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    //int age;
    //Date bornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name= " + name + ", color= " + color + '}';
    }

    public Chicken(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
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
}
