package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author Logic Legion DCCO-ESPE
 */
public class Career {

    private String career;

    @Override
    public String toString() {
        return career;
    }

    public Career(String career) {
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
