package Controller;

import View.purchaseTickets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * this will control the purchase gui
 * @author hayde
 */
public class purchaseTicketsController implements ActionListener {
    private purchaseTickets purchaseTix;
    private viewTicketsController viewTix;
    private NavigationController navCntrl;

    /**
     * getter for purchased tickets
     * @return (gets purchased tickets)
     */
    public purchaseTickets getPurchaseTix() {
        return purchaseTix;
    }

    /**
     * setter for purchase tickets
     * @param purchaseTix sets variable of purchase tickets type
     */
    public void setPurchaseTix(purchaseTickets purchaseTix) {
        this.purchaseTix = purchaseTix;
    }

    /**
     * getter for view tickets controller
     * @return (gets an instance of the view tickets controller)
     */
    public viewTicketsController getViewTix() {
        return viewTix;
    }

    /**
     * setter for view tickets
     * @param viewTix sets variable of viewTicketsController type
     */
    public void setViewTix(viewTicketsController viewTix) {
        this.viewTix = viewTix;
    }
    
    /**
     * create the purchase tickets gui
     */
    public purchaseTicketsController(NavigationController navCntrl) {
        this.navCntrl = navCntrl;
        purchaseTix = new purchaseTickets();
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
            viewTix = new viewTicketsController(navCntrl, this);
            purchaseTix.setVisible(false);
        }
        if(obj == purchaseTix.submitBuyTickets)
        {
            navCntrl = new NavigationController();
            purchaseTix.setVisible(false);
        }
        
    }

}
