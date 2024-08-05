package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.exam.utils.PasswordManager;
import ec.edu.espe.exam.view.FrmProfessors;

/**
 *
 * @author David Pantoja
 */
public class LoginController {

    DatabaseController database;
    MongoCollection collection;
    private String currentUsername;
    private String newPassword;

    private static LoginController instance;

    private LoginController() {
        this.database = DatabaseController.getInstance();
        this.collection = DatabaseController.getInstance().changeCollection("Users");
    }

    public synchronized static LoginController getInstance() {
        if (instance != null) {

        } else {
            instance = new LoginController();
        }

        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public boolean checkCredentials(String username, String password) {
        if (PasswordManager.checkCredentials(currentUsername, username, password, collection)) {
            return true;
        }
        return false;
    }

    private void openProfessorsForm() {
        FrmProfessors professorsForm = new FrmProfessors();
        professorsForm.setVisible(true);
    }

    public void migratePasswordsToBCrypt() {
        PasswordManager.migratePasswordsToBCrypt(collection);
    }

    public boolean createUser(String name, String lastName, String username, String password) {
        return PasswordManager.createUser(name, lastName, username, password, collection);
    }

    public boolean changePassword(String confirmPassword) {
        return PasswordManager.changePassword(currentUsername, newPassword, confirmPassword, collection);

    }

    public String obtainPasswordByUsername(String username) {
        return PasswordManager.getPasswordByUsername(username, collection);
    }

    public String generateTemporaryPassword() {
        return PasswordManager.generateTemporaryPassword();
    }

    public String generateRandomPassword() {
        return PasswordManager.generateRandomPassword();
    }

    public boolean updatePassword(String username, String newPassword, String temporaryPassword) {
        return PasswordManager.updatePassword(username, newPassword, temporaryPassword, collection);
    }

    public String getCurrentUsername() {
        return currentUsername;
    }

    public void setCurrentUsername(String currentUsername) {
        this.currentUsername = currentUsername;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

}
