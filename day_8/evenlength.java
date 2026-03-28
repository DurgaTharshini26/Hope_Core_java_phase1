package day_8;
import java.util.*;
public class evenlength {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        while(i<s.length())
        {
            while(i<s.length()&& s.charAt(i)==' ')
            {
                i++;
            }
            int start=i;
            while(i<s.length() && s.charAt(i)!=' ')
            {
                i++;
            }
            int end =i;
            if(start<end)
        {
            String a= s.substring(start,end);
            if(a.length()%2==0)
            {
                System.out.print(a+" ");
            }
       }
        }

    }
}

