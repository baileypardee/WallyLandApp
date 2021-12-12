/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author hayde
 */
public class DayTicket extends Ticket {
    private double price = 49.99;
    private int daysActive = 1;
    
    public DayTicket(double price, boolean paid, UUID ID, Date startDate, int daysActive) {
        super(price, paid, ID, startDate, daysActive);
        this.price = price;
        this.daysActive = daysActive;
        
    }
    
}
