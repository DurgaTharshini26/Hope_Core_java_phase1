//multiple booking platform 
//user(name,phone,address), rideuser(vehicle type),fooduser(favfood),parcel user(weigtht)

package day_5;

class User {
    String name;
    String phone;
    String address;

    User(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    void displayInfo() {
        System.out.println("Name    : " + name);
        System.out.println("Phone   : " + phone);
        System.out.println("Address : " + address);
    }
}

class RideUser extends User {
    String vehicleType;

    RideUser(String name, String phone, String address, String vehicleType) {
        super(name, phone, address);
        this.vehicleType = vehicleType;
    }

    void displayRideInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type : " + vehicleType);
    }
}

class FoodUser extends User {
    String favFood;

    FoodUser(String name, String phone, String address, String favFood) {
        super(name, phone, address);
        this.favFood = favFood;
    }

    void displayFoodInfo() {
        super.displayInfo();
        System.out.println("Favorite Food : " + favFood);
    }
}

class ParcelUser extends User {
    int weight;

    ParcelUser(String name, String phone, String address, int weight) {
        super(name, phone, address);
        this.weight = weight;
    }

    void displayParcelInfo() {
        super.displayInfo();
        System.out.println("Weight : " + weight + " kg");
    }
}

public class task {
    public static void main(String[] args) {
        RideUser r = new RideUser("Tharsh", "1234567890", "Chennai", "Car");
        FoodUser f = new FoodUser("Anandan", "9876543210", "Chennai", "Biriyani");
        ParcelUser p = new ParcelUser("Vignesh", "4567891230", "Chennai", 5);

        System.out.println("---- Ride User ----");
        r.displayRideInfo();

        System.out.println("\n---- Food User ----");
        f.displayFoodInfo();

        System.out.println("\n---- Parcel User ----");
        p.displayParcelInfo();
    }
}