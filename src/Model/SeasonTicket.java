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
 
}
