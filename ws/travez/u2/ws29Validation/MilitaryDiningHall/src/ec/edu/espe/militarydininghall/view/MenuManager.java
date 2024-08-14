package ec.edu.espe.militarydininghall.view;

import Utils.FileManager;
import Utils.Validations;
import ec.edu.espe.militarydininghall.model.Commensal;
import java.io.IOException;
import java.util.Scanner;
import utils.AccountsActions;
import ec.edu.espe.militarydininghall.view.ActionsMenuManager;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import utils.Accounts;

/**
 *
 * @author The Java Bandits, DCCO-ESPE
 */
public class MenuManager {

    public static void mainMenu() {
        try {
            int option;
            do {
                Accounts accountManager = new Accounts("accounts.json");
                System.out.println("Wellcome to the The Military Dining Hall Aplication");
                System.out.println("Select a option: \n1.- Login \n2.- Create a account \nEnter the option: ");

                option = Validations.valideAnyInt();
                switch (option) {
                    case 1 -> {
                        while (!Accounts.login()) {
                            System.out.println("Account does not exist, try again.");
                        }
                    }
                    case 2 ->
                        Accounts.createAccount();
                    default ->
                        System.out.println("Invalid option, enter again: ");
                }
            } while (option != 1);
        } catch (IOException e) {
            System.out.println("An error occurred while initializing the account manager: " + e.getMessage());
        }
    }

    public static void commensalMenu(Commensal commensal) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int option, loweOption = 1, higherOption = 4;
        do {
            System.out.println("Commensal Menu:");
            System.out.println("1. Book a Day");
            System.out.println("2. Unbook a Day");
            System.out.println("3. See Account Balance");
            System.out.println("4. Exit");

            String fileName = "reservations.json";
            Map<Integer, Commensal> commensals = new HashMap<>();

            option = Validations.valideInt(loweOption, higherOption);
            switch (option) {
                case 1 -> {
                    System.out.print("Enter the day to book (DD): ");
                    int day = Validations.valideInt(1, 31);
                    System.out.print("Enter the month to book (MM): ");
                    int month = Validations.valideInt(1, 12);

                    commensal.bookDay("2024" + "-" + String.valueOf(day) + "-" + String.valueOf(month), commensal.getName());
                    System.out.println("Day register!!");

                }
                case 2 -> {
                    System.out.print("Enter the day to remove (DD): ");
                    int day = Validations.valideInt(1, 31);
                    System.out.print("Enter the month to remove (MM): ");
                    int month = Validations.valideInt(1, 12);

                    commensal.unbookDay("2024" + "-" + String.valueOf(day) + "-" + String.valueOf(month));
                    System.out.println("Day remove!!");
                }

                case 3 ->
                    ActionsMenuManager.seeAccountBalance();

                case 4 -> {
                    commensals.put(commensal.getId(), commensal);
                    FileManager.saveCommensal(fileName, commensals);
                    MenuManager.mainMenu();
                }
            }
        } while (option != 4);

    }

    public static void chefMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int option, loweOption = 1, higherOption = 5;

        System.out.println("Chef Menu:");
        System.out.println("1. Create Dinner Menu");
        System.out.println("2. Book a Day");
        System.out.println("3. Unbook a Day");
        System.out.println("4. See Account Balance");
        System.out.println("5. Exit");

        option = Validations.valideInt(loweOption, higherOption);

        switch (option) {
            case 1 ->
                ActionsMenuManager.createDiningMenu();

            case 2 ->
                ActionsMenuManager.bookADay();

            case 3 ->
                ActionsMenuManager.unbookADay();

            case 4 ->
                ActionsMenuManager.seeAccountBalance();

            case 5 ->
                MenuManager.mainMenu();
        }
    }

    public static void adminMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int option, loweOption = 1, higherOption = 5;

        System.out.println("Admin Menu");
        System.out.println("1. Edit Register");
        System.out.println("2. Book a Day");
        System.out.println("3. Unbook a Day");
        System.out.println("4. See Account Balance");
        System.out.println("5. Exit");

        option = Validations.valideInt(loweOption, higherOption);

        switch (option) {
            case 1 ->
                ActionsMenuManager.createDiningMenu();

            case 2 ->
                ActionsMenuManager.bookADay();

            case 3 ->
                ActionsMenuManager.unbookADay();

            case 4 ->
                ActionsMenuManager.seeAccountBalance();

            case 5 ->
                MenuManager.mainMenu();
        }
    }

    public static void generalAdmin() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int option, loweOption = 1, higherOption = 5;

        System.out.println("General Admin Menu:");
        System.out.println("1. Add Temporal Admin");
        System.out.println("2. Book a Day");
        System.out.println("3. Unbook a Day");
        System.out.println("4. See Account Balance");
        System.out.println("5. Exit");

        option = Validations.valideInt(loweOption, higherOption);

        switch (option) {
            case 1 ->
                ActionsMenuManager.declareTemporalAdmin();

            case 2 ->
                ActionsMenuManager.bookADay();

            case 3 ->
                ActionsMenuManager.unbookADay();

            case 4 ->
                ActionsMenuManager.seeAccountBalance();

            case 5 ->
                MenuManager.mainMenu();
        }
    }
}
