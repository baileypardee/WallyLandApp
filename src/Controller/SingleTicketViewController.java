package Controller;

import Controller.CreditCardInputViewController;
import Controller.SingleTicketViewController;
import View.ViewTickets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hayde
 */
public class SingleTicketViewController implements ActionListener{//will grab tickets based on a verified user and control from here
    private NavigationController navCntrl;
    private CreditCardInputViewController purchaseTicketsCntrl;
    private ViewTickets viewTicketsUI;
    
    /**
     * Constructor for the view tickets controller class
     * @param navCntrl instance of the navigation controller
     * @param purchaseTicketsCntrl instance of the purchase tickets controller
     */
    public SingleTicketViewController(NavigationController navCntrl, CreditCardInputViewController purchaseTicketsCntrl) {
        this.navCntrl = navCntrl;
        this.purchaseTicketsCntrl = purchaseTicketsCntrl;
        viewTicketsUI = new ViewTickets();
        viewTicketsUI.menuBtn.addActionListener(this);
        viewTicketsUI.setVisible(true);
    }

    public SingleTicketViewController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Action Events for buttons
     * @param e representing an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == viewTicketsUI.menuBtn)
        {
            purchaseTicketsCntrl = new CreditCardInputViewController(navCntrl);
            viewTicketsUI.setVisible(false);
        }
    }

    public boolean connectedUserClient(ViewTickets viewUI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
