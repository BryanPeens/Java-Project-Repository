/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcserever;

/**
 *
 * @author Ruan
 */
public class orderRequest {
    private int orderId;
    private String productName ;
    private int Quantity ; 
    private String username;

    
    public orderRequest(int orderId, String productName, int Quantity, String username) {
        this.orderId = orderId;
        this.productName = productName;
        this.Quantity = Quantity;
        this.username = username;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
