package Controller;

import Controller.CreditCardInputViewController;
import Controller.ViewTicketsController;
import Controller.TicketsOrderController;
import Model.DayTicket;
import Model.Ticket;
import Model.User;
import View.ViewTickets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JTable;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author hayde
 */
public class ViewTicketsController implements ActionListener{//will grab tickets based on a verified user and control from here
    private NavigationController navCntrl;
    private CreditCardInputViewController purchaseTicketsCntrl;
    private TicketsOrderController orderTicketsController;
    private ViewTickets viewTicketsUI;
    
    
    /**
     * Constructor for the view tickets controller class
     * @param navCntrl instance of the navigation controller
     * @param purchaseTicketsCntrl instance of the purchase tickets controller
     */
    public ViewTicketsController(NavigationController navCntrl) {
        this.navCntrl = navCntrl;
        viewTicketsUI = new ViewTickets();
        viewTicketsUI.menuBtn.addActionListener(this);
        viewTicketsUI.purchaseBtn.addActionListener(this);
        viewTicketsUI.setVisible(true);
        ArrayList<JSONObject> matchedTickets = readAndMatchTicketsToUser();
        
    }
    
    public  ArrayList<HashMap<String, String>> readAndMatchTicketsToUser(String currentUserName){
        JSONParser ticketParser = new JSONParser();
        ArrayList<HashMap<String, String>> popTickets = new ArrayList();
        
        try (FileReader reader = new FileReader("tickets.json")){
            Object incoming = ticketParser.parse(reader);
            JSONArray ticketList = (JSONArray) incoming;
            
            ticketList.forEach(tix -> {
                JSONObject currentTicket = (JSONObject) tix;
                
                if(currentTicket.get("User").equals(currentUserName)){
                    HashMap<String, String> currentTixValues = parseTicketObject(currentTicket, currentUserName);
                    popTickets.add(currentTixValues);
                }
            });

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ParseException e){
            e.printStackTrace();
        }
        
        return popTickets;
    }
    
    private HashMap<String, String> parseTicketObject(JSONObject ticket, String currentUserName){
        JSONObject ticketObject = (JSONObject) ticket.get("ticket");
        HashMap<String, String> ticketValues = new HashMap();
        
        ticketValues.put("ID", (String)ticketObject.get("ID"));
        ticketValues.put("User", currentUserName);
        ticketValues.put("Type", (String)ticketObject.get("Type"));
        ticketValues.put("Purchase Date", (String) ticketObject.get("Purchase Date"));
        ticketValues.put("EXP Date", (String)ticketObject.get("Exp Date"));
        ticketValues.put("Price", (String)ticketObject.get("Price"));

        return ticketObject;
    }
    
    public void populateJTable(ArrayList<HashMap<String, String>> ticketsToPopulate){
        String columnNames[] = new String[]{"ID", "User", "Type", "Purchase Date", "Exp Date", "Price"};
        int amtTix = ticketsToPopulate.size();
        int amtCols = columnNames.length;
        
        Object[][] tableData = new Object[amtTix][amtCols];
        
        for(int o = 0; o < amtTix; o++){
            HashMap<String, String>tmpData = (HashMap<String, String>)ticketsToPopulate.get(o);
            Set<String> key = tmpData.keySet();
            Iterator ticketPlace = key.iterator();
            
            while(ticketPlace.hasNext()){
                String tixKey = (String) ticketPlace.next();
                String tixVal = (String) ticket
                
                tableData[o][i] = 
            }
        }
        
        JTable ticketTable = new JTable(tableData, columnNames);
        viewTicketsUI.setTicketTable(ticketTable);
    }
    
    /**
     * Action Events for buttons
     * @param e representing an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == viewTicketsUI.menuBtn)
        {
            navCntrl = new NavigationController();
            viewTicketsUI.setVisible(false);
        }
        else if(obj == viewTicketsUI.purchaseBtn){
            orderTicketsController = new TicketsOrderController(navCntrl);
            viewTicketsUI.setVisible(false);
        }
    }

    public boolean connectedUserClient(ViewTickets viewUI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
