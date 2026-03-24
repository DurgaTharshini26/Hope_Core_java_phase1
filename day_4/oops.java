//constructor
class Student {
    int rollno;
    String name;
    int marks;
    boolean bool;

    // Parameterized constructor
    Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        System.out.println("Parameterized constructor");
    }

    // Parameterized constructor with 4 parameters
    Student(int rollno, String name, int marks, boolean bool) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.bool = bool;
    }

    // Default constructor
    Student() {
        System.out.println("From Default constructor");
    }
}

public class oops {
    public static void main(String[] args) {
        Student s1 = new Student(11, "abcd", 65);
        Student s2 = new Student();
        Student s3 = new Student(33, "dcba", 55, false);

        System.out.println(s1.marks);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}