package day_20;
class SampleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running using Thread class");
    }
}

class SampleThread2 implements Runnable {
    @Override
    public void run() { // Running state
        try {
            System.out.println("Thread running using Runnable");
            Thread.sleep(4000); // Waiting State
            System.out.println("After 4 seconds");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class thread_example {
    public static void main(String[] args) {
        SampleThread t = new SampleThread(); // New state
        t.start(); // Runnable state
        Thread t2 = new Thread(new SampleThread2());
        t2.start();
        // Terminated state
    }
}

