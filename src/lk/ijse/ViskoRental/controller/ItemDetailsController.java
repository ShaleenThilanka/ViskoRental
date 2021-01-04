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
import lk.ijse.ViskoRental.model.Item;

/**
 *
 * @author hp
 */
public class ItemDetailsController {

    public static boolean addItem(Item item) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO Item VALUES(?,?,?,?,?,?)");
        stm.setObject(1, item.getSerial_No());
        stm.setObject(2, item.getBrand_name());
        stm.setObject(3, item.getItem_name());
        stm.setObject(4, item.getQty_On_Hand());
        stm.setObject(5, item.getPer_cost_day());
        stm.setObject(6, item.getDeposite());

        return stm.executeUpdate() > 0;

    }

    public static boolean updateItem(Item item) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update item set  brand_name=?, item_name=?, Qty_on_hand=?, per_cost_day =?,deposite=? where serial_no=?");

        stm.setObject(1, item.getBrand_name());
        stm.setObject(2, item.getItem_name());
        stm.setObject(3, item.getQty_On_Hand());
        stm.setObject(4, item.getPer_cost_day());

        stm.setObject(5, item.getDeposite());
        stm.setObject(6, item.getSerial_No());
        return stm.executeUpdate() > 0;
    }

    public static ArrayList<Item> getAllItem() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From item order by serial_no desc");
        ArrayList<Item> itemList = new ArrayList<>();
        while (rst.next()) {
            Item item = new Item();
            item.setSerial_No(rst.getString("serial_No"));
            item.setBrand_name(rst.getString("brand_name"));
            item.setItem_name(rst.getString("item_name"));

            item.setQty_On_Hand(rst.getString("qty_on_hand"));
            item.setPer_cost_day(rst.getDouble("per_cost_day"));
            ;
            item.setDeposite(rst.getDouble("deposite"));

            itemList.add(item);

        }
        return itemList;

    }

    public static String generateSerialNumber() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT serial_No FROM Item ORDER BY serial_No DESC LIMIT 1");

        if (rst.next()) {

            String tempId = rst.getString(1);
            String[] arr = tempId.split("S");
            int id = Integer.parseInt(arr[1]);
            id += 1;

            if (id < 10) {
                return "S00" + id;
            } else if (id < 100) {
                return "S0" + id;
            } else {
                return "S" + id;
            }
        } else {
            return "S001";
        }
    }

    public static boolean deleteItem(String serialNO) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete from Item where serial_no='" + serialNO + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;

    }

    public static Item sarchItem(String serailno) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From Item where serial_No='" + serailno + "'";
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            return new Item(
                    rst.getString("serial_No"),
                    rst.getString("brand_name"),
                    rst.getString("item_name"),
                    rst.getString("qty_on_hand"),
                    rst.getDouble("per_cost_day"),
                    rst.getDouble("deposite")
            );
        }
        return null;
    }

    public Item getItem(String serialno) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT * FROM item WHERE serial_no='" + serialno + "'").executeQuery();
        if (rst.next()) {
            return new Item(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getDouble(6));

        }
        return null;
    }

    public Item getItemname(Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
