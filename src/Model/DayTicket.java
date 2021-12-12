/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author hayde
 */
public class DayTicket extends Ticket {
    private double price = 59.99;
    private int daysActive = 1;
    private String type = "DayTicket";
    
    

    public DayTicket(double price, boolean paid, UUID Id, LocalDate startDate, int daysActive, LocalDate expDate, String type) {
        super(price, paid, Id, startDate, daysActive, expDate, type);
        this.price = price;
        this.daysActive = daysActive;
        this.type = type;
    }
    
    
}
