/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.studentmanagement.view;

import com.fasterxml.jackson.databind.ObjectMapper;
import ec.edu.espe.studentmanagement.model.Student;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */
public class StudentManagement {
    public static void main(String[] args) {
        // Crear un objeto de tipo Student
        Student student = new Student("123456", "Rodriguez David", 20, "Computer Engineering");

        // Convertir el objeto a JSON
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Convertir objeto a JSON y guardarlo en un archivo
            mapper.writeValue(new FileWriter("student.json"), student);
            System.out.println("Datos del estudiante guardados en student.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
