package day_7;

public class LC_724 {
    class Solution {
    public int pivotIndex(int[] nums) {
        int tot=0;
        for(int n:nums)
        {
            tot+=n;
        }
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            int right=tot-left-nums[i];
            if(left==right)
            {
                return i;
    
            }
            left+=nums[i];
        }
        return -1;
    }
}
}
