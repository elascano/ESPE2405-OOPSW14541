
package ec.edu.espe.quizz.model;

/**
 *
 * @author Saray Cañarte & Christian Bonifaz
 */
public class Cylinder {
    public double radio;
    public double height;
    public double area;

    public Cylinder(double radio, double height, double area) {
        this.radio = radio;
        this.height = height;
        this.area = area;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
    
}
