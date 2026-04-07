package day_13;
import java.util.Arrays;
import java.util.ArrayList;
//remove duplcate elemnts in arraylist
public class removeduplicates {
    public  static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,5,6,1,2));
        ArrayList<Integer> unique=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(!unique.contains(list.get(i)))
            {
                unique.add(list.get(i));
            }
}
System.out.println(unique);    
    }
}