class LC_191 {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0)
        {
            int re=n%2;
            if(re==1)
            {
                count++;
            }
            n/=2;
        }
        return count;
    }
}