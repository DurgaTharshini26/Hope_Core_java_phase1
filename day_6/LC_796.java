package day_6;

public class LC_796 {
    class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int n=s.length();
        String doubles=s+s;
        return doubles.contains(goal);
    }
}
}
