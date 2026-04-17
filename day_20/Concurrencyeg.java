package day_20;

class SampleThread extends Thread {
    String name;

    SampleThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class Concurrencyeg {
    public static void main(String[] args) {
        SampleThread s1 = new SampleThread("Task1");
        SampleThread s2 = new SampleThread("Task2");
        s1.start();
        s2.start();
    }
}
