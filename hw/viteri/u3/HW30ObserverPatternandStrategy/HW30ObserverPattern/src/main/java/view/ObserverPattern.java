/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package view;

import model.IBM;
import model.Investor;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class ObserverPattern {

    public static void main(String[] args) {
        Investor s = new Investor("Sorros");
        Investor b = new Investor("Berkshire");
        
        IBM ibm = new IBM("IB,", 120.00);
        ibm.addObserver(s);
        ibm.addObserver(b);
        
        ibm.setPrice(120.10);
        ibm.setPrice(120.10);
        ibm.setPrice(120.10);
        ibm.setPrice(120.10);
        ibm.setSymbol("IBMTEST");
    }}