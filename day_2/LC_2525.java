class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol=(length*width*height);
        boolean b=false;
        boolean h=false;
        if(length>=10000|| width>=10000|| height>=10000|| vol>=1000000000){
                b=true;
        }
        if(mass>=100)
        {
              h=true;
        }
        if(b==true && h==true)
        {
            return "Both";
        }
        if(!b && !h)
        {
            return "Neither";
        }
        if(b &&!h)
        {
            return "Bulky";
        }
        return "Heavy";
    }
}