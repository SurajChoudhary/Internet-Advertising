/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Order;

import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class MasterOrderCatalog {
    
    private ArrayList<Order> orderList;
    
    public MasterOrderCatalog()
    {
        this.orderList= new ArrayList<>();  
    }
    /**
     * @return the orderList
     */
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    /**
     * @param orderList the orderList to set
     */
    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(Order o)
    { 
        orderList.add(o);
    }
    public void removeOrder(Order o)
    {
        orderList.remove(o);
    }
    
    
}
