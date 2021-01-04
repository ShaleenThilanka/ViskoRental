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
public class Repair {

    private String repairID;
    private String serial_No;
    private String repair_date;

    private String qty;
    private String returnDATE;

    public Repair(String repairID, String serial_No, String repair_date, String qty, String returnDATE) {
        this.repairID = repairID;
        this.serial_No = serial_No;
        this.repair_date = repair_date;
        this.qty = qty;
        this.returnDATE = returnDATE;
    }

    public Repair() {
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
     * @return the repair_date
     */
    public String getRepair_date() {
        return repair_date;
    }

    /**
     * @param repair_date the repair_date to set
     */
    public void setRepair_date(String repair_date) {
        this.repair_date = repair_date;
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
     * @return the returnDATE
     */
    public String getReturnDATE() {
        return returnDATE;
    }

    /**
     * @param returnDATE the returnDATE to set
     */
    public void setReturnDATE(String returnDATE) {
        this.returnDATE = returnDATE;
    }

}
