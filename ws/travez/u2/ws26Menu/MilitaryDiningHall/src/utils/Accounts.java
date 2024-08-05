package utils;

import Utils.Validations;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author The Java Bandits, DCCO-ESPE
 */

public class Accounts {
    private static final Scanner scanner = new Scanner(System.in);
    private static Map<String, Account> accounts;
    private static ObjectMapper objectMapper;
    private static File file;
    private static Account currentAccount;

    public Accounts(String filename) throws IOException {
        objectMapper = new ObjectMapper();
        file = new File(filename);
        if (file.exists()) {
            accounts = objectMapper.readValue(file, TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Account.class));
        } else {
            accounts = new HashMap<>();
        }
    }

    public static boolean login() {
        System.out.print("Enter the email: ");
        String email = scanner.nextLine();
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        Account account = accounts.get(email);
        
        if (account != null && account.getPassword().equals(password)){
            currentAccount = account;
            System.out.println("Welcome " + account.getName());
            System.out.println("You entered with a " + account.getType() + " account");
            return true;
        }
        return false;
    }

    public static void createAccount() throws IOException {
        System.out.println("Enter the number of your identity card:");
        int id = Validations.valideAnyInt();
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the email: ");
        String email = scanner.nextLine();
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        System.out.println("Enter yout grade (if you area public servant type public servant):");
        String grade = scanner.nextLine();
        String type = "Commensal";
        /*
        System.out.print("Account Type: \n1.- Commensal\n2.- Chef\n3.- Admin\n4.- General Admin \nEnter the option: ");
        
        int optionNumber;
        do {
            optionNumber = valideInt();
            
            switch (optionNumber) {
                case 1:
                    type = "Commensal";
                    break;
                case 2:
                    type = "Chef";
                    break;
                case 3:
                    type = "Admin";
                    break;
                case 4:
                    type = "General Admin";
                    break;
                default:
                    System.out.println("Invalid option, enter again: ");
            }
        } while (optionNumber < 1 || optionNumber > 4);
        */

        if (accounts == null) {
            accounts = new HashMap<>();
        }
        Account account = new Account(id ,name, email, password, type, grade);
        accounts.put(email, account);
        objectMapper.writeValue(file, accounts);
        System.out.println("Account successfully created!!!");
    }
    public static int getCurrentAccountId() {
        return currentAccount != null ? currentAccount.getId() : null;
    }
    public static String getCurrentAccountName() {
        return currentAccount != null ? currentAccount.getName() : null;
    }

    public static String getCurrentAccountEmail() {
        return currentAccount != null ? currentAccount.getEmail() : null;
    }

    public static String getCurrentAccountType() {
        return currentAccount != null ? currentAccount.getType() : null;
    }

    public static class Account {
        private int id;
        private String name;
        private String email;
        private String password;
        private String type;
        private String grade;
        
        public Account() {
        }

        public Account(int id, String name, String email, String password, String type, String grade) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.password = password;
            this.type = type;
            this.grade = grade;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public String getGrade() {
            return grade;
        }

        public int getId() {
            return id;
        }
        
    }
}
