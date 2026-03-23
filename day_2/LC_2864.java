class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        int zero=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c =='1')
            {
                one++;
            }
            else
            {
                zero++;
            }
        }
        String ans="";
        int temp=one;
        while(one>=2)
        {
            ans+="1"+"";
            one--;
        }
        for(int i=0;i<s.length()-temp;i++)
        {
            ans+="0"+"";
        }
        ans+=1+"";
        return ans;
    }
}