package Controller;

import View.NavigationUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bpardee
 */
public class NavigationController implements ActionListener {
    private NavigationUI navigationUI;
    private RestaurantController restCntrl;
    private purchaseTicketsController purchaseTicketsCntrl;
    private viewTicketsController viewTicketsCntrl;
    private LoginController loginCntrl;
    
    /**
     * Constructor for the Navigation Controller
     * used to instantiate aspects of the controller
     */
    public NavigationController() {
        navigationUI = new NavigationUI(this);
        navigationUI.restaurantBtn.addActionListener(this);
        navigationUI.logoutBtn.addActionListener(this);
        navigationUI.purchaseTicketsBtn.addActionListener(this);
        navigationUI.viewTicketsBtn.addActionListener(this);
        navigationUI.setVisible(true);
    }
    
    /**
     * Action events for buttons
     * @param e represents an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == navigationUI.restaurantBtn)
        {
            restCntrl = new RestaurantController(this);
            navigationUI.setVisible(false);
        }
        if(obj == navigationUI.purchaseTicketsBtn)
        {
            purchaseTicketsCntrl = new purchaseTicketsController(this);
            navigationUI.setVisible(false);
        }
        if(obj == navigationUI.viewTicketsBtn)
        {
            viewTicketsCntrl = new viewTicketsController(this, purchaseTicketsCntrl);
            navigationUI.setVisible(false);
        }
        if(obj == navigationUI.logoutBtn)
        {
            loginCntrl = new LoginController();
            navigationUI.setVisible(false);
        }
        
    }
    
}
