package Lab9;

public class SampleThread implements Runnable{
    int type;
    SampleThread(int type){
        this.type = type;

    }
    @Override
    public void run() {
        if(type == 0){
            for(int i = 1; i <= 26; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }else{
            for(char i = 'A'; i <= 'Z'; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
