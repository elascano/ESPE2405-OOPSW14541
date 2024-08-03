package ec.edu.espe.exam.controller;

import ec.edu.espe.exam.model.Professor;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David Pantoja
 */
public class ViewController {

    ProfessorController professorController;

    private static ViewController instance;

    private ViewController() {
        this.professorController = ProfessorController.getInstance();
    }

    public synchronized static ViewController getInstance() {
        if (instance != null) {

        } else {
            instance = new ViewController();
        }

        return instance;
    }

    public void displayTable(JTable tbl) {
        ArrayList<Professor> professors = ProfessorController.getInstance().obtainAll();
        DefaultTableModel professorTableModel = createTableModel(professors);
        tbl.setModel(professorTableModel);
        tbl.setDefaultEditor(Object.class, null);
    }

    private DefaultTableModel createTableModel(ArrayList<Professor> professors) {
        String[] header = {"ID", "Name", "Salary", "Annual Salary", "Tax"};
        DefaultTableModel professorTableModel = new DefaultTableModel(null, header);

        for (Professor professor : professors) {
            Object[] professorData = {
                professor.getId(),
                professor.getName(),
                professor.getSalary(),
                professor.getAnnualSalary(),
                professor.getTax()
            };
            professorTableModel.addRow(professorData);
        }

        return professorTableModel;
    }

    public static void activateBtn(JButton btn) {
        btn.setEnabled(true);
    }

    public void displayTable(JTable tbl, ArrayList<Professor> professors) {
        DefaultTableModel professorTableModel = createTableModel(professors);
        tbl.setModel(professorTableModel);
        tbl.setDefaultEditor(Object.class, null);
    }
}
