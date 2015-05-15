/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.FinancialAccount;

/**
 *
 * @author SURAJ
 */
public class FinancialAccount {
    
    private String accountType;
    private long accountNumber;
    private double accountBalance;

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

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
