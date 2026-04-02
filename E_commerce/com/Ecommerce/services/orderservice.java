package E_commerce.com.Ecommerce.services;

import E_commerce.com.Ecommerce.model.order;

public class orderservice {

    public void displayOrderDetails(order order) {
        System.out.println("Username: " + order.getUser().getUserName());
        System.out.println("Product Name: " + order.getProduct().getProductName());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Total Price: " + order.getTotalPrice());
    }
}
