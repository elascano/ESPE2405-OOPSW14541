package ec.edu.espe.templatemethod.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE
 */
public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Steep the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
    
    @Override
    public boolean wantsCondiments(){
        String answer = getUserInput();
        
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }
    
    private String getUserInput(){
        String answer = "Y";
       
        System.out.println("Would you like lemon with your tea (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        return answer;
    }
}
