
package com.salesinvoicegenerator.model;

import java.util.ArrayList;
import java.util.Date;


public class InvoiceHeader {
 private int num;
 private String Customer;
 private Date invDate;
 private  double Total;
 private ArrayList<InvoiceLine> lines;

    public InvoiceHeader() {
    }
       public InvoiceHeader(int num , Date invDate ,String Customer){
    //public InvoiceHeader(int num, String Customer, Date invDate) {
        this.num = num;
        this.Customer = Customer;
        this.invDate = invDate;

    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
  
    
    public double getInvoiceTotal(){
    
    double total=0.0;
    for(int i=0;i<lines.size();i++){
       total+=lines.get(i).getLinesTotal();
       
    }
     return total;
     
    }
}
