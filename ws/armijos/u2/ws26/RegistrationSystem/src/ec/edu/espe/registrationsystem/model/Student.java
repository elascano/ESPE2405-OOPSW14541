package ec.edu.espe.registrationsystem.model;

import java.util.Scanner;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class Student {

    private String dni;
    private String name;
    private String lastName;
    private String careerCode;
    private String email;
    private String phone;
    private Registration typeOfRegistration;
    private String grade;
    private String lastChance;
    private String gratuity;

    @Override
    public String toString() {
        return dni +"," + name + "," + lastName +"," + careerCode +"," + email +"," + phone + "," + typeOfRegistration +"," + grade+"," + lastChance +"," + gratuity;
    }

    public Student(String dni, String name, String lastName, String careerCode, String email, String phone, Registration typeOfRegistration, String grade, String lastChance, String gratuity) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.careerCode = careerCode;
        this.email = email;
        this.phone = phone;
        this.typeOfRegistration = typeOfRegistration;
        this.grade = grade;
        this.lastChance = lastChance;
        this.gratuity = gratuity;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the careerCode
     */
    public String getCareerCode() {
        return careerCode;
    }

    /**
     * @param careerCode the careerCode to set
     */
    public void setCareerCode(String careerCode) {
        this.careerCode = careerCode;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the typeOfRegistration
     */
    public Registration getTypeOfRegistration() {
        return typeOfRegistration;
    }

    /**
     * @param typeOfRegistration the typeOfRegistration to set
     */
    public void setTypeOfRegistration(Registration typeOfRegistration) {
        this.typeOfRegistration = typeOfRegistration;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the lastChance
     */
    public String getLastChance() {
        return lastChance;
    }

    /**
     * @param lastChance the lastChance to set
     */
    public void setLastChance(String lastChance) {
        this.lastChance = lastChance;
    }

    /**
     * @return the gratuity
     */
    public String getGratuity() {
        return gratuity;
    }

    /**
     * @param gratuity the gratuity to set
     */
    public void setGratuity(String gratuity) {
        this.gratuity = gratuity;
    }

    

}
