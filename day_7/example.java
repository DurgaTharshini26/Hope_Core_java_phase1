package day_7;

public class example {
    public int add(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
            example e = new example();
            System.out.println(e.add(2.3, 3.7));
    }
}
//example for method overloading: here we are using same method name but with different parameters and it is a type of compile time polymorphism.
//here add funtion is integer type but we are passing double type which is explicitly type casted to integer type and it is a problem because we are losing the decimal part of the number. to solve this problem we can use method overloading by creating another add method with double parameters.
