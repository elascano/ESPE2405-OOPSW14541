
package ec.edu.espe.objecttofile.model;
import java.io.Serializable;


/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE 
 *
 */

public class Dog implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String name;
    private int age;
    private String color;
    private String breed;

    public Dog(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + ", color=" + color + ", breed=" + breed + "]";
    }
}
