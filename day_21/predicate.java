package day_21;
import java.util.function.Predicate;
public class predicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven =(n)-> n%2==0;
        System.out.println(isEven.test(4)); // true
        Predicate<Integer> isodd=isEven.negate();
        Predicate<Stud> ispass=s->s.marks>=35;
        System.out.println(isEven.test(1));
        System.out.println(isodd.test(5));
        System.out.println(ispass.test(new Stud(40)));
    }
}
class Stud{
    int marks;
    Stud(int marks){
        this.marks=marks;
    }
}
