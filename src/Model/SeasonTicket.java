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
 * @author hayde
 */
public class SeasonTicket extends Ticket {
    private double price = 499.99;
    private int daysActive = 80;
    private Date expDate = 
    
    

    public SeasonTicket(double price, boolean paid, UUID ID, Date startDate, int daysActive, Date expDate) {
        super(price, paid, ID, startDate, daysActive);
        this.price = price;
        this.daysActive = daysActive;
        
        
    }
    
 
}
