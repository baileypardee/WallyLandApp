package Controller;

import Model.Restaurants;
import View.NavigationUI;
import View.RestaurantMenuUI;
import View.RestaurantOrderUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author bpardee
 */
public class RestaurantController implements ActionListener {
    private NavigationController navCntrl;
    private RestaurantMenuUI menuUI;
    private Restaurants restaurant;
    private RestaurantOrderController orderCntrl;
    
    /**
     * Constructor for restaurant menu
     * @param navCntrl reference to the Navigation Controller class
     */
    public RestaurantController(NavigationController navCntrl) {
        this.navCntrl = navCntrl;
        restaurant = new Restaurants();
        menuUI = new RestaurantMenuUI(this, restaurant);
        menuUI.reviewOrderBtn.addActionListener(this);
        menuUI.setVisible(true);
    }
    
    /**
     * Action Events for buttons
     * @param e representing an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == menuUI.reviewOrderBtn)
        {
            orderCntrl = new RestaurantOrderController(this);
            menuUI.setVisible(false);
        }
    }
    
}
