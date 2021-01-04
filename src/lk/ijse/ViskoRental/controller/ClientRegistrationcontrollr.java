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
import lk.ijse.ViskoRental.model.PaymentDetail;

/**
 *
 * @author hp
 */
public class ClientRegistrationcontrollr {

    public static boolean AddClient(Client client) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO client VALUES(?,?,?,?,?,?)");
        stm.setObject(1, client.getClientID());
        stm.setObject(2, client.getUserID());
        stm.setObject(3, client.getClientName());
        stm.setObject(4, client.getClientContact());
        stm.setObject(5, client.getClientNIC_No());
        stm.setObject(6, client.getClientAddress());
        return stm.executeUpdate() > 0;

    }

    public static String generateClientID() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT clientID FROM client ORDER BY  clientID DESC LIMIT 1");

       if(rst.next()){
            
            String tempId=rst.getString(1);
            String [] arr=tempId.split("C");
            int id=Integer.parseInt(arr[1]);
            id+=1;
            
            if(id<10){
                return "C00"+id;
            }else if(id<100){
                return "C0"+id;
            }else {
                return "C"+id;
            }
           }else{
         return "C001";
        }
    }

    public static ArrayList<Client> getAllclient() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From client order by clientID desc");
        ArrayList<Client> clientList = new ArrayList<>();
        while (rst.next()) {
            Client client = new Client();
           
            client.setClientID(rst.getString("clientID"));
             client.setUserID(rst.getString("userID"));
            client.setClientName(rst.getString("clientName"));
            client.setClientContact(rst.getString("clientContact"));
            client.setClientNIC_No(rst.getString("clientNIC_No"));
            client.setClientAddress(rst.getString("clientAddress"));
            clientList.add(client);

        }
        return clientList;
    }

    public static Client sarchClient(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();

        String SQL = "Select * From client where clientId='" + id + "'";
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            return new Client(
                   
                    rst.getString("clientID"),
                     rst.getString("userID"), 
                    rst.getString("clientName"), 
                    rst.getString("clientContact"), 
                    rst.getString("clientNIC_no"), 
                    rst.getString("clientAddress"));
        }
        return null;

    }

    public static boolean deleteClient(String clientname) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete from client where ClientName='" + clientname + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }

    public static boolean updateClient(Client client) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update client set  userID=?, clientName=?, clientContact=?, clientNIC_NO=?,clientAddress=? where clientID=?");
        stm.setObject(6, client.getClientID());
        stm.setObject(1, client.getUserID());
        stm.setObject(2, client.getClientName());
        stm.setObject(3, client.getClientContact());
        stm.setObject(4, client.getClientNIC_No());
        stm.setObject(5, client.getClientAddress());

        return stm.executeUpdate() > 0;

    }

    public static ArrayList<Client> sarchClientName(String name) throws ClassNotFoundException, SQLException {
     Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * from client where clientName like '%"+name+"%'");
        ArrayList<Client> clientList = new ArrayList<>();
        while (rst.next()) {
            Client client = new Client();
            
            client.setClientID(rst.getString("clientID"));
            client.setUserID(rst.getString("userID"));
            client.setClientName(rst.getString("clientName"));
            client.setClientContact(rst.getString("clientContact"));
            client.setClientNIC_No(rst.getString("clientNIC_No"));
            client.setClientAddress(rst.getString("clientAddress"));
           
            clientList.add(client);

        }
        return clientList;
    
    
    
    }

   
   

    public Client getClient(String name) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT * FROM client WHERE  clientname='" + name + "'").executeQuery();
        if (rst.next()) {
            return new Client(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            );
           
            }

        
        return null;

    }

   
}
