package day_6;

public class LC_3232 {
    class Solution {
    public boolean canAliceWin(int[] nums) {
        int d=0;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=10)
            {
                 d+=nums[i];
            }
            else
            { 
              s+=nums[i];
            }
        }
        if(s==d) return false;
        else return true;
        
    }
}
}
