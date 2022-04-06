import java.util.Scanner;

public class CalculatorTask {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     int num1 = sc.nextInt();
     int num2 = sc.nextInt();

     System.out.println(cal(num1,num2));
     
     sc.close();
    }

    static int cal(int a, int b){

        int ans=0;
        String op;
        Scanner sc = new Scanner(System.in);
        op=sc.next();
        switch(op){
            case "+":
                ans = a+b;
                break;
            case "-":
                ans = a-b;
                break;
            case "*":
                ans = a*b;
                if(ans==0)
                    throw new ArithmeticException("Multiply by Zero");
                break;
            case "/":
                try{
                    ans = a/b;
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
                
            default:
            System.out.println("Invalid Input");

        }
        
        // sc.close();
        return ans;
    }
}
