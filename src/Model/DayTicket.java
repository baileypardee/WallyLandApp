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
public class DayTicket extends Ticket {
    
    public DayTicket(double price, boolean paid, int ID, String startDate, int daysActive) {
        super(price, paid, ID, startDate, daysActive);
    }   
    
}
