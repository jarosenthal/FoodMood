package foodmood.login;

import foodmood.picker.PickerController;
import foodmood.user.User;
import foodmood.user.UserList;

/**
 *
 * @author Gisward
 */
public final class LoginController {

    private final UserList theUserList;
    private final LoginUI theLoginUI;
    private User theCurrentUser;

    public LoginController() {
        this.theUserList = new UserList();
        this.theLoginUI = new LoginUI(this);
        requestLoginUI();
    }

    public User getCurrentUser() {
        return theCurrentUser;
    }

    public void requestLoginUI() {
        theLoginUI.setVisible(true);
    }

    public void requestPickerController() {
        theLoginUI.dispose();
        new PickerController(this);
    }

     public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck) {
        boolean auth = theUserList.authenticate(usernameToCheck, passwordToCheck);

        if (auth) {
             theCurrentUser = new User(usernameToCheck, passwordToCheck);
        }

        return auth;
    }

    public void requestRegisterUI() {
        theLoginUI.setVisible(false);
        SignUpUI theRegisterUI = new SignUpUI(this);
        theRegisterUI.setVisible(true);
    }

    public boolean registerUser(String username, char[] password) {
        if (theUserList.contains(username)) {
            return false;
        } else {
            theUserList.add(new User(username, password));
            return true;
        }
    }

    public void logout() {
       System.exit(0);
    }
}
