package Controller;

import Controller.CreditCardInputViewController;
import Controller.ViewTicketsController;
import Controller.TicketsOrderController;
import View.ViewTickets;
import View.TicketOrderUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hayde
 */
public class ViewTicketsController implements ActionListener{//will grab tickets based on a verified user and control from here
    private NavigationController navCntrl;
    private CreditCardInputViewController purchaseTicketsCntrl;
    private TicketsOrderController orderTicketsController;
    private ViewTickets viewTicketsUI;
    private TicketOrderUI orderTickets;
    
    
    /**
     * Constructor for the view tickets controller class
     * @param navCntrl instance of the navigation controller
     * @param purchaseTicketsCntrl instance of the purchase tickets controller
     */
    public ViewTicketsController(NavigationController navCntrl) {
        this.navCntrl = navCntrl;
        viewTicketsUI = new ViewTickets();
        viewTicketsUI.menuBtn.addActionListener(this);
        viewTicketsUI.purchaseBtn.addActionListener(this);
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
        if(obj == viewTicketsUI.menuBtn)
        {
            navCntrl = new NavigationController();
            viewTicketsUI.setVisible(false);
        }
        else if(obj == viewTicketsUI.purchaseBtn){
            orderTicketsController = new TicketsOrderController(navCntrl);
            viewTicketsUI.setVisible(false);
        }
    }

    public boolean connectedUserClient(ViewTickets viewUI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
