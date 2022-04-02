package Pattrerns;

import java.util.*;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        
        int height=0;
        Scanner sc = new Scanner(System.in);
        height=sc.nextInt();

        for(int i=height;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            sc.close();    
    }
}

