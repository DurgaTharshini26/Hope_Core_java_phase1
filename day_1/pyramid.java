import java.util.Scanner;
public class pyramid {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.out.print(" ");
            }
                for(int k=1;k<=2*i+1;k++)
                {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
    } 





