package day_6;

public class LC_1470 {
    class Solution {
    public int[] shuffle(int[] nums, int n) {
    int l=nums.length;
    int a[]=new int[l];
    int i=0;
    int j=n;
    int k=0;
    while(j<l)
    {
      a[k]=nums[i];
      a[k+1]=nums[j];
      k+=2;
      i++;
      j++;
    }
    
    return a;
    
    }
}
}
