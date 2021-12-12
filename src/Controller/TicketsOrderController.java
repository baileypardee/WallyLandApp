package Controller;

import View.TicketOrderUI;
import Model.Ticket;
import Model.SeasonTicket;
import Model.DayTicket;
import Model.WeekTicket;
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
    private SeasonTicket seasonTix;
    private DayTicket dayTix;
    private WeekTicket weekTix;
    
    /**Constructor
     * 
     * @param navCntrl 
     */
    public TicketsOrderController(NavigationController navCntrl){
        this.navCntrl = navCntrl;
        ticketOrderUI = new TicketOrderUI(orderTix, seasonTix, weekTix, dayTix);
        ticketOrderUI.purchaseTixBtn.addActionListener(this);
        ticketOrderUI.menuBtn.addActionListener(this);
        ticketOrderUI.setVisible(true);
    }
    
    public void setTicketOrderValues() {
        ticketOrderUI.setDayTicketItem(dayTix.getType());
        ticketOrderUI.setWeekTicketItem(weekTix.getType());
        ticketOrderUI.setSeasonTicketItem(seasonTix.getType());
        ticketOrderUI.setDayTicketPrice(dayTix.getPrice());
        ticketOrderUI.setWeekTicketPrice(weekTix.getPrice());
        ticketOrderUI.setSeasonTicketPrice(seasonTix.getPrice());
    }
    
    public String getTicketOrders() {
        double total = Double.parseDouble(ticketOrderUI.getDayTicketPrice().getText()) * (Integer) ticketOrderUI.getDayTixAmt().getValue()
                + Double.parseDouble(ticketOrderUI.getWeekTicketPrice().getText()) * (Integer) ticketOrderUI.getWeekTixAmt().getValue()
                + Double.parseDouble(ticketOrderUI.getSeasonTicketPrice().getText()) * (Integer) ticketOrderUI.getSeasonTixAmt().getValue();
        return String.format("%.2f", total);
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
