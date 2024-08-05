package ec.edu.espe.militarydininghall.view;

import ec.edu.espe.militarydininghall.model.Commensal;
import java.io.IOException;
import utils.Accounts;

/**
 *
 * @author The Java Bandits, DCCO-ESPE
 */
public class MilitaryDiningHallAplication {

    public static void main(String[] args) throws IOException {
        MenuManager.mainMenu();

        switch (Accounts.getCurrentAccountType()) {
            case "Commensal" -> {
                Commensal commensal = new Commensal(Accounts.getCurrentAccountId(),Accounts.getCurrentAccountName(), Accounts.getCurrentAccountEmail(), Accounts.getCurrentAccountType());
                MenuManager.commensalMenu(commensal);
            }

            case "Administrator" ->
                MenuManager.adminMenu();

            case "General Administrator" ->
                MenuManager.generalAdmin();

            case "Military Chef" ->
                MenuManager.chefMenu();
        }

    }
}
