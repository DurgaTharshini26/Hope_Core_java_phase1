class Solution {
    public void moveZeroes(int[] nums) {
        int non=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[non]=nums[i];
                non++;
            }
        }
        while(non<nums.length)
        {
            nums[non]=0;
            non++;
        }
        
    }
}