

class Operation{
    private long bal;
    void DisplayBal(){
        System.out.println("Balance is : "+bal);
    }
    void withDraw(int val){
        bal = bal - val;
        System.out.println("Withdraw sucess");
        // DisplayBal();
        // System.out.println();
        
    }
    void deposite(int val){
        bal = bal + val;
        System.out.println("Deposite sucess");
        // DisplayBal();
        // System.out.println();
    }
}

class myThread extends Thread{
    Operation op = new Operation();
    Integer v,v1;
    myThread(int val, int val2){
        
        v = val;
        v1= val2;
    }
    
    public void run(){
        synchronized(op){
                System.out.println(Thread.currentThread().getName());
                op.deposite(v);
                op.withDraw(v1);
                op.DisplayBal();
        }
        
    }
}


public class BankAcc {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 1 for Deposite\nEnter 2 for Withdraw: ");
        // int op = sc.nextInt();
        
        
        // System.out.println("Enter amount: ");
        // int val = sc.nextInt();


        myThread t = new myThread(5000,1000);//4000
        myThread t1 = new myThread(1000,500);//500
        myThread t2 = new myThread(2000,1000);//1000
        t.run();
        t1.run();
        t2.run();
        
    }

}
