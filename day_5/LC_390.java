package day_5;

public class LC_390 {
    class Solution {
    public int lastRemaining(int n) {
        boolean left = true;
        int head = 1; 
        int diff = 1; 
        int remaining = n;

        while(remaining > 1) {
            if(left || (remaining) % 2 == 1) {
                head = head + diff; 
            }
            diff = diff*2; 
            remaining = remaining / 2; 
            left = !left; 
        }
        return head;
    }
}
}
