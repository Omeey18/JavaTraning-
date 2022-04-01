import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userMark = sc.nextInt();

        if(userMark >= 75)
            System.out.println("Distinction");
        else if(userMark >= 65)
        System.out.println("First Class");
        else if(userMark >= 35)
        System.out.println("Second Class");
        else if(userMark < 35)
        System.out.println("Failed");

        sc.close();
    }
}
