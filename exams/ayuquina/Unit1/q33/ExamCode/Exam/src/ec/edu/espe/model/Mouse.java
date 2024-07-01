
package ec.edu.espe.model;

/**
 *
 * @author G406
 */
public class Mouse {
    
    
    private int id;
    private String color;
    private boolean inalambric;
    private float value;

    public Mouse(int id, String color, boolean inalambric, float value) {
        this.id = id;
        this.color = color;
        this.inalambric = inalambric;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Mouse{" + "id=" + id + ", color=" + color + ", inalambric=" + inalambric + ", value=" + value + '}';
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
     * @return the inalambric
     */
    public boolean isInalambric() {
        return inalambric;
    }

    /**
     * @param inalambric the inalambric to set
     */
    public void setInalambric(boolean inalambric) {
        this.inalambric = inalambric;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }
    
    
}
