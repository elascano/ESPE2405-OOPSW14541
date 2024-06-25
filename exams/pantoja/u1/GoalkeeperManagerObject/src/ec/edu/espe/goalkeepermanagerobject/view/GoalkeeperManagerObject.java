/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.goalkeepermanagerobject.view;

/**
 *
 * @author G406
 */
import java.util.ArrayList;

public class GoalkeeperManagerObject {
    private String id;
    private String name;
    private int age;
    private String team;

    public GoalkeeperManagerObject(String id, String name, int age, String team) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.team = team;
    }

    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    @Override
    public String toString() {
        return "Goalkeeper{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                '}';
    }
}
