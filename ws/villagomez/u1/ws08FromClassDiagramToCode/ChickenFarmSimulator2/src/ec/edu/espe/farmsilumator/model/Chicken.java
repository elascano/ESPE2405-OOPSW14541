
package ec.edu.espe.farmsilumator.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */

public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    private Date bornOnDate;

    public Chicken(int id, String name, String color, int age, boolean molting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
        this.bornOnDate = bornOnDate;
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

    public static int calculateAge(Date bornOnDate) {
        Calendar birth = Calendar.getInstance();
        birth.setTime(bornOnDate);
        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

        if (today.get(Calendar.MONTH) < birth.get(Calendar.MONTH)
                || (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < birth.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }

        return age;
    }

    @Override
    public String toString() {
        return '}' + "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", molting=" + isMolting() + ", Age: " + getBornOnDate();
    }
    
    public static void inputData(){
        try(Scanner input = new Scanner(System.in)) {
                String continueInput;

                do {
                    int id;
                    String name;
                    String color;
                    boolean molting;
                    String bornOnDateStr; 

                    System.out.println("Enter the ID:");
                    String idStr = input.nextLine();
                    id = Integer.parseInt(idStr);

                    System.out.println("Enter the name:");
                    name = input.nextLine();

                    System.out.println("Enter the color:");
                    color = input.nextLine();

                    System.out.println("Enter if it's molting:");
                    String moltingStr = input.nextLine();
                    molting = Boolean.parseBoolean(moltingStr);

                    System.out.println("Enter the Born On Date: (dd/mm/yyyy)");
                    bornOnDateStr = input.nextLine();
                    Date bornOnDate = null;

                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
                        bornOnDate = dateFormat.parse(bornOnDateStr);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    int age = Chicken.calculateAge(bornOnDate); 

                    Chicken chicken = new Chicken(id, name, color, age, molting, bornOnDate); 
                    
                    FileManager.save(chicken, "chicken", 1);
                    FileManager.save(chicken, "chicken", 2);

                    System.out.println("Chicken --> \n" + chicken);

                    System.out.println("Do you want to enter another chicken? (yes/no):");
                    continueInput = input.nextLine();
                } while (continueInput.equalsIgnoreCase("yes"));

            }
    }
    
    public String toString(int type) {
        String chickenData = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        if(type == 1){
            chickenData = id + ", " + name + ", " + color + ", " + molting + ", " + bornOnDate;
        } 
        if (type == 2){
            return "Chicken{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", color='" + color + '\''
                + ", age=" + age
                + ", molting=" + molting
                + ", bornOnDate=" + dateFormat.format(bornOnDate)
                + '}';
        }   
        return chickenData;
    }
    
}
