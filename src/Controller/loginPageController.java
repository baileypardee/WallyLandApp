package Controller;

import Controller.loginPageController;
import View.loginPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hayde
 */
public class loginPageController implements ActionListener{//this controls the login gui
    private loginPage loginPage;
    private loginPageController loginCntrl;

    /**
     * Constructor for login page controller
     */
    public loginPageController() {
        loginPage.loginButton.addActionListener(this);
        loginPage.setVisible(true);
    }
    
    /**
     * Action events for buttons
     * @param e represents an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
