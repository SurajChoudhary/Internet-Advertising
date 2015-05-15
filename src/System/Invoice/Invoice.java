/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package System.Invoice;

import System.Order.Order;
import System.Payment.Payment;

/**
 *
 * @author SURAJ
 */
public class Invoice {
    
    private Order order;
    private static int count=0;
    private int invoiceID;
    private String invoiceStatus= "Unpaid";
    private Payment payment;

    public Invoice()
    {
        count++;
        invoiceID= count;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
     
    /**
     * @return the order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * @return the invoiceID
     */
    public int getInvoiceID() {
        return invoiceID;
    }
   
    /**
     * @return the invoiceStatus
     */
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * @param invoiceStatus the invoiceStatus to set
     */
    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
    
    @Override
    public String toString() {
        return String.valueOf(invoiceID);
    }
}
