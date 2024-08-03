/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class Validator {

    public static boolean validatePassword(String password) {
        // Expresión regular para verificar que la contraseña tenga exactamente 8 caracteres
        // e incluya al menos una letra mayúscula, una letra minúscula, un número y un carácter especial
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%?&])[A-Za-z\\d@$!%?&]{8}$";
        boolean matches = password.matches(regex);
        return matches;
    }
}
