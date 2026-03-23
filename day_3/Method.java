
import java.util.*;
public class Method {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         Method n=new Method();
         n.print(a);
    }
    public void print (int n)
    {
         System.out.print(square(n));
    }
    public static  int square(int n)
    {
        return mul(n,n);
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }

}
