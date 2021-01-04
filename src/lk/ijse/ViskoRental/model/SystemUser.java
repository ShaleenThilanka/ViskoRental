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
public class SystemUser {

    private String userID;
    private String userType;
    private String userName;
    private String userPasswordNew;
    private String userPasswordAgain;

    public SystemUser() {
    }

    public SystemUser(String userID, String userType, String userName, String userPasswordNew, String userPasswordAgain) {
        this.userID = userID;
        this.userType = userType;
        this.userName = userName;
        this.userPasswordNew = userPasswordNew;
        this.userPasswordAgain = userPasswordAgain;
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
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userPasswordNew
     */
    public String getUserPasswordNew() {
        return userPasswordNew;
    }

    /**
     * @param userPasswordNew the userPasswordNew to set
     */
    public void setUserPasswordNew(String userPasswordNew) {
        this.userPasswordNew = userPasswordNew;
    }

    /**
     * @return the userPasswordAgain
     */
    public String getUserPasswordAgain() {
        return userPasswordAgain;
    }

    /**
     * @param userPasswordAgain the userPasswordAgain to set
     */
    public void setUserPasswordAgain(String userPasswordAgain) {
        this.userPasswordAgain = userPasswordAgain;
    }

}
