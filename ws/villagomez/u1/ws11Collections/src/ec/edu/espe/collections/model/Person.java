package ec.edu.espe.collections.model;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class Person {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Person{" + "id= " + id + ", name= " + name + '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
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
    
    
}
