package E_commerce.com.Ecommerce.main;
import E_commerce.com.Ecommerce.model.*;
import E_commerce.com.Ecommerce.services.orderservice;

public class Main {
    public static void main(String[] args) {
        user user = new user("Durga");
        product product = new product("Laptop", 50000);
        order order = new order(user, product, 2);

        orderservice orderService = new orderservice();
        orderService.displayOrderDetails(order);
    }
}