
package ec.edu.espe.singleton.controller;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    private USTax(){
    }
    
    public static USTax getInstance(){
        if (instance == null){
            instance = new USTax();
        }
        return instance;
    }
    public float salesTotal(){
        return 0.0f;    
    }
}
