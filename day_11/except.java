package day_11;

public class except {
    public static void main(String[] args) {
        try {
            //int a = 10 / 0; // This will throw an ArithmeticException
            String s = null;
            System.out.println(s.length()); // This will throw a NullPointerException
        } 
        catch (ArithmeticException e) {
            System.out.println("number cannot be divided by zero");
        } 
        catch (NullPointerException e) {
            System.out.println("null pointer exception occurred");
        }
         catch(Exception e)
         {
           System.out.println(e);
         }   
        
    }
}
