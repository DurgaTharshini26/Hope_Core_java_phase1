import java.util.*;
public class pattern1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");//same for 11(print i) and print j other pattern
            }
            System.out.println();
        }
sc.close();
    }
}