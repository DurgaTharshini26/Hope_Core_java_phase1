package day_8;
import java.util.*;
public class second_lar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i = 0;
        int max1 = 0, max2 = 0;
        String w1 = "", w2 = "";

        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }

            int start = i;

            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }

            int end = i;

            if (start < end) {
                String word = s.substring(start, end);
                int len = word.length();

                if (len > max1) {
                    max2 = max1;
                    w2 = w1;

                    max1 = len;
                    w1 = word;
                } 
                else if (len > max2) {
                    max2 = len;
                    w2 = word;
                }
            }
        }

        if (w2.equals("")) {
            System.out.println("No second largest word");
        } else {
            System.out.println(w2);
        }
    }
} 

