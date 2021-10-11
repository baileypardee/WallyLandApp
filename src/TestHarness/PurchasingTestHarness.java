
package TestHarness;

import Controller.purchaseTicketsController;
import Controller.viewTicketsController;
import Controller.RestaurantOrderController;
import Model.Restaurants;
import Model.adminModel;
import Model.purchaseModel;
import Model.viewTicketModel;
import View.viewTickets;
import View.purchaseTickets;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hayde
 */
public class PurchasingTestHarness {
        
        // purchase interface
        purchaseTicketsController purCntl = new purchaseTicketsController();
        purchaseTickets purchaseUI = new purchaseTickets();
        
        // view interface
        viewTicketsController viewCntl = new viewTicketsController();
        viewTickets viewUI = new viewTickets();
        
        // Restaurant Ordering (menu and order) - create interface and logic
        viewTicketModel viewThem = new viewTicketModel();
        purchaseModel purchaseSome = new purchaseModel();
        
        // Package -> Controller -> purchaseTicketsController test stubs
        public void PTTestStubs() {
            boolean connectStatus = purCntl.connectedUserClient(purchaseUI);
            System.out.println("  purchaseTicketsController.connectUserClient output: " + connectStatus);
        }

        // Package -> Controller -> viewTicketsController
       public void VTTestStubs() {
            boolean connectStatus = viewCntl.connectedUserClient(viewUI);
            System.out.println("  viewTicketsController.connectUserClient output: " + connectStatus);
        }
       
       
       // Package -> View -> viewTixUI
       public void PTUITestStubs() {
            boolean boolStatus = viewUI.connectedRestServer(purCntl);
            System.out.println("  purchaseTicketsUI.connectRestServer output: " + boolStatus);
       }
       
       // Package -> View -> PurchaseTixUI
       public void VTITestStubs() {
            boolean boolStatus = purchaseUI.connectedRestServer(viewCntl);
            System.out.println("  viewTicketsUI.connectRestServer output: " + boolStatus);
       }

       // Package -> Model -> Restaurants
       public void VMTestStubs() {
           System.out.println("  Testing viewTicketModel Class -> setTicketID with 1241244");
           viewThem.setTicketID(1241244);
           System.out.println("  Testing viewTicketModel Class -> getTicketID: " + viewThem.getTicketID());
           
           System.out.println("  Testing viewTicketModel Class -> setTicketPrice with 24000");
           viewThem.setTicketPrice(24000);
           System.out.println("  Testing viewTicketModel Class -> getTicketPrice: " + viewThem.getTicketPrice());
           
           System.out.println("  Testing viewTicketModel Class -> setHasPaid with true");
           viewThem.setHasPaid(true);
           System.out.println("  Testing viewTicketModel Class -> getHasPaid: " + viewThem.getHasPaid());
           
       }
       
       public void PMTestStubs() {
           System.out.println("  Testing purchaseModel Class -> setPrice with 2321");
           purchaseSome.setPrice(2321);
           System.out.println("Getting price of ticket: " + purchaseSome.getPrice());
       }


}
