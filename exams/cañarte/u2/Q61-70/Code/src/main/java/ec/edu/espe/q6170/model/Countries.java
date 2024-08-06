
package ec.edu.espe.q6170.model;

/**
 *
 * @author Saray Cañarte
 */
public class Countries {
    private int id;
    private String name;
    private float initialPbi;
    private float finalPbi;
    private float result; 

    public Countries(int id, String name, float initialPbi, float finalPbi, float result) {
        this.id = id;
        this.name = name;
        this.initialPbi = initialPbi;
        this.finalPbi = finalPbi;
        this.result = result;
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
     * @return the initialPbi
     */
    public float getInitialPbi() {
        return initialPbi;
    }

    /**
     * @param initialPbi the initialPbi to set
     */
    public void setInitialPbi(float initialPbi) {
        this.initialPbi = initialPbi;
    }

    /**
     * @return the finalPbi
     */
    public float getFinalPbi() {
        return finalPbi;
    }

    /**
     * @param finalPbi the finalPbi to set
     */
    public void setFinalPbi(float finalPbi) {
        this.finalPbi = finalPbi;
    }

    /**
     * @return the result
     */
    public float getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(float result) {
        this.result = result;
    }
    
    
}
