package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.exam.model.Professor;  
import ec.edu.espe.exam.utils.DatabaseManager;
import java.util.ArrayList;
import java.util.HashMap;
import ec.edu.espe.exam.utils.Tax;

/**
 *
 * @author David Pantoja
 */
public class ProfessorController {

    DatabaseController database;
    MongoCollection collection;

    private static ProfessorController instance;

    private ProfessorController() {
        this.database = DatabaseController.getInstance();
        this.collection = DatabaseController.getInstance().changeCollection("Professor");
    }

    public synchronized static ProfessorController getInstance() {
        if (instance != null) {

        } else {
            instance = new ProfessorController();
        }

        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void save(Professor professor) {
        DatabaseManager.insertDocument(collection, professor.toDocument());
    }

    public Professor obtain(int id) {
        HashMap<Object, Object> professorMap = DatabaseManager.obtain(collection, id);
        String name = professorMap.get("name").toString();
        float salary = Float.parseFloat(professorMap.get("salary").toString());
        float annualSalary = Float.parseFloat(professorMap.get("annualSalary").toString());
        float tax = Float.parseFloat(professorMap.get("tax").toString());

        Professor professor = new Professor(id, name, salary, annualSalary, tax);
        return professor;
    }

    public ArrayList<Professor> obtainAll() {
        ArrayList<HashMap<Object, Object>> professorMaps = DatabaseManager.obtainAll(collection);

        ArrayList<Professor> professors = new ArrayList<>();

        for (HashMap<Object, Object> professorMap : professorMaps) {
            int id = Integer.parseInt(professorMap.get("id").toString());
            String name = professorMap.get("name").toString();
            float salary = Float.parseFloat(professorMap.get("salary").toString());
            float annualSalary = Float.parseFloat(professorMap.get("annualSalary").toString());
            float tax = Float.parseFloat(professorMap.get("tax").toString());

            Professor professor = new Professor(id, name, salary, annualSalary, tax);

            if (professor != null) {
                professors.add(professor);
            }
        }
        return professors;
    }

    public void delete(int id) {
        if (DatabaseManager.existsDocument(collection, "id", id)) {
            DatabaseManager.deleteDocument(collection, "id", id);
        } else {
            System.out.println("No existe un Professor con ese ID.");
        }
    }

    public boolean existsProfessor(int id) {
        return DatabaseManager.existsDocument(collection, "id", id);
    }

    public float calculateAnnualSalary(float salary) {
        return salary * 12;
    }

    public float calculateTax(float salary) {

        return Tax.computeIncomeTax(salary);
    }
}
