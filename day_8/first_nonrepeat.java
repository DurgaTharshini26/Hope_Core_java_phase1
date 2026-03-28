package day_8;
import java.util.*;

public class first_nonrepeat {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int a[]=new int[26];
    for(int i=0;i<s.length();i++)
    {
       a[s.charAt(i)-'a']++;
    }
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==1)
        {
            System.out.println((char)(i+'a'));
            break;
        }
    }
}

}
