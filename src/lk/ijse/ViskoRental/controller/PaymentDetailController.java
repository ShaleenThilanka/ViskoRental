/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ViskoRental.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.ViskoRental.db.DBConnection;
import lk.ijse.ViskoRental.model.PaymentDetail;

/**
 *
 * @author hp
 */
public class PaymentDetailController {

    public static String generatePayID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT paymentID FROM payment ORDER BY  paymentID DESC LIMIT 1");

        if (rst.next()) {

            String tempId = rst.getString(1);
            String[] arr = tempId.split("P");
            int id = Integer.parseInt(arr[1]);
            id += 1;

            if (id < 10) {
                return "P00" + id;
            } else if (id < 100) {
                return "P0" + id;
            } else {
                return "P" + id;
            }
        } else {
            return "P001";
        }

    }

    public static boolean AddPayment(PaymentDetail paymentdetail) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO payment VALUES(?,?,?,?,?,?,?)");

        stm.setObject(1, paymentdetail.getPaymentID());
        stm.setObject(2, paymentdetail.getOrderID());
        stm.setObject(3, paymentdetail.getEmployeeId());
        stm.setObject(4, paymentdetail.getRepairID());
        stm.setObject(5, paymentdetail.getDate());
        stm.setObject(6, paymentdetail.getIncome());
        stm.setObject(7, paymentdetail.getSpend());
        return stm.executeUpdate() > 0;

    }

    public static ArrayList<PaymentDetail> getAllpayment() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From payment order by paymentID desc");
        ArrayList<PaymentDetail> paymentList = new ArrayList<>();
        while (rst.next()) {
            PaymentDetail paymentdetail = new PaymentDetail();
            paymentdetail.setPaymentID(rst.getString("paymentID"));
            paymentdetail.setOrderID(rst.getString("orderID"));
            paymentdetail.setEmployeeId(rst.getString("employeeID"));
            paymentdetail.setRepairID(rst.getString("repairID"));
            paymentdetail.setDate(rst.getString("date"));
            paymentdetail.setIncome(rst.getDouble("income"));
            paymentdetail.setSpend(rst.getDouble("spend"));
            paymentList.add(paymentdetail);

        }
        return paymentList;

    }

}
