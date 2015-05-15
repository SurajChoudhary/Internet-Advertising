/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.WorkQueue;

import System.Enterprise.AdExchange;
import System.Enterprise.Enterprise;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author SURAJ
 */
public abstract class WorkRequest {
    
    private int requestID;
    private static int count= 18;
    protected String message;
    private String created;
    private String status;
    private AdExchange exchange;
    private Enterprise senderEnterprise;
    
    public WorkRequest()
    {
       requestID=  count++;
       DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
       Calendar cal = Calendar.getInstance();
       created = dateFormat.format(cal.getTime());
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public AdExchange getExchange() {
        return exchange;
    }

    public void setExchange(AdExchange exchange) {
        this.exchange = exchange;
    }

    public String getCreated() {
        return created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public int getRequestID() {
        return requestID;
    }

    @Override
    public String toString() {
        return String.valueOf(requestID);
    }    
}
