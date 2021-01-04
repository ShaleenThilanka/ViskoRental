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
import lk.ijse.ViskoRental.model.Client;
import lk.ijse.ViskoRental.model.Order;

import lk.ijse.ViskoRental.model.OrderDetail;
import lk.ijse.ViskoRental.model.Repair;

/**
 *
 * @author hp
 */
public class OrderDetailsController {

    static boolean addOrderDetail(ArrayList<OrderDetail> orderList) throws ClassNotFoundException, SQLException {

        for (OrderDetail orderdetail : orderList) {
            boolean isAdded = OrderDetailsController.addOrderDetail(orderdetail);
            if (!isAdded) {
                return false;
            }
        }
        return true;

    }

    private static boolean addOrderDetail(OrderDetail orderdetail) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Insert INTO orderdetail Values(?,?,?,?,?,?)");
        stm.setObject(1, orderdetail.getOrderID());
        stm.setObject(2, orderdetail.getSerial_No());
        stm.setObject(3, orderdetail.getQty());
        stm.setObject(4, orderdetail.getDeposite_on_hand());
        stm.setObject(5, orderdetail.getRetrun_date());
        stm.setObject(6, orderdetail.getTotalDayCost());

        return stm.executeUpdate() > 0;

    }

    static boolean updateStock(ArrayList<OrderDetail> orderList) throws ClassNotFoundException, SQLException {
        for (OrderDetail orderdetail : orderList) {
            boolean isUpdate = OrderDetailsController.updateStock(orderdetail);
            if (!isUpdate) {
                return false;
            }
        }
        return true;

    }

    private static boolean updateStock(OrderDetail orderdetail) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update Item set Qty_On_Hand=Qty_On_Hand-? where serial_No=?");

        stm.setObject(1, orderdetail.getQty());
        stm.setObject(2, orderdetail.getSerial_No());
        return stm.executeUpdate() > 0;

    }

    public static OrderDetail sarchOrders(String orderid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();

        String SQL = "Select * From OrderDetail where orderId='" + orderid + "'";
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            return new OrderDetail(
                    rst.getString("OrderId"),
                    rst.getString("Serial_no"),
                    rst.getString("qty"),
                    rst.getDouble("deposite_on_hand"),
                    rst.getString("retrun_date"),
                    rst.getDouble("totalDayCost")
            );
        }
        return null;

    }

    public static ArrayList<OrderDetail> sarchOrderetail(String orderid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From OrderDetail where orderId='" + orderid + "'");
        ArrayList<OrderDetail> orderdetailList = new ArrayList<>();
        while (rst.next()) {
            OrderDetail orderdetail = new OrderDetail();
            orderdetail.setOrderID(rst.getString("OrderId"));
            orderdetail.setSerial_No(rst.getString("Serial_no"));
            orderdetail.setQty(rst.getString("qty"));
            orderdetail.setDeposite_on_hand(rst.getDouble("deposite_on_hand"));
            orderdetail.setRetrun_date(rst.getString("retrun_date"));
            orderdetail.setTotalDayCost(rst.getDouble("totalDayCost"));

            orderdetailList.add(orderdetail);

        }
        return orderdetailList;

    }

    public static boolean updateOrders(OrderDetail orderdetail) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update Orderdetail set qty=?, deposite_on_hand=?, retrun_date=? ,totalDayCost= ?  where orderid=? and serial_no=? ");
        try {
            DBConnection.getInstance().getConnection().setAutoCommit(false);
            stm.setObject(5, orderdetail.getOrderID());
            stm.setObject(6, orderdetail.getSerial_No());
            stm.setObject(1, orderdetail.getQty());
            stm.setObject(2, orderdetail.getDeposite_on_hand());
            stm.setObject(3, orderdetail.getRetrun_date());
            stm.setObject(4, orderdetail.getTotalDayCost());

            boolean isupdated = stm.executeUpdate() > 0;
            if (isupdated) {
                boolean isreturn = OrderDetailsController.updateReturn(orderdetail);
                if (isreturn) {
                    DBConnection.getInstance().getConnection().commit();
                    return true;
                }
            }
            DBConnection.getInstance().getConnection().rollback();
            return false;

        } finally {
            DBConnection.getInstance().getConnection().setAutoCommit(true);
        }

    }

    private static boolean updateReturn(OrderDetail orderdetail) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update Item set Qty_On_Hand=Qty_On_Hand+? where serial_No=?");

        stm.setObject(1, orderdetail.getQty());
        stm.setObject(2, orderdetail.getSerial_No());
        return stm.executeUpdate() > 0;

    }

    static boolean updateReturn(Repair repair) throws ClassNotFoundException, SQLException {
       
    PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update Item set Qty_On_Hand=Qty_On_Hand+? where serial_No=?");

        stm.setObject(1, repair.getQty());
        stm.setObject(2, repair.getSerial_No());
        return stm.executeUpdate() > 0;
    
    }

}
