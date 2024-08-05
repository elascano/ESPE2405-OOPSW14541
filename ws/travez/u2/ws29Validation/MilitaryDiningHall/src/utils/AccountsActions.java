package utils;

import java.util.Scanner;
import Utils.FileManager;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author The Java Bandits, DCCO-ESPE
 */

public class AccountsActions {
    private static final Scanner scanner = new Scanner(System.in);
    //private static Map<String, ec.edu.espe.militarydininghall.model.Accounts.Account> accounts;
    //private static ec.edu.espe.militarydininghall.model.Accounts.Account currentAccount;
    private static ObjectMapper objectMapper;
    private static File file;

    public static boolean login() {
        System.out.print("Enter the email: ");
        String email = scanner.nextLine();
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        /*Account account = accounts.get(email);

        if (account != null && account.getPassword().equals(password)) {
            currentAccount = account;
            System.out.println("Welcome " + account.getName());
            System.out.println("You entered with a " + account.getType() + " account");
            return true;
        }
        */
        return false;
    }

    public static void createAccount() throws IOException {
        int id;
        String name, email, password, type, grade, fileName = "Accounts.json", newAccountData;
        
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(fileName);
        
        System.out.println("Enter the number of your identity card:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the name: ");
        name = scanner.nextLine();
        System.out.print("Enter the email: ");
        email = scanner.nextLine();
        System.out.println("Enter yout grade (if you area public servant type public servant):");
        grade = scanner.nextLine();
        System.out.print("Enter the password: ");
        password = scanner.nextLine();
        type = "Commensal";
        /*
        if (accounts == null) {
            accounts = new HashMap<>();
        }
        
        
        Account account = new Account(id, name, email, password, grade, type);
        accounts.put(email, account);
        objectMapper.writeValue(file, accounts);
        
        newAccountData = account.toStringJSON();
        FileManager.save(newAccountData, fileName);
        */
        System.out.println("Account successfully created!!!");
    }
}
