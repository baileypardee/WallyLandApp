package Model;

/**
 * this will handle pulling up tickets from the database based on login information
 * @author hayde
 */
public class viewTicketModel {
    private double ticketID;
    private double ticketPrice;
    private boolean hasPaid;

    public double getTicketID() {
        return ticketID;
    }

    public void setTicketID(double ticketID) {
        this.ticketID = ticketID;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean getHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }
    
    /**
     * will get purchased tickets
     * @return a variable of User type
     */
    public Ticket getPurchasedTickets(double ticketID, double ticketPrice, boolean hasPaid){
        Ticket boughtTicket = new Ticket();
        this.ticketID = ticketID;
        this.ticketPrice = ticketPrice;
        this.hasPaid = hasPaid;
        
        return boughtTicket;
            
        
    }
    
    /**
     * sends info to controller to display purchased tickets
     * @return a variable of Tickets type
     */
    public Ticket displayPurchasedTickets(double ticketID, boolean hasPaid){
        Ticket ownedTicket = new Ticket();
        
        return ownedTicket;
        
    }


}