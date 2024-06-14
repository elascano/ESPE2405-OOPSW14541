
package ec.edu.espe.farmsimulator.model;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private String age;
    private boolean molting;
    private int bornOnYear;
    private int bornOnMonth;
    private int bornOnDay;

    public Chicken(int id, String name, String color, boolean molting, int bornOnYear, int bornOnMonth, int bornOnDay) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.molting = molting;
        this.bornOnYear = bornOnYear;
        this.bornOnMonth = bornOnMonth;
        this.bornOnDay = bornOnDay;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", molting=" + molting + ", bornOnYear=" + bornOnYear + ", bornOnMonth=" + bornOnMonth + ", bornOnDay=" + bornOnDay + '}';
    }

    
    public String toString(int type) {
        String chickenData = "";
        
        if(type == 1){
            chickenData = id + ", " + name + ", " + color + ", " + molting + ", " + bornOnYear + ", " + bornOnMonth + ", " + bornOnDay;
        }
        return chickenData;
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
     * @return the molting
     */
    public boolean isMolting() {
        return molting;
    }

    /**
     * @param molting the molting to set
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
    }

    /**
     * @return the bornOnYear
     */
    public int getBornOnYear() {
        return bornOnYear;
    }

    /**
     * @param bornOnYear the bornOnYear to set
     */
    public void setBornOnYear(int bornOnYear) {
        this.bornOnYear = bornOnYear;
    }

    /**
     * @return the bornOnMonth
     */
    public int getBornOnMonth() {
        return bornOnMonth;
    }

    /**
     * @param bornOnMonth the bornOnMonth to set
     */
    public void setBornOnMonth(int bornOnMonth) {
        this.bornOnMonth = bornOnMonth;
    }

    /**
     * @return the bornOnDay
     */
    public int getBornOnDay() {
        return bornOnDay;
    }

    /**
     * @param bornOnDay the bornOnDay to set
     */
    public void setBornOnDay(int bornOnDay) {
        this.bornOnDay = bornOnDay;
    }
    
}
