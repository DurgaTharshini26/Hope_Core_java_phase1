package day_22;
import java.util.function.Supplier;
import java.lang.Math;
class Person{
    String name="Tharsh";
    }

public class Supplierex {
    public static void main(String[] args) {
        Supplier<Integer> s = () ->(int)(Math.random()*100);
        System.out.println(s.get());
        Supplier<Person> p=()->new Person();
        System.out.println(p.get().name);
        
}
}
