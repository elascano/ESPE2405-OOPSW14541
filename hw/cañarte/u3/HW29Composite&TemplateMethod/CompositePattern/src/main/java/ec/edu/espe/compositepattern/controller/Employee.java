package ec.edu.espe.compositepattern.controller;

/**
 *
 * @author Saray Cañarte
 */
abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println(title + " " + name);
    }
}

