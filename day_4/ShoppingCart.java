//design a shopping cart system 
//class product id,name,price(double),quantity
//constructor to initialize the values
//methods gettotalprice() to calculate total price of the product
//atleast 3 products objects store in array(cart) and desplay all the products with total price
//instead of giving values directly we need to get input from user and store in array
import java.util.Scanner;
class Product {
    int id;
    String name;
    double price;
    int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
    void display()
    {
        System.out.println("Product_id: "+id);
        System.out.println("Product_name: "+name);
        System.out.println("Product_price: "+price);
        System.out.println("Product_quantity: "+quantity);
        
    }

}
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] cart = new Product[3];  
        for (int i = 0; i < cart.length; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();

            cart[i] = new Product(id, name, price, quantity);
        }
        

        double totalCartPrice = 0;
        System.out.println("Products in Cart:");
        for (Product product : cart) {
            product.display();
            totalCartPrice += product.getTotalPrice();
        }
        System.out.println("Total Cart Price: $" + totalCartPrice);
    }
}