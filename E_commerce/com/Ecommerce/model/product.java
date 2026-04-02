package E_commerce.com.Ecommerce.model;


public class product {
    private String productName;
    private double price;

    public product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}