/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ViskoRental.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lk.ijse.ViskoRental.db.DBConnection;
import lk.ijse.ViskoRental.model.SystemUser;

/**
 *
 * @author hp
 */
public class UserController {

    public static SystemUser sarchUSer(String name) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();

        String SQL = "Select * From SystemUser where userName='" + name + "'";
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            return new SystemUser(
                    rst.getString("userId"),
                    rst.getString("userType"),
                    rst.getString("userName"),
                    rst.getString("userPasswordNew"),
                    rst.getString("userPasswordagain")
            );
        }
        return null;

    }

}
