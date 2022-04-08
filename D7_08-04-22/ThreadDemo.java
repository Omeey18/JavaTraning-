
// class MyThread extends Thread{
//     public void run(){
//         System.out.println("Thread is runnig: "+Thread.currentThread().getId());
//     }
// }
public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
        ThreadDemo t1  = new ThreadDemo();
        t1.start();
        }

    }
    public void run(){
                System.out.println("Thread is runnig: "+Thread.currentThread().getId());
            }
}
