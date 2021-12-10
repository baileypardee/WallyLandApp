/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.ManageActivityUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author meky
 */
public class ManageActivityController implements ActionListener{
    
    private ManageActivityUI manageActivityUI;
    private AdminNavigationController adminNavCntl;
    
    
    public ManageActivityController() {
        manageActivityUI = new ManageActivityUI(this);
        manageActivityUI.backBtn.addActionListener(this);
        manageActivityUI.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == manageActivityUI.backBtn) {
            adminNavCntl = new AdminNavigationController();
            manageActivityUI.setVisible(false);
        }
    }
    
    
    
}
