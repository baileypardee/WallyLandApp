package Controller;

import View.TicketOrderUI;
import Model.Ticket;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * this will control the order gui
 * @author hayde
 */
public class TicketsOrderController implements ActionListener {
    private TicketOrderUI ticketOrderUI;
    private TicketsOrderController orderTix;
    private ViewTicketsController viewScreen;
    private Ticket ticket;
    private CreditCardInputViewController purchaseScreen;
    private NavigationController navCntrl;

    public TicketsOrderController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**Constructor
     * 
     * @param navCntrl 
     */
    public TicketsOrderController(NavigationController navCntrl){
        this.navCntrl = navCntrl;
        ticket = 
        ticketOrderUI = new TicketOrderUI();
        ticketOrderUI.purchaseTixBtn.addActionListener(this);
        ticketOrderUI.menuBtn.addActionListener(this);
    }

    /**
     * Action Events for buttons
     * @param e the command line arguments
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == ticketOrderUI.purchaseTixBtn)
        {
            purchaseScreen = new CreditCardInputViewController(navCntrl);
            ticketOrderUI.setVisible(false);
        }
        if(obj == ticketOrderUI.menuBtn)
        {
            navCntrl = new NavigationController();
            ticketOrderUI.setVisible(false);
            
        }
    }

    public boolean connectedUserClient(TicketOrderUI ticketOrderUI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
