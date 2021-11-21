package Model;

/**
 * this will handle purchasing (credit card) information and verify purchases
 * for tickets
 *
 * @author hayde
 */
public class purchaseModel {

    private double price;

    public double getPrice() {
        return price;
    }

    /**
     * will verify purchase with either a database for 3rd party\
     *
     * @param price is price of tickets
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public static void handlePurchases(double price) {
        System.out.println(price);
    }

    /**
     * will add ticket to user
     *
     * @return a variable of Ticket type
     */
    public Ticket addTicket() {
        return null;

    }

}
