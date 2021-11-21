/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.AdminNavigation;
import View.NavigationUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author meky
 */
public class AdminNavigationController implements ActionListener {

    private AdminNavigation adminNavUI;
    //private LoginController loginCntrl;

    /**
     * Constructor for the Navigation Controller used to instantiate aspects of
     * the controller
     */
    public AdminNavigationController() {
        adminNavUI = new AdminNavigation(this);
        adminNavUI.setVisible(true);
    }

    /**
     * Method to 'connect' to our user
     *
     * @param navInterface a user interface which can view the main menu
     * @return the connection status
     */
    public boolean connectedUserClient(AdminNavigation navInterface) {
        adminNavUI = navInterface;
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
