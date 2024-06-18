package ec.edu.espe.musicstudio.model;

import java.io.Serializable;
/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class MusicalInstrument implements Serializable{
     private static final long serialVersionUID = 1L;
    
    private int id;
    private String name;
    private String type;
    private String difficulty;

    public MusicalInstrument(int id, String name, String type, String difficulty) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "MusicalInstrument{" + "id=" + id + ", name=" + name + ", type=" + type + ", difficulty=" + difficulty + '}';
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

    /**
     * @return the difficulty
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    
}
