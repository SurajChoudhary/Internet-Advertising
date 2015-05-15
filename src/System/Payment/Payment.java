/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package System.Payment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author SURAJ
 */
public class Payment {
    
    private String accountType;
    private long accountNumber;
    private String date;
    private double tansactionAmount;

    public Payment()
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        date = dateFormat.format(cal.getTime());
    }
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getDate() {
        return date;
    }

    public double getTansactionAmount() {
        return tansactionAmount;
    }

    public void setTansactionAmount(double tansactionAmount) {
        this.tansactionAmount = tansactionAmount;
    }
    
    @Override
    public String toString() {
        return String.valueOf(date);
    }
}
