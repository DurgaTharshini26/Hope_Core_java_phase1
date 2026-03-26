package day_6;

public class LC_1108 {
    class Solution {
    public String defangIPaddr(String address) {
        char[] a=address.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='.')
            {
                sb.append("[.]");
            }
            else
            {
                sb.append(a[i]);
            }
        }
        return new String(sb);
}
}
}
