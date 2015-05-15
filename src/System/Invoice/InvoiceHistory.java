/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Invoice;

import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class InvoiceHistory {
    
    private ArrayList<Invoice> invoiceList;
    
    public InvoiceHistory()
    {
        invoiceList= new ArrayList<>();
    }

    public ArrayList<Invoice> getInvoiceList() {
        return invoiceList;
    }
}
