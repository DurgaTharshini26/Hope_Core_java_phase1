package day_14;

import java.util.HashSet;
import java.util.Set;

public class LC_268 {
     public int missingNumber(int[] nums) {
        int s=nums.length;
        Set<Integer> a=new HashSet<>();
        for(int i:nums)
        {
            a.add(i);
        }
        for(int i=0;i<=s;i++)
        {
            if(!a.contains(i))
            {
              return i;
            }
        }
        return -1;
    }
}

