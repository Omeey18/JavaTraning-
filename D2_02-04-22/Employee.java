import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        String emp[][] = new String[3][3];
        Scanner sc = new Scanner(System.in);
          

        for(int i=0;i<3;i++){
            System.out.println("Enter Detail of Emp: "+i+1);
            System.out.println("Order will be 1:NAME 2:JOINING YEAR 3:ADDRESS");
            for(int j=0;j<3;j++){
                emp[i][j] = sc.nextLine();
            }
        }
    
        System.out.println("\nName   joining     Address");
        System.out.println("----------------------------------");
        for(String row[]:emp){
            for(String data:row){
                System.out.print(data+"     ");
            }
            System.out.println();

        }

        System.out.println("----------------------------------");
        System.out.println("Enter person name to search: ");
        String name = sc.nextLine();

        System.out.println("\nName   joining     Address");
        System.out.println("----------------------------------");
        // for(int i=0;i<3;i++){
        //     if(emp[i][0].equals(name)){
        //         for(int j=0;j<3;j++){
        //             System.out.print(emp[i][j]+"     ");
        //         }
        //     }
        //     System.out.println();
        // }
        for(String row[]:emp){
            if(row[0].equals(name)){
                for(String data:row){
                    System.out.print(data+"     ");
                }
            }
        }
        sc.close();
    }   
}
