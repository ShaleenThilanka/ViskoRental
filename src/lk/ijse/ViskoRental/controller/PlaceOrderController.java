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
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.ViskoRental.db.DBConnection;
import lk.ijse.ViskoRental.model.Client;
import lk.ijse.ViskoRental.model.Order;
import lk.ijse.ViskoRental.model.OrderDetail;

/**
 *
 * @author hp
 */
public class PlaceOrderController {

    public static String genarateOrderId() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT orderId FROM orders ORDER BY  orderId DESC LIMIT 1");
        if (rst.next()) {
            String tempId = rst.getString(1);
            String[] arr = tempId.split("OD");
            int id = Integer.parseInt(arr[1]);
            id += 1;

            if (id < 10) {
                return "OD00" + id;
            } else if (id < 100) {
                return "OD0" + id;
            } else {
                return "OD" + id;
            }
        } else {
            return "OD001";
        }

    }

    public static boolean addOrder(Order order) throws ClassNotFoundException, SQLException {

        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Insert into Orders values(?,?,?,?)");
        try {
            DBConnection.getInstance().getConnection().setAutoCommit(false);
            stm.setObject(1, order.getOrderID());
            stm.setObject(2, order.getClientID());
            stm.setObject(3, order.getEmployeeId());
            stm.setObject(4, order.getOrderDate());

            boolean orderIsAdded = stm.executeUpdate() > 0;
            if (orderIsAdded) {
                boolean addAllOrderDetial = OrderDetailsController.addOrderDetail(order.getOrderDetailList());
                if (addAllOrderDetial) {
                    boolean isUpdateItemStock = OrderDetailsController.updateStock(order.getOrderDetailList());
                    if (isUpdateItemStock) {
                        DBConnection.getInstance().getConnection().commit();
                        return true;
                    }
                }
            }
            DBConnection.getInstance().getConnection().rollback();
            return false;
        } finally {
            DBConnection.getInstance().getConnection().setAutoCommit(true);
        }
    }

    public static ArrayList<Order> sarchOrderId(String orderid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * from orders where clientId='" + orderid + "'");
        ArrayList<Order> orderList = new ArrayList<>();
        while (rst.next()) {
            Order order = new Order();
            order.setOrderID(rst.getString("orderid"));
            order.setClientID(rst.getString("clientID"));
            order.setEmployeeId(rst.getString("Employeeid"));
            order.setOrderDate(rst.getString("orderDate"));

            orderList.add(order);

        }
        return orderList;

    }

    public static ArrayList<Order> getAllOrder() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From orders order by orderID  desc");
        ArrayList<Order> orderList = new ArrayList<>();
        while (rst.next()) {
            Order order = new Order();
            order.setOrderID(rst.getString("orderId"));
            order.setClientID(rst.getString("orderid"));
            order.setEmployeeId(rst.getString("employeeId"));
            order.setOrderDate(rst.getString("orderDate"));

            orderList.add(order);

        }
        return orderList;

    }

}
