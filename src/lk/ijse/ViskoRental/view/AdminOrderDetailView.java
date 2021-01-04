/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ViskoRental.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.ijse.ViskoRental.controller.ClientRegistrationcontrollr;
import lk.ijse.ViskoRental.controller.OrderDetailsController;
import lk.ijse.ViskoRental.controller.PaymentDetailController;
import lk.ijse.ViskoRental.controller.PlaceOrderController;
import lk.ijse.ViskoRental.model.Client;
import lk.ijse.ViskoRental.model.Order;
import lk.ijse.ViskoRental.model.OrderDetail;

/**
 *
 * @author hp
 */
public class AdminOrderDetailView extends javax.swing.JFrame {

    private int selectedRow;

    

    /**
     * Creates new form OrderDetailView
     */
    public AdminOrderDetailView() {
        initComponents();
        setLocationRelativeTo(null);

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        txtClientName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnSarch = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblClient = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblorder = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblorderDetails = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnClientRegistration = new javax.swing.JButton();
        btnRepair = new javax.swing.JButton();
        btnItemDetails = new javax.swing.JButton();
        btnUserRegistration = new javax.swing.JButton();
        btnPayemnetDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnClientPayment = new javax.swing.JButton();
        btnAddorder = new javax.swing.JButton();
        btnEmployeeRegistration = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(72, 219, 251));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 460, 59));

        jButton17.setBackground(new java.awt.Color(0, 51, 255));
        jButton17.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jButton17.setForeground(java.awt.Color.white);
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/back_arrow_48px.png"))); // NOI18N
        jButton17.setText("BACK");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 740, 190, 50));

        txtClientName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 310, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Client Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 120, -1));

        btnSarch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSarch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/search_48px.png"))); // NOI18N
        btnSarch.setText("SARCH");
        btnSarch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSarchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSarch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 180, 50));

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

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClientRegistration.setBackground(java.awt.Color.black);
        btnClientRegistration.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnClientRegistration.setForeground(java.awt.Color.white);
        btnClientRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/add_user_male_40px.png"))); // NOI18N
        btnClientRegistration.setText("Client Registration");
        btnClientRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientRegistrationActionPerformed(evt);
            }
        });
        jPanel2.add(btnClientRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, 70));

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
        jPanel2.add(btnRepair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 310, 70));

        btnItemDetails.setBackground(java.awt.Color.black);
        btnItemDetails.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnItemDetails.setForeground(java.awt.Color.white);
        btnItemDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/grinding_machine_48px.png"))); // NOI18N
        btnItemDetails.setText("  Item Details");
        btnItemDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemDetailsActionPerformed(evt);
            }
        });
        jPanel2.add(btnItemDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 310, 70));

        btnUserRegistration.setBackground(java.awt.Color.black);
        btnUserRegistration.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnUserRegistration.setForeground(java.awt.Color.white);
        btnUserRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/add_user_male_48px.png"))); // NOI18N
        btnUserRegistration.setText("User Registration");
        btnUserRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserRegistrationActionPerformed(evt);
            }
        });
        jPanel2.add(btnUserRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 310, 70));

        btnPayemnetDetails.setBackground(java.awt.Color.black);
        btnPayemnetDetails.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnPayemnetDetails.setForeground(java.awt.Color.white);
        btnPayemnetDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/paper_money_48px.png"))); // NOI18N
        btnPayemnetDetails.setText("Payment Details");
        btnPayemnetDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayemnetDetailsActionPerformed(evt);
            }
        });
        jPanel2.add(btnPayemnetDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 310, 70));

        jLabel2.setBackground(new java.awt.Color(72, 219, 251));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/menu_48px.png"))); // NOI18N
        jLabel2.setText("HOME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 59));

        btnClientPayment.setBackground(java.awt.Color.black);
        btnClientPayment.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnClientPayment.setForeground(java.awt.Color.white);
        btnClientPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/paper_money_48px.png"))); // NOI18N
        btnClientPayment.setText("Client Payment");
        btnClientPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientPaymentActionPerformed(evt);
            }
        });
        jPanel2.add(btnClientPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 310, 70));

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
        jPanel2.add(btnAddorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 310, 70));

        btnEmployeeRegistration.setBackground(java.awt.Color.black);
        btnEmployeeRegistration.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        btnEmployeeRegistration.setForeground(java.awt.Color.white);
        btnEmployeeRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ViskoRental/icon/worker_48px.png"))); // NOI18N
        btnEmployeeRegistration.setText("Employee Registration");
        btnEmployeeRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeRegistrationActionPerformed(evt);
            }
        });
        jPanel2.add(btnEmployeeRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 310, 70));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(72, 219, 251));
        jLabel9.setFont(new java.awt.Font("Stencil", 3, 50)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Visko Rental");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 680, 59));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1316, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientRegistrationActionPerformed
        new AdminClintRegistratoinView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnClientRegistrationActionPerformed

    private void btnRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepairActionPerformed
        new AdminRepairDetailsView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRepairActionPerformed

    private void btnItemDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemDetailsActionPerformed
        new AdminItemDetailView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnItemDetailsActionPerformed

    private void btnUserRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserRegistrationActionPerformed
        new AdminUserRegitrationView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnUserRegistrationActionPerformed

    private void btnPayemnetDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayemnetDetailsActionPerformed
        new AdminPaymentDetailsView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnPayemnetDetailsActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new AdminDashBordView().setVisible(true);

    }//GEN-LAST:event_formWindowClosed

    private void btnClientPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientPaymentActionPerformed
        new AdminClientPaymentView().setVisible(true);

    }//GEN-LAST:event_btnClientPaymentActionPerformed

    private void btnAddorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddorderActionPerformed
        new AdminPlaceOrderView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnAddorderActionPerformed

    private void btnEmployeeRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeRegistrationActionPerformed
        new AdminEmployeeRegistrationView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnEmployeeRegistrationActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed

    }//GEN-LAST:event_txtClientNameActionPerformed

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
              

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminClientPaymentView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblorderMouseClicked

    private void tblorderDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblorderDetailsMouseClicked

    }//GEN-LAST:event_tblorderDetailsMouseClicked

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
            java.util.logging.Logger.getLogger(AdminOrderDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOrderDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOrderDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOrderDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOrderDetailView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddorder;
    private javax.swing.JButton btnClientPayment;
    private javax.swing.JButton btnClientRegistration;
    private javax.swing.JButton btnEmployeeRegistration;
    private javax.swing.JButton btnItemDetails;
    private javax.swing.JButton btnPayemnetDetails;
    private javax.swing.JButton btnRepair;
    private javax.swing.JButton btnSarch;
    private javax.swing.JButton btnUserRegistration;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    // End of variables declaration//GEN-END:variables



   
   


}
