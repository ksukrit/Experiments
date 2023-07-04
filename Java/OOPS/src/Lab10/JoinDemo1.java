package Lab10;

class MyThread extends Thread
{
    MyThread(String s)
    {
        super(s);
        start();
    }
    public void run()
    {
        System.out.println(Thread.currentThread()+" started execution:");
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println(" CHILD"+ " Printing :"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println(Thread.currentThread()+" Interrupted:");
        }
    }
}

class ThreadNew implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread()+" started execution:");
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println(" CHILD"+ " Printing :"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println(Thread.currentThread()+" Interrupted:");
        }
    }
}
class JoinDemo1
{
    public static void main(String args[])
    {
//        Thread mt=new MyThread("Child "); // child thread
        Thread mt = new Thread(new ThreadNew(),"Child");
        Thread t=Thread.currentThread(); // getting reference to main thread
        t.setName("MAIN THREAD:");
        System.out.println(t+" started :");
        mt.start();
        try{
            mt.join(); // main thread will wait till mt finishes
        }
        catch(InterruptedException ie)
        { System.out.println(mt+ " Interrupted:"); }
        System.out.println("Last statement in Main thread :");
    }
}