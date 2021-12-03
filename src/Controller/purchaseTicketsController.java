package Controller;

import View.PurchaseTickets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * this will control the purchase gui
 * @author hayde
 */
public class PurchaseTicketsController implements ActionListener {
    private PurchaseTickets purchaseTix;
    private ViewTicketsController viewTix;
    private NavigationController navCntrl;

    public PurchaseTicketsController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * getter for purchased tickets
     * @return (gets purchased tickets)
     */
    public PurchaseTickets getPurchaseTix() {
        return purchaseTix;
    }

    /**
     * setter for purchase tickets
     * @param purchaseTix sets variable of purchase tickets type
     */
    public void setPurchaseTix(PurchaseTickets purchaseTix) {
        this.purchaseTix = purchaseTix;
    }

    /**
     * getter for view tickets controller
     * @return (gets an instance of the view tickets controller)
     */
    public ViewTicketsController getViewTix() {
        return viewTix;
    }

    /**
     * setter for view tickets
     * @param viewTix sets variable of viewTicketsController type
     */
    public void setViewTix(ViewTicketsController viewTix) {
        this.viewTix = viewTix;
    }
    
    /**
     * create the purchase tickets gui
     */
    public PurchaseTicketsController(NavigationController navCntrl) {
        this.navCntrl = navCntrl;
        purchaseTix = new PurchaseTickets();
        purchaseTix.myTicketsBuy.addActionListener(this);
        purchaseTix.submitBuyTickets.addActionListener(this);
        purchaseTix.setVisible(true);
        
    }

    /**
     * Action Events for buttons
     * @param e the command line arguments
     */
    @Override
    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == purchaseTix.myTicketsBuy)
        {
            viewTix = new ViewTicketsController(navCntrl, this);
            purchaseTix.setVisible(false);
        }
        if(obj == purchaseTix.submitBuyTickets)
        {
            navCntrl = new NavigationController();
            purchaseTix.setVisible(false);
        }
        
    }

    public boolean connectedUserClient(PurchaseTickets purchaseUI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
