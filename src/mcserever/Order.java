package mcserever;

import java.util.Date;

public class Order {
    private int orderId;
    private Date date;
    private int userId;
    private int prodid;

    
    public Order(int orderId, Date date, int userId, int prodid) {
        this.orderId = orderId;
        this.date = date;
        this.userId = userId;
        this.prodid = prodid;
    }

    public Order() {
    }

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }
    

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", date=" + date +
                ", userId=" + userId +
                '}';
    }
}
