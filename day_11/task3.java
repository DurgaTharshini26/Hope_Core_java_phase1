package day_11;
/* task: e -commerce order system
Design system where user places an order,while ordering system must handle failures using exceptional handling like product out of stock,payment failed. 
classes product(name,price,stock),order(product,quantity,user),user(name,address),orderservice(placeorder(order));
 */
class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
class user {
    String name;
    String address;

    user(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
class order {
    Product product;
    int quantity;
    user user;

    order(Product product, int quantity, user user) {
        this.product = product;
        this.quantity = quantity;
        this.user = user;
    }
}
class orderservice {
    void placeorder(order order) throws Exception {
        if (order.product.stock < order.quantity) {
            throw new Exception("Product out of stock");
        }
        // Simulate payment failure
        if (Math.random() < 0.5) {
            throw new Exception("Payment failed");
        }
        // If everything is fine, reduce stock and confirm order
        order.product.stock -= order.quantity;
        System.out.println("Order placed successfully for " + order.user.name);
    }
}
public class task3 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000.0, 5);
        user user = new user("Alice", "123 Main St");
        order order = new order(product, 2, user);   
        orderservice orderService = new orderservice();
        try {
            orderService.placeorder(order);
        } catch (Exception e) {
            System.out.println("Failed to place order: " + e.getMessage());
        }
                           
}
}
