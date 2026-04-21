package day_22;
//employee(name,dpt,salary,age) (dev,hr,support)
//filter the dept by dev and salary > 50000,tot salary using sum(),average age of employees,count of employee using count()
import java.util.*;
import java.util.stream.*;

public class Task {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("A", "dev", 60000, 25),
            new Employee("B", "hr", 40000, 30),
            new Employee("C", "dev", 70000, 28),
            new Employee("D", "support", 45000, 35),
            new Employee("E", "dev", 30000, 22)
        );
        List<Employee> filtered = employees.stream()
                .filter(e -> e.dept.equals("dev") && e.salary > 50000)
                .collect(Collectors.toList());

        int totalSalary = filtered.stream()
                .mapToInt(e -> e.salary)
                .sum();

        double avgAge = filtered.stream()
                .mapToInt(e -> e.age)
                .average()
                .orElse(0);
        long count = filtered.stream()
                .count();

        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Age: " + avgAge);
        System.out.println("Count: " + count);
    }
}

class Employee {
    String name;
    String dept;
    int salary;
    int age;

    Employee(String name, String dept, int salary, int age) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
    }
}
