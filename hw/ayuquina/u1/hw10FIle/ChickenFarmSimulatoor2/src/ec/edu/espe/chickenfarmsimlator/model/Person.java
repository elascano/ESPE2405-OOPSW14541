package ec.edu.espe.chickenfarmsimlator.model;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Person {

    private int id;
    private String name;

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
