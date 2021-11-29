package View;

import Controller.RestaurantController;
import Model.Restaurants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author bpardee
 */
public class TicketOrderUI extends javax.swing.JFrame {
    private RestaurantController restCntrl;
    private Restaurants restaurant;
    private TicketOrderUI menuUI;
    /**
     * Creates new form RestaurantMenuUI
     * @param restCntrl references the Restaurant Controller class
     * @param restaurant references the Restaurants class
     */
    public TicketOrderUI(RestaurantController restCntrl, Restaurants restaurant) {
        this.restCntrl = restCntrl;
        this.restaurant = restaurant;
        initComponents();
        progressBar = new javax.swing.JProgressBar(0, 100);
        jPanel2.add(progressBar);
        progressBar.setSize(350,40);
        progressBar.setValue(2);
        progressBar.setVisible(true);
    }
    
    /**
     * Method to connect to our RestaurantController
     * @param restController a menu
     * @return the connection status
     */   
    public boolean connectedRestServer(RestaurantController restController) {
        restCntrl = restController;
        return true;
    }

    /**
     * getter for menu item 1 label
     * @return JLabel menuItem1
     */
    public JLabel getMenuItem1() {
        return menuItem1;
    }

    /**
     * setter for menu item 1
     * @param menuItem1 JLabel for menu item 1
     */
    public void setMenuItem1(String menuItem1) {
        this.menuItem1.setText(menuItem1);
    }

    /**
     * getter for menu item 2 label
     * @return JLabel menuItem2
     */
    public JLabel getMenuItem2() {
        return menuItem2;
    }

    /**
     * setter for menu item 2
     * @param menuItem1 JLabel for menu item 2
     */
    public void setMenuItem2(String menuItem2) {
        this.menuItem2.setText(menuItem2);
    }

    /**
     * getter for menu item 3 label
     * @return JLabel menuItem3
     */
    public JLabel getMenuItem3() {
        return menuItem3;
    }

    /**
     * setter for menu item 3
     * @param menuItem1 JLabel for menu item 3
     */
    public void setMenuItem3(String menuItem3) {
        this.menuItem3.setText(menuItem3);
    }

    /**
     * getter for menu item 4 label
     * @return JLabel menuItem4
     */
    public JLabel getMenuItem4() {
        return menuItem4;
    }

    /**
     * setter for menu item 4
     * @param menuItem1 JLabel for menu item 4
     */
    public void setMenuItem4(String menuItem4) {
        this.menuItem4.setText(menuItem4);
    }

    public JSpinner getMenuItemAmt2() {
        return dayTixAmt;
    }

    public void setMenuItemAmt2(JSpinner menuItemAmt2) {
        this.dayTixAmt = menuItemAmt2;
    }

    public JSpinner getMenuItemAmt3() {
        return weekTixAmt;
    }

    public void setMenuItemAmt3(JSpinner menuItemAmt3) {
        this.weekTixAmt = menuItemAmt3;
    }

    public JSpinner getMenuItemAmt4() {
        return seasonTixAmt;
    }

    public void setMenuItemAmt4(JSpinner menuItemAmt4) {
        this.seasonTixAmt = menuItemAmt4;
    }

    /**
     * getter for menu item 2 price
     * @return JLabel menuItemPrice2
     */
    public JLabel getMenuItemPrice2() {
        return menuItemPrice2;
    }

    /**
     * setter for menu item 2 price
     * @param menuItemPrice2 JLabel for menuItemPrice2
     */
    public void setMenuItemPrice2(Double menuItemPrice2) {
        this.menuItemPrice2.setText(String.format("%.2f", menuItemPrice2));
    }

    /**
     * getter for menu item 3 price
     * @return JLabel menuItemPrice3
     */
    public JLabel getMenuItemPrice3() {
        return menuItemPrice3;
    }

    /**
     * setter for menu item 3 price
     * @param menuItemPrice3 JLabel for menuItemPrice3
     */
    public void setMenuItemPrice3(Double menuItemPrice3) {
        this.menuItemPrice3.setText(String.format("%.2f", menuItemPrice3));
    }

    /**
     * getter for menu item 4 price
     * @return JLabel menuItemPrice4
     */
    public JLabel getMenuItemPrice4() {
        return menuItemPrice4;
    }

    /**
     * setter for menu item 4 price
     * @param menuItemPrice4 JLabel for menuItemPrice4
     */
    public void setMenuItemPrice4(Double menuItemPrice4) {
        this.menuItemPrice4.setText(String.format("%.2f", menuItemPrice4));
    }

    /**
     * getter for menu title
     * @return JLabel menuTitle
     */
    public JLabel getMenuTitle() {
        return menuTitle;
    }

    /**
     * setter for menu title
     * @param title String for menu title
     */
    public void setMenuTitle(String title) {
        this.menuTitle.setText(title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        menuTitle = new javax.swing.JLabel();
        menuItem1 = new javax.swing.JLabel();
        menuItem2 = new javax.swing.JLabel();
        menuItem3 = new javax.swing.JLabel();
        menuItem4 = new javax.swing.JLabel();
        dayTixAmt = new javax.swing.JSpinner();
        weekTixAmt = new javax.swing.JSpinner();
        seasonTixAmt = new javax.swing.JSpinner();
        purchaseTixBtn = new javax.swing.JButton();
        menuItemPrice2 = new javax.swing.JLabel();
        menuItemPrice3 = new javax.swing.JLabel();
        menuItemPrice4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 190, 122));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

        menuTitle.setBackground(new java.awt.Color(255, 255, 255));
        menuTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        menuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTitle.setText("Tickets");

        menuItem2.setText("Day Ticket");

        menuItem3.setText("Weekly Ticket");

        menuItem4.setText("Season Ticket");

        dayTixAmt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        weekTixAmt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        seasonTixAmt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        purchaseTixBtn.setText("Purchase");
        purchaseTixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseTixBtnActionPerformed(evt);
            }
        });

        menuItemPrice2.setText("5.99");

        menuItemPrice3.setText("4.50");

        menuItemPrice4.setText("4.00");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        backBtn.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItem1)
                            .addComponent(menuItem2)
                            .addComponent(menuItem3)
                            .addComponent(menuItem4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemPrice2)
                            .addComponent(menuItemPrice3)
                            .addComponent(menuItemPrice4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dayTixAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(weekTixAmt)
                            .addComponent(seasonTixAmt))
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(purchaseTixBtn)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItem1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem2)
                    .addComponent(dayTixAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem3)
                    .addComponent(weekTixAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItem4)
                    .addComponent(seasonTixAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemPrice4))
                .addGap(93, 93, 93)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseTixBtn)
                    .addComponent(backBtn))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseTixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseTixBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseTixBtnActionPerformed

    private javax.swing.JProgressBar progressBar;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backBtn;
    private javax.swing.JSpinner dayTixAmt;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel menuItem1;
    private javax.swing.JLabel menuItem2;
    private javax.swing.JLabel menuItem3;
    private javax.swing.JLabel menuItem4;
    private javax.swing.JLabel menuItemPrice2;
    private javax.swing.JLabel menuItemPrice3;
    private javax.swing.JLabel menuItemPrice4;
    private javax.swing.JLabel menuTitle;
    public javax.swing.JButton purchaseTixBtn;
    private javax.swing.JSpinner seasonTixAmt;
    private javax.swing.JSpinner weekTixAmt;
    // End of variables declaration//GEN-END:variables
    }
