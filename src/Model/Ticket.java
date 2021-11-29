/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Javod Fields
 */
public class Ticket {
    protected double price;
    protected boolean paid;
    protected int ID;
    protected String startDate;
    protected int daysActive;

    public Ticket(double price, boolean paid, int ID, String startDate, int daysActive) {
        this.price = price;
        this.paid = paid;
        this.ID = ID;
        this.startDate = startDate;
        this.daysActive = daysActive;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDaysActive() {
        return daysActive;
    }

    public void setDaysActive(int daysActive) {
        this.daysActive = daysActive;
    }
    
    
}
