package Controller;

import Controller.PurchaseTicketsController;
import Controller.ViewTicketsController;
import View.ViewTickets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hayde
 */
public class ViewTicketsController implements ActionListener{//will grab tickets based on a verified user and control from here
    private NavigationController navCntrl;
    private PurchaseTicketsController purchaseTicketsCntrl;
    private ViewTickets viewTicketsUI;
    
    /**
     * Constructor for the view tickets controller class
     * @param navCntrl instance of the navigation controller
     * @param purchaseTicketsCntrl instance of the purchase tickets controller
     */
    public ViewTicketsController(NavigationController navCntrl, PurchaseTicketsController purchaseTicketsCntrl) {
        this.navCntrl = navCntrl;
        this.purchaseTicketsCntrl = purchaseTicketsCntrl;
        viewTicketsUI = new ViewTickets();
        viewTicketsUI.printTicketsButton.addActionListener(this);
        viewTicketsUI.purchaseTicketsButton.addActionListener(this);
        viewTicketsUI.setVisible(true);
    }

    public ViewTicketsController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Action Events for buttons
     * @param e representing an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == viewTicketsUI.purchaseTicketsButton)
        {
            purchaseTicketsCntrl = new PurchaseTicketsController(navCntrl);
            viewTicketsUI.setVisible(false);
        }
        if(obj == viewTicketsUI.printTicketsButton)
        {
            navCntrl = new NavigationController();
            viewTicketsUI.setVisible(false);
        }
    }

    public boolean connectedUserClient(ViewTickets viewUI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
