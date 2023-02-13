/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module2lab;

/**
 *
 * @author huzaifa
 */
public class Invoice {
    private String partNum;
    private String description;
    private int quantity;
    private double pricePerItem;

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0){
            this.quantity = quantity;
        }else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem >=0) {
            this.pricePerItem = pricePerItem;
       }else{
            this.pricePerItem = 0;
        }
    }

    public Invoice(String partNum, String description, int quantity, double pricePerItem) {
        this.partNum = partNum;
        this.description = description;
        if(quantity < 0){
            this.quantity = 0;
        }else {
            this.quantity = quantity;
        }
        if(pricePerItem < 0){
            this.pricePerItem = 0;
        }else{
            this.pricePerItem = pricePerItem;
        }
    }
    
    public double getInvoiceAmount(){
        double amount;
        amount = this.quantity * this.pricePerItem;
        return amount;
            
    }
    
}
 