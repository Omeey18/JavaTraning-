package cal;
import java.util.Scanner;

import calculate.*;

public class FindCal extends Cal {
    public static void main(String[] args) {
        Cal c1 = new Cal();
        // Cal.Protect p1 = new Cal.Protect();
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Addition: "+c1.add(num1, num2));
        System.out.println("Subtraction: "+c1.sub(num1, num2));
        System.out.println("Division: "+c1.div(num1, num2));
        sc.close();
    }
}
