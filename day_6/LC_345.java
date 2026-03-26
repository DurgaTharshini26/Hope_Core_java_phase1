package day_6;

public class LC_345 {
    public String reversevowels(String s)
    {
    char[] word= s.toCharArray();
    int start=0;
    int end=s.length()-1;
    String c="aeiouAeiou";
    while(start<end)
    {
        while(start<end && c.indexOf(word[start])==-1)
        {
            start++;
        }
        while(start<end && c.indexOf(word[end])==-1)
        {
              end++;
        }
      char temp=word[start];
      word[start]=word[end];
      word[end]=temp;
      start++;
      end--;
    }
    return word.toString();

}
}
