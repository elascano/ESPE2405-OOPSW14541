/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @,TheJavaBandits, DCCO-ESPE
 */
public class incom {
    public static float computeIR(float salary){
        //TODO
        float anualSalary = salary * 12;
        float personalIESSApport = anualSalary * 9.45F/100F;
        float taxableBase = anualSalary - personalIESSApport;
        
        if (taxableBase < 11902.0F){
            return 0.0F;
            
        }else{
            return taxExempt(taxableBase);
        }
        
    }
    
    public static float taxExempt(float taxableBase){      
        if(taxableBase > 11902.0F && taxableBase < 15159.0F){
            return (taxableBase - 11902.0F)*5/100;
            
        }else if(taxableBase > 15159.0F && taxableBase < 19682.0F){
            return ((taxableBase - 15159.0F)*10/100)+163.0F;
            
        }else if(taxableBase > 19682.0F && taxableBase < 26031.0F){
            return ((taxableBase - 19682.0F)*12/100)+615.0F;
            
        }else if(taxableBase > 26031.0F && taxableBase < 34255.0F){
            return ((taxableBase - 26031.0F)*15/100)+1377.0F;
            
        }else if(taxableBase > 34255.0F && taxableBase < 45407.0F){
            return ((taxableBase - 34255.0F)*20/100)+2611.0F;
            
        }else if(taxableBase > 45407.0F && taxableBase < 60450.0F){
            return ((taxableBase - 45407.0F)*25/100)+4841.0F;
            
        }else if(taxableBase > 60450.0F && taxableBase < 80605.0F){
            return ((taxableBase - 60450.0F)*30/100)+8602.0F;
            
        }else if(taxableBase > 80605.0F && taxableBase < 107199.0F){
            return ((taxableBase - 80605.0F)*35/100)+14648.0F;
            
        }else if(taxableBase > 107199.0F){
            return ((taxableBase - 107199.0F)*37/100)+23956.0F;
            
        }
        return 0.0F;
        
    }
    
    public static float deductions(float taxableBase){
        
        
        return 0.0F;
    }
}
