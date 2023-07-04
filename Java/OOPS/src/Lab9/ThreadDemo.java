package Lab9;

import java.util.ArrayList;
import java.util.HashMap;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);
        SampleThread words = new SampleThread(1);
        SampleThread number = new SampleThread(0);

        Thread t1 = new Thread(words,"Words");
        Thread t2 = new Thread(number,"Number");
        t1.start();
        t2.start();
    }
}
