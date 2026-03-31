package day_10;

import java.util.Scanner;

// design locker system where user can store items securely ,each locker protect its internal data and only controlled operation
//requirements: each locker has locker id , islocked(boolean),pin,stored item.
//operation : store item (item,pin),retreive item(pin),lock locker(pin),unlock locker(pin)
//rules :items cannot access directly locker opens with correct pin, locker can be locked and unlocked with correct pin, items can only be stored or retrieved when locker is unlocked ,invalid access blocked and error message displayed
class Locker
{
    private int lockerId;
    private boolean isLocked;
    private String pin;
    private String storedItem;

    public Locker(int lockerId, String pin) {
        this.lockerId = lockerId;
        this.pin = pin;
        this.isLocked = true; 
        this.storedItem = null; 
    }

    public void storeItem(String item, String inputPin) {
        if (isLocked) {
            System.out.println("Locker is locked. Please unlock it first.");
            return;
        }
        if (!inputPin.equals(pin)) {
            System.out.println("Invalid PIN. Access denied.");
            return;
        }
        this.storedItem = item;
        System.out.println("Item stored successfully.");
    }

    public void retrieveItem(String inputPin) {
        if (isLocked) {
            System.out.println("Locker is locked. Please unlock it first.");
            return;
        }
        if (!inputPin.equals(pin)) {
            System.out.println("Invalid PIN. Access denied.");
            return;
        }
        if (storedItem == null) {
            System.out.println("No item stored in the locker.");
            return;
        }
        System.out.println("Retrieved item: " + storedItem);
        storedItem = null; // Clear the locker after retrieval
    }

    public void lockLocker(String inputPin) {
        if (!inputPin.equals(pin)) {
            System.out.println("Invalid PIN. Cannot lock the locker.");
            return;
        }
        isLocked = true;
        System.out.println("Locker locked successfully.");
    }

    public void unlockLocker(String inputPin) {
        if (!inputPin.equals(pin)) {
            System.out.println("Invalid PIN. Cannot unlock the locker.");
            return;
        }
        isLocked = false;
        System.out.println("Locker unlocked successfully.");
    }
}


public class Lockersystem {
    public static void main(String[] args) {
        Locker locker1 = new Locker(101, "1234");
        //Locker locker2 = new Locker(102, "5678");
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Store Item");
            System.out.println("2. Retrieve Item");
            System.out.println("3. Lock Locker");
            System.out.println("4. Unlock Locker");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to store: ");
                    String item = sc.nextLine();
                    System.out.print("Enter PIN: ");
                    String storePin = sc.nextLine();
                    locker1.storeItem(item, storePin);
                
                    break;
                case 2:
                    System.out.print("Enter PIN: ");
                    String retrievePin = sc.nextLine();
                    locker1.retrieveItem(retrievePin);

                    break;
                case 3:
                    System.out.print("Enter PIN: ");
                    String lockPin = sc.nextLine();
                    locker1.lockLocker(lockPin);
                

                    break;
                case 4:
                    System.out.print("Enter PIN: ");
                    String unlockPin = sc.nextLine();
                    locker1.unlockLocker(unlockPin);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 5);
    
    }
}
