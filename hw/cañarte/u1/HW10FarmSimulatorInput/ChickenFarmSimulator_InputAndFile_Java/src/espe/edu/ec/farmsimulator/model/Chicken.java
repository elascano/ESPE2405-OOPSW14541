
package espe.edu.ec.farmsimulator.model;
/**
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    private String bornOnDate;

    public Chicken(int id, String name, String color, int age, boolean molting, String bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
        this.bornOnDate = bornOnDate;
    }
    
 
    @Override
    public String toString() {
        return "{" + getId()+
                ", " + getName() +
                ", " + getColor()  +
                ", " + getAge() +
                ", " + getisMolting()+
                ", " + getBornOnDate() +
                '}';
    }
    public String toString(int type) {
        String chickenData = "";
           if (type == 0){
            chickenData ="{"
                + "id =" + id
                + ", name = " + name 
                + ", color = " + color
                + ", age =" + age
                + ", molting = " + molting
                + ", bornOnDate =" + bornOnDate 
                + '}';
            
        }
        if (type == 1){
            chickenData = id +
                ", " + name +
                ", " + color  +
                ", " + age +
                ", " + molting +
                ", " + bornOnDate;
        }
        
        if (type ==2){
            chickenData = "{"
                + "\"id\":" + id
                + ", \"name\":\"" + name + '"'
                + ", \"color\":\"" + color + '"'
                + ", \"age\":" + age
                + ", \"molting\":" + molting
                + ", \"bornOnDate\":\"" + bornOnDate + '"'
                + '}';
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
     * @return the molting
     */
    public boolean getisMolting() {
        return molting;
    }
    /**
     * @param molting the molting to set
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
    }

    /**
     * @return the bornOnDate
     */
    public String getBornOnDate() {
        return bornOnDate;
    }
    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(String bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
    
}
