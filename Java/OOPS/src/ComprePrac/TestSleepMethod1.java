package ComprePrac;

class BookTheaterSeat
{
    int total_seats = 10;
    synchronized void bookSeat(int seats) throws InterruptedException {
//            wait();
            if (total_seats >= seats) {
                System.out.println(seats + "seats booked successfully");
                total_seats = total_seats - seats;
                System.out.println("Total Seats Left : " + total_seats);
            } else {
                System.out.println("Seats Cannot be booked!");
                System.out.println("Total Seats Left : " + total_seats);
            }
//            notify();
    }
}

class Customer{
    int amount=100000;

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");

        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposit...");
            try{wait();} catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.amount-=amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("deposit completed... ");
        notify();
    }
}

class MovieBookAppSyncchronized extends Thread
{
    static BookTheaterSeat b;
    int seats;
    public void run()
    {
        try {
            b.bookSeat(seats);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args)
    {
        b = new BookTheaterSeat();
        MovieBookAppSyncchronized param = new MovieBookAppSyncchronized();
        param.seats = 7;
        param.start();
        MovieBookAppSyncchronized amit = new MovieBookAppSyncchronized();
        amit.seats = 6;
        amit.start();
    }
}

public class TestSleepMethod1 extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        TestSleepMethod1 t1=new TestSleepMethod1();
        t1.run();//fine, but does not start a separate call stack
    }
}

class Test{
    public static void main(String args[]){
        final Customer c=new Customer();
        new Thread(){
            public void run(){c.withdraw(15000);}
        }.start();
        new Thread(){
            public void run(){c.deposit(10000);}
        }.start();

    }
}
