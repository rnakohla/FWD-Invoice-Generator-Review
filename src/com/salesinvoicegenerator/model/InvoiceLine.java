
package com.salesinvoicegenerator.model;


public class InvoiceLine extends InvoiceHeader{
private InvoiceHeader header;
private String itemName;
private double itemPrice;
private int itemCount;
private int itemNumber;
private double itemTotal;




    public InvoiceLine() {
    }

    public InvoiceLine(InvoiceHeader header, String itemName, double itemPrice, int itemCount, int itemNumber, double itemTotal) {
        this.header = header;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.itemNumber = itemNumber;
        this.itemTotal = itemTotal;
    }

    
    

    public int getCount() {
        return itemCount;
    }

    public void setCount(int count) {
        this.itemCount = count;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    public String getItem() {
        return itemName;
    }

    public void setItem(String item) {
        this.itemName = item;
    }

    public double getPrice() {
        return itemPrice;
    }

    public void setPrice(double price) {
        this.itemPrice = price;
    }
     public double getLinesTotal(){
         return itemPrice * itemCount ;
     } 

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }
}
