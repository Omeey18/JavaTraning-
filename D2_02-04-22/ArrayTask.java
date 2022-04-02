import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int a:arr){
            switch(a){
                case 1:
                System.out.println("ONE");
                break;

                case 2:
                System.out.println("TWO");
                break;

                case 3:
                System.out.println("THREE");
                break;

                case 4:
                System.out.println("FOUR");
                break;
                
                case 5:
                System.out.println("FIVE");
                break;

                default:
                System.out.println("Invalid num");
            }
        }
        sc.close();
    }
}
