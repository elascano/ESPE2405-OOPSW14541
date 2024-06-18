package ec.edu.espe.speaker.model;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE 
 *
 */

public class Speaker {
    private int id;
    private String name;
    private String topic;
    private String nationality;

   
    public Speaker(int id, String name, String topic, String nationality) {
        this.id = id;
        this.name = name;
        this.topic = topic;
        this.nationality = nationality;
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
