package day_10;
import java.util.*;
//Binding data and method that use the data in the class
//used for controlling access(security)
//declaring private data members 
//public members called getters and setters
class BankAccount
{
    private double balance;
    public void setbalance(double balance)//setters
    {
        if(balance>0)
        {
        this.balance=balance;
        }
        else{
            System.out.println("input not valid");
        }

    }
    public double getbalance()//getters
    {
        return balance;
    }
    public void withdraw(double amount)
    {
        if(amount<=balance && amount>0)
        {
            balance-=amount;
            System.out.println("Amount debited:"+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount credit: "+amount);
        }
        else{
            System.out.println("amount invalid");
        }
    }

}
public class encapsulation {
    public static void main(String[] args)
    {
        BankAccount b=new BankAccount();
        Scanner sc=new Scanner(System.in);
        b.setbalance(150000);
        System.out.println("enter amount to withdaw: ");
        b.withdraw(sc.nextDouble());
        System.out.println("enter amount to deposit: ");
        b.deposit(sc.nextInt());
        System.out.print("Current balance: ");
        System.out.println(b.getbalance());


    }
}
