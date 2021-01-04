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
public class PaymentDetail {

    private String paymentID;
    private String orderID;
    private String employeeId;
    private String repairID;
    private String date;
    private double income;
    private double spend;

    public PaymentDetail() {
    }

    public PaymentDetail(String paymentID, String orderID, String employeeId, String repairID, String date, double income, double spend) {
        this.paymentID = paymentID;
        this.orderID = orderID;
        this.employeeId = employeeId;
        this.repairID = repairID;
        this.date = date;
        this.income = income;
        this.spend = spend;
    }

    /**
     * @return the paymentID
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
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
     * @return the employeeId
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the repairID
     */
    public String getRepairID() {
        return repairID;
    }

    /**
     * @param repairID the repairID to set
     */
    public void setRepairID(String repairID) {
        this.repairID = repairID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the income
     */
    public double getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(double income) {
        this.income = income;
    }

    /**
     * @return the spend
     */
    public double getSpend() {
        return spend;
    }

    /**
     * @param spend the spend to set
     */
    public void setSpend(double spend) {
        this.spend = spend;
    }

}
