/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public  class Income {
    public static float computeIR(float salary){
        float totalSalary;
        float anualSalary = salary * 12;
        
        if (anualSalary >=0 && anualSalary < 11722){
            totalSalary = salary;
        } else if (anualSalary >= 11722.00 && anualSalary < 14930.00){
            totalSalary = (salary - (salary*0.05F));
        }else if (anualSalary >= 14930.00 && anualSalary < 19385.00){
            totalSalary = (salary - (salary * 0.10F));
        }else if (anualSalary >= 19385.00 && anualSalary < 25638.00){
            totalSalary = (salary - (salary * 0.12F));
        }else if (anualSalary >= 25638.00 && anualSalary < 33738.00){
            totalSalary = (salary - (salary * 0.15F));
        }else if (anualSalary >= 33738.00 && anualSalary < 44721.00){
            totalSalary = (salary - (salary * 0.20F));
        }else if (anualSalary >= 44721.00 && anualSalary < 59537.00){
            totalSalary = (salary - (salary * 0.25F));
        }else if (anualSalary >= 59537.00 && anualSalary < 79388.00){
            totalSalary = (salary - (salary * 0.30F));
        }else if (anualSalary >= 79388.00 && anualSalary < 105580.00){
            totalSalary = (salary - (salary * 0.35F));
        } else {
            totalSalary = (salary - (salary * 0.37F));
        } 
        return totalSalary;
    }
}
