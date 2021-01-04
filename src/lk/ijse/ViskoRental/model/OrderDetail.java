/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ViskoRental.model;

/**
 *
 * @author hp
 */
public class OrderDetail {

    private String orderID;
    private String serial_No;
    private String qty;
    private double deposite_on_hand;
    private String retrun_date;
    private double totalDayCost;

    public OrderDetail() {
    }

    public OrderDetail(String orderID, String serial_No, String qty, double deposite_on_hand, String retrun_date, double totalDayCost) {
        this.orderID = orderID;
        this.serial_No = serial_No;
        this.qty = qty;
        this.deposite_on_hand = deposite_on_hand;
        this.retrun_date = retrun_date;
        this.totalDayCost = totalDayCost;
    }

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the serial_No
     */
    public String getSerial_No() {
        return serial_No;
    }

    /**
     * @param serial_No the serial_No to set
     */
    public void setSerial_No(String serial_No) {
        this.serial_No = serial_No;
    }

    /**
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * @return the deposite_on_hand
     */
    public double getDeposite_on_hand() {
        return deposite_on_hand;
    }

    /**
     * @param deposite_on_hand the deposite_on_hand to set
     */
    public void setDeposite_on_hand(double deposite_on_hand) {
        this.deposite_on_hand = deposite_on_hand;
    }

    /**
     * @return the retrun_date
     */
    public String getRetrun_date() {
        return retrun_date;
    }

    /**
     * @param retrun_date the retrun_date to set
     */
    public void setRetrun_date(String retrun_date) {
        this.retrun_date = retrun_date;
    }

    /**
     * @return the totalDayCost
     */
    public double getTotalDayCost() {
        return totalDayCost;
    }

    /**
     * @param totalDayCost the totalDayCost to set
     */
    public void setTotalDayCost(double totalDayCost) {
        this.totalDayCost = totalDayCost;
    }
    
    }
