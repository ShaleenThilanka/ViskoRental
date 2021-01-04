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
import lk.ijse.ViskoRental.model.Repair;

/**
 *
 * @author hp
 */
public class RepairDetailsController {

    public static String generateRepairId() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT repairID  FROM repair_AND_maintain ORDER BY  repairID  DESC LIMIT 1");
        if (rst.next()) {

            String tempId = rst.getString(1);
            String[] arr = tempId.split("R");
            int id = Integer.parseInt(arr[1]);
            id += 1;

            if (id < 10) {
                return "R00" + id;
            } else if (id < 100) {
                return "R0" + id;
            } else {
                return "R" + id;
            }
        } else {
            return "R001";
        }
    }

    public static boolean AddRepair(Repair repair) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO repair_AND_maintain VALUES(?,?,?,?,?)");
        try {
            DBConnection.getInstance().getConnection().setAutoCommit(false);
            stm.setObject(1, repair.getRepairID());
            stm.setObject(2, repair.getSerial_No());
            stm.setObject(3, repair.getRepair_date());
            stm.setObject(4, repair.getQty());
            stm.setObject(5, repair.getReturnDATE());

            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                boolean isUpdateItemStock = RepairDetailsController.updateStock(repair);
                if (isUpdateItemStock) {
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

    public static Repair sarchRepair(String repairno) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From repair_AND_maintain where repairID='" + repairno + "'";
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            return new Repair(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            );
        }
        return null;
    }

    public static boolean updateRepair(Repair repair) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update repair_and_maintain set serial_No=?, repair_date=?, qty=?, returnDATE=? where repairID=?");

        try {
            DBConnection.getInstance().getConnection().setAutoCommit(false);
            stm.setObject(5, repair.getRepairID());
            stm.setObject(1, repair.getSerial_No());
            stm.setObject(2, repair.getRepair_date());
            stm.setObject(3, repair.getQty());
            stm.setObject(4, repair.getReturnDATE());

            boolean isupdated = stm.executeUpdate() > 0;

            if (isupdated) {
                boolean isreturn = OrderDetailsController.updateReturn(repair);
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

    public static ArrayList<Repair> getAllItem() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From repair_AND_maintain order by repairID desc");
        ArrayList<Repair> repairList = new ArrayList<>();
        while (rst.next()) {
            Repair repair = new Repair();
            repair.setSerial_No(rst.getString("serial_No"));
            repair.setRepairID(rst.getString("repairid"));
            repair.setRepair_date(rst.getString("repair_date"));
            repair.setReturnDATE(rst.getString("returnDate"));

            repair.setQty(rst.getString("qty"));

            repairList.add(repair);

        }
        return repairList;

    }

    public static ArrayList<Repair> getAllRepair() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From repair_AND_maintain ");
        ArrayList<Repair> repairList = new ArrayList<>();
        while (rst.next()) {
            Repair repair = new Repair();
            repair.setSerial_No(rst.getString("serial_No"));
            repair.setRepairID(rst.getString("repairid"));
            repair.setRepair_date(rst.getString("repair_date"));
            repair.setReturnDATE(rst.getString("returnDate"));

            repair.setQty(rst.getString("qty"));

            repairList.add(repair);

        }
        return repairList;

    }

    private static boolean updateStock(Repair repair) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update Item set Qty_On_Hand=Qty_On_Hand-? where serial_No=?");

        stm.setObject(1, repair.getQty());
        stm.setObject(2, repair.getSerial_No());
        return stm.executeUpdate() > 0;
    }

}
