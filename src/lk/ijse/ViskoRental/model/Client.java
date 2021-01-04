/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ViskoRental.model;

public class Client {

   
    private String clientID;
     private String userID;
    private String clientName;
    private String clientContact;
    private String clientNIC_No;
    private String clientAddress;

    public Client() {
    }

    public Client(String clientID, String userID, String clientName, String clientContact, String clientNIC_No, String clientAddress) {
        this.clientID = clientID;
        this.userID = userID;
        this.clientName = clientName;
        this.clientContact = clientContact;
        this.clientNIC_No = clientNIC_No;
        this.clientAddress = clientAddress;
    }

    /**
     * @return the clientID
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * @param clientID the clientID to set
     */
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the clientName to set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @return the clientContact
     */
    public String getClientContact() {
        return clientContact;
    }

    /**
     * @param clientContact the clientContact to set
     */
    public void setClientContact(String clientContact) {
        this.clientContact = clientContact;
    }

    /**
     * @return the clientNIC_No
     */
    public String getClientNIC_No() {
        return clientNIC_No;
    }

    /**
     * @param clientNIC_No the clientNIC_No to set
     */
    public void setClientNIC_No(String clientNIC_No) {
        this.clientNIC_No = clientNIC_No;
    }

    /**
     * @return the clientAddress
     */
    public String getClientAddress() {
        return clientAddress;
    }

    /**
     * @param clientAddress the clientAddress to set
     */
    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

   
    
}
