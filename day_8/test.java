package day_8;
import java.util.*;

public class test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String st = "";
        String s = sc.nextLine();
        int len = s.length();
        int min = 0; 
        StringBuilder word = new StringBuilder();
        int i = 0;
        while (i < len)
        {
            while (i < len && s.charAt(i) == ' ')
            {
                i++;
            }
            int start = i;
            while (i < len && s.charAt(i) != ' ')
            {
                i++;
            }

            int end = i;
            if (start < end)
            {
               word.setLength(0);   
                for (int j = start; j < end; j++)
                {
                    word.append(s.charAt(j));
                }

                if (word.length() < min)
                {
                    min = word.length();
                    st = word.toString();   
                }
                
            }
        }
        System.out.print(st);
    }
}