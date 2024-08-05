package com.mycompany.complesoperation;

import com.mycompany.complesoperation.controller.PersonController;

/**
 *
 * @author DELL
 */
public class ComplesOperation {

    public static void main(String[] args) {
        System.out.println("Welcome to complez Operation: \nCristian Lisintuña ");
        float addend1;
        float addend2;
        float sum;
        
        addend1 = 1;
        addend2 = 2;
        
        sum = PersonController.Metodorefactor(addend1, addend2);
        System.out.println("The addition of " + addend1 + " + " + addend2 + " ---> " + sum);
        
        addend1 = 1.2F;
        addend2 = 2.4F;
        
        sum = PersonController.Metodorefactor(addend1, addend2);
        System.out.println("The addition of " + addend1 + " + " + addend2 + " ---> " + sum);
    }

}
