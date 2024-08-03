/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q3851.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public abstract class A {

    protected A aInstance;
    protected List<B> bList = new ArrayList<>();

    /**
     * @return the aInstance
     */
    public A getaInstance() {
        return aInstance;
    }

    /**
     * @param aInstance the aInstance to set
     */
    public void setaInstance(A aInstance) {
        this.aInstance = aInstance;
    }

    /**
     * @return the bList
     */
    public List<B> getbList() {
        return bList;
    }

    /**
     * @param bList the bList to set
     */
    public void setbList(List<B> bList) {
        this.bList = bList;
    }
    
    
}
