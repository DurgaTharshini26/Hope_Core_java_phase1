package day_7;
class calculator
{
    public int add(int a, int b)
    {
        return a+b;
    }   
    int addthreenum(int a, int b, int c)
    {
        return a+b+c;
    }
}
public class polymorphism {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.addthreenum(2, 3, 4));
        System.out.println(c.add(2, 3));
    }// problem: here same addition is the job but executing with different method thats why we are using polymorphism
} //same name diffferent parameters is called method overloading and it is a type of compile time polymorphism.
//same name same parameter but in different classes is called method overriding and it is a type of runtime polymorphism.
