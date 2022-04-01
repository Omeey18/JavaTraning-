package Pattrerns;
import java.util.*;

public class HalfPyramid {
    public static void main(String[] args) {
        int height=0;
        Scanner sc = new Scanner(System.in);
        height=sc.nextInt();

        for(int i=0;i<height;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

}
