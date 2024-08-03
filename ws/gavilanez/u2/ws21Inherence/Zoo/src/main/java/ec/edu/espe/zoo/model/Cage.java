
package ec.edu.espe.zoo.model;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 * @version 1.0.0
 */
public class Cage {
    private int id;
    private String type;

    public Cage(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cage{" + "id=" + id + ", type=" + type + '}';
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
}