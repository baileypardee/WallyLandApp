/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;
import java.util.Calendar;
import java.util.UUID;
/**
 *
 * @author Hayden
 */
public abstract class Ticket {
    protected double price;
    protected boolean paid = false;
    protected UUID ID;
    protected Date startDate = new Date();
    protected int daysActive;
    protected Date expDate;

    public Ticket(double price, boolean paid, UUID ID, Date startDate, int daysActive, Date expDate) {
        this.price = price;
        this.paid = paid;
        this.ID = ID;
        this.startDate = startDate;
        this.daysActive = daysActive;
        this.expDate = expDate;
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

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDaysActive() {
        return daysActive;
    }

    public void setDaysActive(int daysActive) {
        this.daysActive = daysActive;
    }

}
