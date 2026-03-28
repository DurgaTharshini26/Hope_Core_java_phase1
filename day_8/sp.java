package day_8;
import java.util.*;

public class sp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder f=new StringBuilder();
        StringBuilder se=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
        
           if(i%2==0)
            {
                f.append(s.charAt(i));
            }
            else if(i%2==1)
            {
                se.append(s.charAt(i));
            }
        }
        System.out.println(f+se .toString());
    }
}
