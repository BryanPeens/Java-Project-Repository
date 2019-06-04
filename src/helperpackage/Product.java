package helperpackage;

import java.io.Serializable;

/**
 *
 * @author Bryan/Ruan
 */
public class Product implements Serializable{
    private int productid;
    private String productName;
    private String productDescription;
    private int productNumber;
    private String productManufacturer;
    private int productQuantity;
    private double productPrice;
    private String category;

    public Product(int productid,String productName, String productDescription, int productNumber, String productManufacturer, int productQuantity,int productPrice,String category) {
        this.productid = productid;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productNumber = productNumber;
        this.productManufacturer = productManufacturer;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.category = category;
        
    }    
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "\t" + productid +"\t" + productName + "\t" + productDescription + "\t" + productNumber + "\t" + productManufacturer + "\t"+ productQuantity + "\t"+ productPrice + "\t" + category;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
}
