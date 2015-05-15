/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> requestList;
    
    public WorkQueue()
    {
        requestList= new ArrayList<>();
    }

    public ArrayList<WorkRequest> getRequestList() {
        return requestList;
    }
    
}
