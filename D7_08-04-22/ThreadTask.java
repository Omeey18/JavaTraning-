class Sub extends Thread{
    int a,b;
        public Sub(int i, int j) {
            a=i;
            b=j;
        }
        public void run(){
            System.out.println("Sub: "+ (a-b));
        }
}

class Sum extends Thread{
    int a,b;
        public Sum(int i, int j) {
            a=i;
            b=j;
        }
        public void run(){
            System.out.println("Sum: "+ (a+b));
        }
    }

class Mul extends Thread{
    int a=5,b=3;
        public Mul(int i, int j) {
            a=i;
            b=j;
        }
        public void run(){
            System.out.println("Mul: "+ (a*b));
        }
    }

public class ThreadTask {
    public static void main(String[] args) {
        
            Sum t1  = new Sum(5,4);
            Sub t2  = new Sub(5,4);
            Mul t3  = new Mul(5,4);

            t1.start();
            t2.start();
            t3.start();
        
    }    
}
