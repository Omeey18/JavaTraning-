class th1 extends Thread{
    public void run(){
        // try {
        //     sleep(1000);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        for(int i =0;i<6;i++)
        System.out.print(i+" ");
    }
   
}
class th2 extends Thread{
    public void run(){
        for(int i =7;i<11;i++)
        System.out.print(i+" ");
    }
}

public class TodatTask {
    public static void main(String[] args) {
        th1 t = new th1();
        t.setPriority(1);
        th2 t2 = new th2();
        t2.setPriority(10);
        t.start();
        t2.start();
        
    }
}
