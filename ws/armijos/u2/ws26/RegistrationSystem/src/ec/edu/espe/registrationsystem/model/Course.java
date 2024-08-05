package ec.edu.espe.registrationsystem.model;

import java.util.ArrayList;
import utils.Reader;

/**
 *
 * @author Logic Legion DCCO-ESPE
 */
public class Course {

    private String course;

    @Override
    public String toString() {
        return course;
    }

    public Course(String course) {
        this.course = course;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }
    
    
}
