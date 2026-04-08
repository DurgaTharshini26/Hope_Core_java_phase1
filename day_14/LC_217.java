package day_14;

import java.util.HashSet;
import java.util.Set;

public class LC_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums)
        {
            s.add(i);
        }

        int a=s.size();
        int b=nums.length;
        if(a!=b)
        {
            return true;
        }
        return false;
        
    

    }

}
