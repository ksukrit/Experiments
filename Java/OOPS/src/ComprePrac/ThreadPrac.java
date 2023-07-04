package ComprePrac;

public class ThreadPrac implements Runnable{
    public void run(){
        System.out.println("Hello world");
        System.out.println(t.isDaemon());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    Thread t;
    ThreadPrac(){
        t = new Thread(this);
        t.setDaemon(true);
        t.start();
    }

    public static void main(String[] args) {
        try {
            new ThreadPrac().t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread done " + Thread.currentThread());
    }
}
