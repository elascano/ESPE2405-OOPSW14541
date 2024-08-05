
package ec.edu.espe.fromumltocode.model;


/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE 
 *
 */
public class G implements H{
    private J j;
    
    public  static J createJ(){
        System.out.println("Crating J");
        J j = null;
     return j;
    }

    /**
     * @return the j
     */
    public J getJ() {
        return j;
    }

    /**
     * @param j the j to set
     */
    public void setJ(J j) {
        this.j = j;
    }
}
