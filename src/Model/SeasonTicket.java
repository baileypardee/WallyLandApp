/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hayde
 */
public class SeasonTicket extends Ticket {

    public SeasonTicket(double price, boolean paid, int ID, String startDate, int daysActive) {
        super(price, paid, ID, startDate, daysActive);
    }

    public double getPrice() {
        return getPrice();
    }

    public void setPrice(double price) {
        this.setPrice(price);
    }

    public boolean isPaid() {
        return isPaid();
    }

    public void setPaid(boolean paid) {
        this.setPaid(paid);
    }

    public int getID() {
        return getID();
    }

    public void setID(int ID) {
        this.setID(ID);
    }

    public String getStartDate() {
        return getStartDate();
    }

    public void setStartDate(String startDate) {
        this.setStartDate(startDate);
    }

    public int getDaysActive() {
        return getDaysActive();
    }

    public void setDaysActive(int daysActive) {
        this.setDaysActive(daysActive);
    }
    
 
}
