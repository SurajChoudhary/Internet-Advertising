/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Payment;

import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class PaymentHistory {
    
    private ArrayList<Payment> paymentList;
    
    public PaymentHistory()
    {
        paymentList= new ArrayList<>();
    }

    public ArrayList<Payment> getPaymentList() {
        return paymentList;
    }
    
    public Payment createAndAddPayment()
    {
        Payment payment= new Payment();
        paymentList.add(payment);
        return payment;
    }
}
