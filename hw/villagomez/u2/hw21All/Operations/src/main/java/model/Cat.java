package model;

import java.util.UUID;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class Cat {

    private String id;
    private String name;
    private String breed;
    private int age;
    private boolean appStatus;

    public Cat(String name, String breed, int age) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.appStatus = false;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the appStatus
     */
    public boolean isAppStatus() {
        return appStatus;
    }

    /**
     * @param appStatus the appStatus to set
     */
    public void setAppStatus(boolean appStatus) {
        this.appStatus = appStatus;
    }

}
