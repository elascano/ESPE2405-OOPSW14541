
package view;

import model.Clock;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Watchmaking {
    
    public static void main(String[] args){
        float totalPrice;
        Clock clock;
        
        clock = new Clock(1,"Oro","Rolex",2800.0F,1);
        System.out.println("clock -->" + clock);
    }
    
}
