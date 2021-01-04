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
import lk.ijse.ViskoRental.model.Employee;

/**
 *
 * @author hp
 */
public class EmployeeRegistrationController {

    public static boolean employeeAdd(Employee employee) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?)");
        stm.setObject(1, employee.getEmployeeId());
        stm.setObject(2, employee.getEmployeeName());
        stm.setObject(3, employee.getEmployeeContact());
        stm.setObject(4, employee.getEmployeeAddress());

        return stm.executeUpdate() > 0;
    }

    public static ArrayList<Employee> getAllEmployee() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From Employee");
        ArrayList<Employee> employeeList = new ArrayList<>();
        while (rst.next()) {
            Employee employee = new Employee();
            employee.setEmployeeId(rst.getString("employeeID"));
            employee.setEmployeeName(rst.getString("employeeName"));
            employee.setEmployeeContact(rst.getString("employeeContact"));
            employee.setEmployeeAddress(rst.getString("employeeAddress"));

            employeeList.add(employee);

        }
        return employeeList;
    }

    public static boolean deleteEmployee(String name) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete from Employee where employeeName='" + name + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }

    public static boolean updateEmployee(Employee employee) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update Employee set employeeName=?, employeeContact=?, employeeAddress=?  where employeeId=? ");

        stm.setObject(1, employee.getEmployeeName());
        stm.setObject(2, employee.getEmployeeContact());
        stm.setObject(3, employee.getEmployeeAddress());
        stm.setObject(4, employee.getEmployeeId());

        return stm.executeUpdate() > 0;
    }

    public static Employee sarchEmployee(String name) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From Employee where employeeName='" + name + "'";
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            return new Employee(
                    rst.getString("employeeID"),
                    rst.getString("employeeName"),
                    rst.getString("employeeContact"),
                    rst.getString("employeeAddress"));
        }
        return null;

    }

    public static String generateEmployeeId() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT employeeId FROM Employee ORDER BY employeeId DESC LIMIT 1");
        if (rst.next()) {

            String tempId = rst.getString(1);
            String[] arr = tempId.split("E");
            int id = Integer.parseInt(arr[1]);
            id += 1;

            if (id < 10) {
                return "E00" + id;
            } else if (id < 100) {
                return "E0" + id;
            } else {
                return "E" + id;
            }
        } else {
            return "E001";
        }
    }

    public Employee getEmployee(String name) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT * FROM employee WHERE  employeename='" + name + "'").executeQuery();
        if (rst.next()) {
            return new Employee(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4));

        }
        return null;
    }

}
