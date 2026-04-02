package  E_commerce.com.Ecommerce.model;

public class order {
    private user user;
    private product product;
    private int quantity;
    private double totalPrice;

    public order(user user, product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
    }

    public user getUser() {
        return user;
    }

    public product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}