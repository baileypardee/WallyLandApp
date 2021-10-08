package Controller;

import View.NavigationUI;
import View.loginPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author fdadebo
 */
public class LoginController implements ActionListener{
    private NavigationController navCntrl;
    private loginPage loginUI;
    private LoginController loginCntrl;

    /**
     * Constructor for login controller
     */
    public LoginController() {
        loginUI = new loginPage(this);
        loginUI.loginButton.addActionListener(this);
        loginUI.setVisible(true);
     };
    
    /**
     * Action Events for buttons
     * @param e representing an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == loginUI.loginButton)
        {
            navCntrl = new NavigationController();
            loginUI.setVisible(false);
        }
    }
}
