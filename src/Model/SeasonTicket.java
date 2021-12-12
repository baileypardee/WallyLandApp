/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;
import java.time.LocalDate;
import java.util.UUID;
/**
 *
 * @author hayde
 */
public class SeasonTicket extends Ticket {
    private double price;
    private int daysActive;
    private LocalDate expDate;
    
    

    public SeasonTicket(double price, boolean paid, UUID Id, LocalDate startDate, int daysActive, LocalDate expDate) {
        super(price, paid, Id, startDate, daysActive, expDate);
        this.price = price;
        price = 499.99;
        this.daysActive = daysActive;
        daysActive = 80;
        this.expDate = expDate;
        expDate = startDate.plusDays(daysActive);
    }
    
 
}
