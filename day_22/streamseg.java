package day_22;
//streams- process the data from collections,arrays,files etc and perform operations on them.
//streams works as pipeline of oprations    
import java.util.List;
import java.util.stream.Collectors;
public class streamseg {
public static void main(String[] args)
{
    List<Integer> nums = java.util.Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> multiplyby2=nums.stream().map(i -> i*2).collect(Collectors.toList());
    System.out.println(multiplyby2);
    List<Integer> even=nums.stream().filter(i -> i%2==0).collect(Collectors.toList());
    System.out.println(even);
    List<Employee> employees = java.util.Arrays.asList(
        new Employee("Alice", 50000),
        new Employee("Bob", 60000),
        new Employee("Charlie", 55000)
    );
    List<Employee> greaterSalary = employees.stream()
        .filter(e -> e.salary > 55000)
        .collect(Collectors.toList());
    System.out.print("After filter:" + greaterSalary);
}

static class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }
}
}
