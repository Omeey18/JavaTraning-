package Pattrerns;
import java.util.*;
public class HoloRec{
    public static void main(String[] args) {
        int height=0,weight=0;
        Scanner sc = new Scanner(System.in);
        height=sc.nextInt();
        weight=sc.nextInt();
        for(int i=0;i<height;i++){
            System.out.print("* ");
            if(i==0 || i==height-1){
                for(int j=1;j<weight-1;j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=1;j<weight-1;j++){
                    System.out.print("  ");
                }
            }
            System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}