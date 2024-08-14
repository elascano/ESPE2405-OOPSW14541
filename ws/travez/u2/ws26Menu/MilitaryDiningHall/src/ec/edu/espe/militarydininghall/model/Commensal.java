package ec.edu.espe.militarydininghall.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author The Java Bandits, DCCO-ESPE
 */
public class Commensal {

    private int id;
    private String name;
    private String email;
    private String grade;
    private Map<String, String> reservation;

    public Commensal(int id, String name, String email, String grade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.reservation = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void bookDay(String date, String name) {
        reservation.put(date, name);
    }

    public void unbookDay(String date) {
        reservation.remove(date);
    }

    public Map<String, String> getMealSchedule() {
        return reservation;
    }
    
    public void seeAccountBalance() {
        System.out.println("Account balance displayed for " + name);
    }

    @Override
    public String toString() {
        return "Commensal{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", email='" + email + '\''
                + ", grade='" + grade + '\''
                + '}';
    }
}
