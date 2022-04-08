class myThread1 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i = 0;
        while(i<4){
            System.out.println("Thread 1 is running ");
            // System.out.println("Happy");
            i++;
            // try {
            //     Thread.sleep(500);
            // } catch (InterruptedException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
        }
        
    }

} 
class myThread2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<4){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Thread 2 is running ");
            // System.out.println("Sad");
            i++;
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        myThread1  myt1= new myThread1();
        myThread2 myt2= new myThread2();
        Thread  t1 = new Thread(myt1);
        t1.start();
        Thread t2 = new Thread(myt2);
        t2.start(); 
        
    }
}
