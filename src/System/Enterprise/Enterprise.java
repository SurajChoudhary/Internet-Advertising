/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Enterprise;

import System.Employee.Employee;
import System.FinancialAccount.FinancialAccount;
import System.Invoice.InvoiceHistory;
import System.Order.MasterOrderCatalog;
import System.Organization.Organization;
import System.Organization.OrganizationDirectory;
import System.Payment.PaymentHistory;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
 public abstract class Enterprise extends Organization {
 
    protected String location;
    protected OrganizationDirectory organizationDirectory;
    private InvoiceHistory invoiceHistory;
    private PaymentHistory paymentHistory;
    private MasterOrderCatalog masterOrderCatalog;
    private FinancialAccount financialAccount;
    
    public Enterprise(String name) 
    {
      super(name);
      organizationDirectory= new OrganizationDirectory();
      invoiceHistory= new InvoiceHistory();
      paymentHistory= new PaymentHistory();
      masterOrderCatalog= new MasterOrderCatalog();
      financialAccount= new FinancialAccount();
    }
    
    public enum Type {
        PUBLISHER("Publisher"),
        ADEXCHANGE("Advertisment Exchange"),
        ADVERTISER("Advertiser");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
      }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    @Override
    public abstract ArrayList<Role> getOrganizationSupportedRole();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public InvoiceHistory getInvoiceHistory() {
        return invoiceHistory;
    }

    public PaymentHistory getPaymentHistory() {
        return paymentHistory;
    }
    
    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setFinancialAccount(FinancialAccount financialAccount) {
        this.financialAccount = financialAccount;
    }

    public FinancialAccount getFinancialAccount() {
        return financialAccount;
    }
  
    public Boolean checkEnterpriseEmployeeIDs(int id)
    {
        for(Employee e: employeeDirectory.getEmployeeList())
            if(e.getEmpID()==(id)) return true;
         for(Organization organization: organizationDirectory.getOrganizationList())
         {
           Boolean exists= organization.getEmployeeDirectory().checkOrganizationEmployeeIDs(id);
           if(exists) return true;
         }
        return false;
    }
}
