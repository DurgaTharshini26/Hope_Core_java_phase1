package day_21;
@FunctionalInterface
interface Math
{
    int add(int a,int b);
   // int sub(int a,int b);
}
@FunctionalInterface
interface Exercise
{
    void sayhi();
}
public class lambda {
        public static void main(String[] args)
    {
        Math o=(a,b)->a+b;
        Exercise e=()->System.out.println("Hello, World!");
        e.sayhi();
        //Math addfunc=new Math(){
            //@Override
            //public int add(int a,int b)
            //{
            //    return a+b;
            //}
    
        System.out.println(o.add(5,10));
    }
    }

