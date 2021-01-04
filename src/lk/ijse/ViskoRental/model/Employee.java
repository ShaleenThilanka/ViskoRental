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
public class Employee {

    private String employeeId;
    private String employeeName;
    private String employeeContact;
    private String employeeAddress;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, String employeeContact, String employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeContact = employeeContact;
        this.employeeAddress = employeeAddress;
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
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return the employeeContact
     */
    public String getEmployeeContact() {
        return employeeContact;
    }

    /**
     * @param employeeContact the employeeContact to set
     */
    public void setEmployeeContact(String employeeContact) {
        this.employeeContact = employeeContact;
    }

    /**
     * @return the employeeAddress
     */
    public String getEmployeeAddress() {
        return employeeAddress;
    }

    /**
     * @param employeeAddress the employeeAddress to set
     */
    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

}
