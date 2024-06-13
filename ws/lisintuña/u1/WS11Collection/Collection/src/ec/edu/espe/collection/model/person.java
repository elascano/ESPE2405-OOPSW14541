package ec.edu.espe.collection.model;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class person {
    private int id;
    private String name;

    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" + "id=" + getId() + ", name=" + getName() + '}';
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