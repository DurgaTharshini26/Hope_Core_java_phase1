package day_11;
/* task: e -commerce order system
Design system where user places an order,while ordering system must handle failures using exceptional handling like product out of stock,payment failed. 
classes product(name,price,stock),order(product,quantity,user),user(name,address),orderservice(placeorder(order));
 */
/* Task: E-commerce Order System
Design system where user places an order.
While ordering, system must handle failures using exception handling
like product out of stock, payment failed.

Classes:
Product(name, price, stock)
Order(product, quantity, user)
User(name, address)
OrderService(placeOrder(order))
*/
class outOfStockException extends Exception {
    public outOfStockException(String msg) {
        super(msg);
    }
}
class paymentFailedException extends Exception {
    public paymentFailedException(String msg) {
        super(msg);
    }
}
class orderprocessException extends Exception {
    public orderprocessException(String msg) {
        super(msg);
    }
}

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

class User {
    String name;
    String address;

    User(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Order {
    Product product;
    int quantity;
    User user;

    Order(Product product, int quantity, User user) {
        this.product = product;
        this.quantity = quantity;
        this.user = user;
    }
}

class OrderService {
    void placeOrder(Order order) throws outOfStockException, paymentFailedException,orderprocessException {

        if (order.product.stock < order.quantity) {
            throw new outOfStockException("Product out of stock");
        }
        // Simulate payment failure
        if (Math.random() < 0.4) {
            throw new paymentFailedException("Payment failed");
        }
        if(Math.random()<0.2)
        {
            throw new orderprocessException("Error processing order");
        }

        // If payment succeeds, reduce stock and confirm order
        order.product.stock -= order.quantity;
        System.out.println("Order placed successfully for " + order.user.name);
        System.out.println("Remaining stock: " + order.product.stock);
    }
}

public class task3 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000.0, 5);
        User user = new User("Alice", "123 Main St");
        Order order = new Order(product, 2, user);

        OrderService orderService = new OrderService();

        try {
            orderService.placeOrder(order);
        } catch (Exception e) {
            System.out.println("Failed to place order: " + e.getMessage());
        }
    }
}