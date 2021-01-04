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
import lk.ijse.ViskoRental.model.SystemUser;

/**
 *
 * @author hp
 */
public class UserRegistrationController {

    public static String generateUserID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT userID FROM systemUser ORDER BY userId DESC LIMIT 1");
        if (rst.next()) {
            String tempId = rst.getString(1);
            String[] arr = tempId.split("U");
            int id = Integer.parseInt(arr[1]);
            id += 1;

            if (id < 10) {
                return "U00" + id;
            } else if (id < 100) {
                return "U0" + id;
            } else {
                return "U" + id;
            }
        } else {
            return "U001";
        }

    }

    public static boolean addUser(SystemUser systemuser) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO systemUser VALUES(?,?,?,?,?)");
        stm.setObject(1, systemuser.getUserID());
        stm.setObject(2, systemuser.getUserType());
        stm.setObject(3, systemuser.getUserName());
        stm.setObject(4, systemuser.getUserPasswordNew());
        stm.setObject(5, systemuser.getUserPasswordAgain());

        return stm.executeUpdate() > 0;
    }

    public static SystemUser sarchUser(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From systemUser where userName='" + id + "'";
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            return new SystemUser(
                    rst.getString("userID"),
                    rst.getString("userType"),
                    rst.getString("userName"),
                    rst.getString("userPasswordNew"),
                    rst.getString("userPasswordAgain")
            );
        }
        return null;

    }

    public static boolean updateUser(SystemUser systemUser) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update systemUser set  userType=?,userName=?, userpasswordNew=?, userPasswordAgain=? where userID=?");
        stm.setObject(5, systemUser.getUserID());
        stm.setObject(1, systemUser.getUserType());
        stm.setObject(2, systemUser.getUserName());
        stm.setObject(3, systemUser.getUserPasswordNew());
        stm.setObject(4, systemUser.getUserPasswordAgain());
        return stm.executeUpdate() > 0;
    }

    public static boolean deleteUser(String userName) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete from systemUser where userName='" + userName + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }

    public static ArrayList<SystemUser> getAllUser() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From systemuser");
        ArrayList<SystemUser> systemuserList = new ArrayList<>();
        while (rst.next()) {
            SystemUser systemuser = new SystemUser();
            systemuser.setUserID(rst.getString("userID"));
            systemuser.setUserType(rst.getString("userType"));
            systemuser.setUserName(rst.getString("userName"));
            systemuser.setUserPasswordNew(rst.getString("userPasswordNew"));
            systemuser.setUserPasswordAgain(rst.getString("userpasswordAgain"));
            systemuserList.add(systemuser);

        }
        return systemuserList;
    }

    public static ArrayList<SystemUser> loadAllUser() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From systemuser order by userID desc ");
        ArrayList<SystemUser> systemuserList = new ArrayList<>();
        while (rst.next()) {
            SystemUser systemuser = new SystemUser();
            systemuser.setUserID(rst.getString("userID"));
            systemuser.setUserType(rst.getString("userType"));
            systemuser.setUserName(rst.getString("userName"));
            systemuser.setUserPasswordNew(rst.getString("userPasswordNew"));
            systemuser.setUserPasswordAgain(rst.getString("userpasswordAgain"));
            systemuserList.add(systemuser);

        }
        return systemuserList;
    }

    public SystemUser getUser(String username) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT * FROM systemUser WHERE  userName='" + username + "'").executeQuery();
        if (rst.next()) {
            return new SystemUser(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
        }
        return null;
    }

}
