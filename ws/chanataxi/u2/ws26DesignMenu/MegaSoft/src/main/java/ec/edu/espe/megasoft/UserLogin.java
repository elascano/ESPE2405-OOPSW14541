/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.megasoft;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class UserLogin {
    private String name;
    private String password;
    
    public UserLogin() {
        this.name = "user";
        this.password = "password";
    }

    public UserLogin(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
