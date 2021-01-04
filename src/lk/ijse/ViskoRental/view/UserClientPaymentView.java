/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ViskoRental.view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.ViskoRental.controller.ClientRegistrationcontrollr;
import lk.ijse.ViskoRental.controller.OrderDetailsController;
import lk.ijse.ViskoRental.controller.PaymentDetailController;
import lk.ijse.ViskoRental.controller.PlaceOrderController;
import lk.ijse.ViskoRental.model.Client;
import lk.ijse.ViskoRental.model.Order;
import lk.ijse.ViskoRental.model.OrderDetail;
import lk.ijse.ViskoRental.model.PaymentDetail;

/**
 *
 * @author hp
 */
public class UserClientPaymentView extends javax.swing.JFrame {

    private int selectedRow;

    /**
     * Creates new form ClientPaymentView
     */
    public UserClientPaymentView() {
        initComponents();
        setLocationRelativeTo(null);

        Date date = new Date();
        String formatDate = formatDate(date);
        txtreturn.setText(formatDate);
        txtDatePay.setText(formatDate);
        genaretePaymentID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRepair = new javax.swing.JButton();
        btnItemRegitration = new javax.swing.JButton();
        btnClientRegitration = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        btnAddorder = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblorderDetails = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnreturn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtreturn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblClient = new javax.swing.JTable();
        btnSarch = new javax.swing.JButton();
        btngetTotal = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblorder = new javax.swing.JTable();
        txtPayment = new javax.swing.JTextField();
        txtDayCost = new javax.swing.JTextField();
        txtdys = new javax.swing.JTextField();
        txttotalpayment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdiscount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtExtr = new javax.swing.JTextField();
        bntPay = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtPymnetID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDatePay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(72, 219, 251));
        jLabel10.setFont(new java.awt.Font("Stencil", 3, 50)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Visko Rental");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 562, 59));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRepair.setBackground(java.awt.Color.black);
        btnRepair.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnRepair.setForeground(java.awt.Color.white);
        btnRepair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/maintenance_48px.png"))); // NOI18N
        btnRepair.setText("Repair and Maintain ");
        btnRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepairActionPerformed(evt);
            }
        });
        jPanel2.add(btnRepair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 310, 70));

        btnItemRegitration.setBackground(java.awt.Color.black);
        btnItemRegitration.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnItemRegitration.setForeground(java.awt.Color.white);
        btnItemRegitration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/grinding_machine_48px.png"))); // NOI18N
        btnItemRegitration.setText("  Item Details");
        btnItemRegitration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemRegitrationActionPerformed(evt);
            }
        });
        jPanel2.add(btnItemRegitration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 310, 70));

        btnClientRegitration.setBackground(java.awt.Color.black);
        btnClientRegitration.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnClientRegitration.setForeground(java.awt.Color.white);
        btnClientRegitration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/paper_money_48px.png"))); // NOI18N
        btnClientRegitration.setText("Client Payment");
        btnClientRegitration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientRegitrationActionPerformed(evt);
            }
        });
        jPanel2.add(btnClientRegitration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 310, 70));

        jLabel3.setBackground(new java.awt.Color(72, 219, 251));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/menu_48px.png"))); // NOI18N
        jLabel3.setText("  HOME");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 290, 59));

        jButton19.setBackground(java.awt.Color.black);
        jButton19.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jButton19.setForeground(java.awt.Color.white);
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/go_back_48px.png"))); // NOI18N
        jButton19.setText("Log Out");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 790, 200, 50));

        btnAddorder.setBackground(java.awt.Color.black);
        btnAddorder.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnAddorder.setForeground(java.awt.Color.white);
        btnAddorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/add_shopping_cart_48px.png"))); // NOI18N
        btnAddorder.setText("Place Order");
        btnAddorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddorderActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, 70));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(26, 188, 156));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Item Return And Payment");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, -1));

        tblorderDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblorderDetails.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tblorderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Serial Number", "Qty", "Deposite", "Return Date", "Totat day Cost"
            }
        ));
        tblorderDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblorderDetailsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblorderDetails);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 1190, 120));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Day");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 60, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("One Item Day Cost");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 170, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/samana_sign_48px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 670, 50, -1));

        btnreturn.setBackground(new java.awt.Color(153, 153, 255));
        btnreturn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnreturn.setForeground(new java.awt.Color(0, 0, 153));
        btnreturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/return_48px.png"))); // NOI18N
        btnreturn.setText("Item Return");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 200, 60));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Client Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 120, -1));

        txtreturn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreturnActionPerformed(evt);
            }
        });
        jPanel1.add(txtreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 310, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Deposite");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 90, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Return Date/Time");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 170, -1));

        txtClientName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 310, 40));

        tblClient.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblClient.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Client Id", "Client Name", "Client Contact", "Client NIC", "Client Address"
            }
        ));
        tblClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblClient);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 1190, 120));

        btnSarch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSarch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/search_48px.png"))); // NOI18N
        btnSarch.setText("SARCH");
        btnSarch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSarchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSarch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 180, 50));

        btngetTotal.setBackground(new java.awt.Color(0, 204, 204));
        btngetTotal.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btngetTotal.setForeground(new java.awt.Color(0, 0, 0));
        btngetTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/bill_48px.png"))); // NOI18N
        btngetTotal.setText("Get Total");
        btngetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetTotalActionPerformed(evt);
            }
        });
        jPanel1.add(btngetTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 200, 50));

        tblorder.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblorder.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tblorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Client ID", "Employee ID", "Order Date"
            }
        ));
        tblorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblorderMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblorder);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 1190, 120));

        txtPayment.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPayment.setForeground(new java.awt.Color(255, 0, 0));
        txtPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentActionPerformed(evt);
            }
        });
        jPanel1.add(txtPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 670, 200, 40));

        txtDayCost.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtDayCost.setForeground(new java.awt.Color(255, 0, 0));
        txtDayCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayCostActionPerformed(evt);
            }
        });
        jPanel1.add(txtDayCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 190, 40));

        txtdys.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(txtdys, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, 70, 40));

        txttotalpayment.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txttotalpayment.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(txttotalpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 660, 200, 50));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Discount ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 640, -1, -1));

        txtdiscount.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtdiscount.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(txtdiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 670, 150, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Exater ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, -1, -1));

        txtExtr.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtExtr.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(txtExtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 670, 150, 40));

        bntPay.setBackground(new java.awt.Color(255, 255, 102));
        bntPay.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        bntPay.setForeground(new java.awt.Color(0, 0, 0));
        bntPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/income48px.png"))); // NOI18N
        bntPay.setText("  PAY");
        bntPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPayActionPerformed(evt);
            }
        });
        jPanel1.add(bntPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 780, 200, 60));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Date/Time");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 750, 110, 30));

        txtPymnetID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPymnetID.setForeground(new java.awt.Color(0, 0, 204));
        txtPymnetID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPymnetIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtPymnetID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 790, 180, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Payment ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 750, 110, 30));

        txtDatePay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtDatePay.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(txtDatePay, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 790, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepairActionPerformed
        new UserRepairDetailView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRepairActionPerformed

    private void btnItemRegitrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemRegitrationActionPerformed
        new UserItemDetailsView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnItemRegitrationActionPerformed

    private void btnClientRegitrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientRegitrationActionPerformed
        new UserClinetRegistrationView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnClientRegitrationActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new UserDshBordView().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void tblorderDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblorderDetailsMouseClicked

    }//GEN-LAST:event_tblorderDetailsMouseClicked

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblorderDetails.getModel();
        String orderid = null;
        String serialno = null;
        String qty = null;
        double deposite = 0;
        double day = 0;
        boolean isUpdated = false;
        String date = txtreturn.getText();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            try {
                orderid = tblorderDetails.getValueAt(i, 0).toString();
                serialno = tblorderDetails.getValueAt(i, 1).toString();
                qty = tblorderDetails.getValueAt(i, 2).toString();
                deposite = (Double) tblorderDetails.getValueAt(i, 3);
                day = (Double) tblorderDetails.getValueAt(i, 5);

                OrderDetail orderdetail = new OrderDetail(orderid, serialno, qty, deposite, date, day);

                isUpdated = OrderDetailsController.updateOrders(orderdetail);
                if (isUpdated) {
                    JOptionPane.showMessageDialog(this, "Item Is Return And Update Stock");

                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnreturnActionPerformed

    private void txtreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreturnActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed

    }//GEN-LAST:event_txtClientNameActionPerformed

    private void tblClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientMouseClicked
        try {
            selectedRow = tblClient.getSelectedRow();
            String orderid = tblClient.getValueAt(selectedRow, 1).toString();

            ArrayList<Order> allOrder = PlaceOrderController.sarchOrderId(orderid);

            DefaultTableModel dtm = (DefaultTableModel) tblorder.getModel();
            dtm.setRowCount(0);
            for (Order order : allOrder) {
                Object[] rowData = {
                    order.getOrderID(),
                    order.getClientID(),
                    order.getEmployeeId(),
                    order.getOrderDate()};
                dtm.addRow(rowData);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblClientMouseClicked

    private void btnSarchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSarchActionPerformed
        try {
            String name = txtClientName.getText();

            ArrayList<Client> allclient = ClientRegistrationcontrollr.sarchClientName(name);

            DefaultTableModel dtm = (DefaultTableModel) tblClient.getModel();
            dtm.setRowCount(0);
            for (Client client : allclient) {
                Object[] rowData = {
                    client.getUserID(),
                    client.getClientID(),
                    client.getClientName(),
                    client.getClientContact(),
                    client.getClientNIC_No(),
                    client.getClientAddress()};
                dtm.addRow(rowData);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSarchActionPerformed

    private void btngetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetTotalActionPerformed
        calculateTotalPayment();
    }//GEN-LAST:event_btngetTotalActionPerformed

    private void tblorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblorderMouseClicked
        try {

            selectedRow = tblorder.getSelectedRow();
            String orderid = tblorder.getValueAt(selectedRow, 0).toString();

            ArrayList<OrderDetail> allOrderDetail = OrderDetailsController.sarchOrderetail(orderid);

            DefaultTableModel dtm = (DefaultTableModel) tblorderDetails.getModel();
            dtm.setRowCount(0);
            for (OrderDetail orderdetail : allOrderDetail) {
                Object[] rowData = {
                    orderdetail.getOrderID(),
                    orderdetail.getSerial_No(),
                    orderdetail.getQty(),
                    orderdetail.getDeposite_on_hand(),
                    orderdetail.getRetrun_date(),
                    orderdetail.getTotalDayCost()

                };

                dtm.addRow(rowData);
                calculateTotalValue();

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblorderMouseClicked

    private void txtPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentActionPerformed

    private void txtDayCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayCostActionPerformed

    private void bntPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPayActionPerformed

        try {
            String pid = txtPymnetID.getText();
            String orderid = tblorderDetails.getValueAt(1, 0).toString();
            String empid = null;
            String rid = null;
            String date = txtDatePay.getText();
            double income = Double.parseDouble(txttotalpayment.getText());
            double spend = 0;

            PaymentDetail paymentdetail = new PaymentDetail(pid, orderid, empid, rid, date, income, spend);

            boolean isAdded = PaymentDetailController.AddPayment(paymentdetail);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Payment is Done");
                new AdminDashBordView().setVisible(true);
                this.dispose();
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bntPayActionPerformed

    private void txtPymnetIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPymnetIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPymnetIDActionPerformed

    private void btnAddorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddorderActionPerformed
        new UserPlaceDetailsView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnAddorderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserClientPaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserClientPaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserClientPaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserClientPaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserClientPaymentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPay;
    private javax.swing.JButton btnAddorder;
    private javax.swing.JButton btnClientRegitration;
    private javax.swing.JButton btnItemRegitration;
    private javax.swing.JButton btnRepair;
    private javax.swing.JButton btnSarch;
    private javax.swing.JButton btngetTotal;
    private javax.swing.JButton btnreturn;
    private javax.swing.JButton jButton19;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tblClient;
    private javax.swing.JTable tblorder;
    private javax.swing.JTable tblorderDetails;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtDatePay;
    private javax.swing.JTextField txtDayCost;
    private javax.swing.JTextField txtExtr;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtPymnetID;
    private javax.swing.JTextField txtdiscount;
    private javax.swing.JTextField txtdys;
    private javax.swing.JTextField txtreturn;
    private javax.swing.JTextField txttotalpayment;
    // End of variables declaration//GEN-END:variables

    private String formatDate(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdf.format(date);

    }

    private void calculateTotalValue() {

        DefaultTableModel dtm = (DefaultTableModel) tblorderDetails.getModel();

        double total = 0;
        double day = 0;
        for (int i = 0; i < dtm.getRowCount(); i++) {
            total += (double) dtm.getValueAt(i, 3);
            day += (double) dtm.getValueAt(i, 5);
        }
        txtDayCost.setText(day + "");
        txtPayment.setText(total + "");
    }

    private void calculateTotalPayment() {
        double dayCost = Double.parseDouble(txtDayCost.getText());
        double deposite = Double.parseDouble(txtPayment.getText());
        int days = Integer.parseInt(txtdys.getText());
        double extr = Double.parseDouble(txtExtr.getText());
        double discount = Double.parseDouble(txtdiscount.getText());

        double totalpay = dayCost * days - deposite + extr - discount;
        txttotalpayment.setText(totalpay + "");

    }

    private void genaretePaymentID() {
        try {
            String PayID = PaymentDetailController.generatePayID();
            txtPymnetID.setText(PayID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}