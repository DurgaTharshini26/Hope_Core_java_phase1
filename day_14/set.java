package day_14;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class set{
    public static void main(String[] args) {
        Set<Integer> Linkedset = new LinkedHashSet<>();
        Set<Integer> a=  new HashSet<>();
        int[] arr = {1,23,5,75,9,4,12};
        for(int i:arr){
            Linkedset.add(i);
            a.add(i);
        }
        System.out.println(Linkedset);
        System.out.println(a);

    }
}

