/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory(){
        int sys = readFromConfigFile("OS_TYPE");
        if(sys == 0){
            return(new WinFactory());
        }
        else
        {
            return (new LinuxFactory());
        }
    }
    private static int readFromConfigFile(String option){
        return 0;
    }
    public abstract Button createButton();
    public abstract Menu createMenu();

    
}
