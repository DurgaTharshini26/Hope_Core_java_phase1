package day_9;
/*Abstraction(in simple pts):
    //Hiding the implementation details and showing only the functionality to the user is called abstraction.
    It is one of the fundamental OOP concepts.
    It can be achieved by using abstract classes and interfaces in Java.

Abstact class: 
    An abstract class is a class that cannot be instantiated and is declared with the abstract keyword.
    It can have abstract methods (without implementation) and concrete methods (with implementation).
    Abstract classes are used to provide a common base for subclasses to extend and implement the abstract methods.

*/

abstract class SmartDevice {
    abstract void turnOn(); // No body → child class must implement(abstract method)
    abstract void turnOff();
    void deviceInfo() { // Concrete method
        System.out.println("This is a smart device.");
    }
    void setLevel(int level) {
        System.out.println("Setting level: " + level);
    }
}

class Light extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("Light is turned on.");
    }
    @Override
    void turnOff() {
        System.out.println("Light is turned off.");
    }   
        
}

public class Abstraction {
    public static void main(String[] args) {
        SmartDevice device = new Light(); //This is runtime polymorphism. 
        device.turnOn();
        device.deviceInfo();
        device.setLevel(5);
    
    }
}
    
