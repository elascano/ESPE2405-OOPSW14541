
package model;

import taxes.Income;
/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Person {
    private String name;
    private float salary;
    private float tax;
    private float salaryYear;
    private float salaryYearNeto;

    public Person(String name, float salary, float tax, float salaryYear, float salaryYearNeto) {
        this.name = name;
        this.salary = salary;
        this.tax = taxes.Income.computeIR(salary);
        this.salaryYear = salaryYear;
        this.salaryYearNeto = salaryYear - taxes.Income.computeIR(salary);
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", salary=" + salary + ", tax=" + tax + ", salaryYear=" + salaryYear + ", salaryYearNeto=" + salaryYearNeto + '}';
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

    /**
     * @return the salaryYear
     */
    public float getSalaryYear() {
        return salaryYear;
    }

    /**
     * @param salaryYear the salaryYear to set
     */
    public void setSalaryYear(float salaryYear) {
        this.salaryYear = salaryYear;
    }

    /**
     * @return the salaryYearNeto
     */
    public float getSalaryYearNeto() {
        return salaryYearNeto;
    }

    /**
     * @param salaryYearNeto the salaryYearNeto to set
     */
    public void setSalaryYearNeto(float salaryYearNeto) {
        this.salaryYearNeto = salaryYearNeto;
    }

}
    
    