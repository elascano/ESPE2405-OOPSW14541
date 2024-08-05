package ec.edu.espe.exam.model;

import org.bson.Document;

/**
 *
 * @author David Pantoja
 */

public class Professor {

    private int id;
    private String name;
    private float salary;
    private float annualSalary;
    private float tax;

    public Professor(int id, String name, float salary, float annualSalary, float tax) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.annualSalary = annualSalary;
        this.tax = tax;
    }

    public Document toDocument() {
        Document document = new Document();
        document.append("id", id);
        document.append("name", name);
        document.append("salary", salary);
        document.append("annualSalary", annualSalary);
        document.append("tax", tax);
        return document;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the annualSalary
     */
    public float getAnnualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public void setAnnualSalary(float annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * @return the tax
     */
    public float getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(float tax) {
        this.tax = tax;
    }

}
