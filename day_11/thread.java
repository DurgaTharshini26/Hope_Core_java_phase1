package day_11;

public class thread {
    public static void main(String[] args) {
        Thread t=new Thread (() ->{
        try
        {
        System.out.println("Thread is going to sleep for 2 seconds");
        Thread.sleep(2000);  
        }
         catch(InterruptedException e)
    {
        System.out.println("Thread was interrupted");
    }
});
t.start();
try{
    Thread.sleep(1000); // Main thread sleeps for 1 second
}
catch(Exception e)
{
    System.out.println("not t");
}
t.interrupt(); // Interrupt the thread while it's sleeping
    }
}

    

