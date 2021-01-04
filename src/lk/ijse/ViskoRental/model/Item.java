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
public class Item {

    private String serial_No;
    private String brand_name;
    private String item_name;
   
    private String Qty_On_Hand;
    private double per_cost_day;
    
    private double deposite;

    public Item() {
    }

    public Item(String serial_No, String brand_name, String item_name, String Qty_On_Hand, double per_cost_day, double deposite) {
        this.serial_No = serial_No;
        this.brand_name = brand_name;
        this.item_name = item_name;
        this.Qty_On_Hand = Qty_On_Hand;
        this.per_cost_day = per_cost_day;
        this.deposite = deposite;
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
     * @return the brand_name
     */
    public String getBrand_name() {
        return brand_name;
    }

    /**
     * @param brand_name the brand_name to set
     */
    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    /**
     * @return the item_name
     */
    public String getItem_name() {
        return item_name;
    }

    /**
     * @param item_name the item_name to set
     */
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    /**
     * @return the Qty_On_Hand
     */
    public String getQty_On_Hand() {
        return Qty_On_Hand;
    }

    /**
     * @param Qty_On_Hand the Qty_On_Hand to set
     */
    public void setQty_On_Hand(String Qty_On_Hand) {
        this.Qty_On_Hand = Qty_On_Hand;
    }

    /**
     * @return the per_cost_day
     */
    public double getPer_cost_day() {
        return per_cost_day;
    }

    /**
     * @param per_cost_day the per_cost_day to set
     */
    public void setPer_cost_day(double per_cost_day) {
        this.per_cost_day = per_cost_day;
    }

    /**
     * @return the deposite
     */
    public double getDeposite() {
        return deposite;
    }

    /**
     * @param deposite the deposite to set
     */
    public void setDeposite(double deposite) {
        this.deposite = deposite;
    }

    
    }
