import java.io.*;
import java.util.Scanner;

public class FileTask {
    public static void main(String[] args) throws IOException {
        File f = new File("Folder");
        f.mkdir();
        
        //file 1 create and write using ByteStreamClass
        FileOutputStream fout1 = new FileOutputStream("Folder/file1.txt");
        String inData;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data of file 1: ");
        inData = sc.nextLine();
        byte in[] = inData.getBytes();
        fout1.write(in);
        fout1.close();
        
        //reading file1
        FileReader fin1  = new FileReader("Folder/file1.txt");
        int i=0;
        System.out.println("\nFile 1 contain: ");
        while((i=fin1.read())!=-1){
            System.out.print((char)i);
        }     
        System.out.println();
        fin1.close();        
        
        
        //File 2 Create and write using CHarStreamClass
        FileWriter fout2 = new FileWriter("Folder/file2.txt");
        String inData2;
        System.out.println("Enter data of file 2: ");
        inData2 = sc.nextLine();
        fout2.write(inData2);
        fout2.close();
        
        //reading file2
        System.out.println("\nFile 2 Contain:");
        FileInputStream fin2 = new FileInputStream("Folder/file2.txt");
        i=0;
        while((i=fin2.read())!=-1){
            System.out.print((char)i);
        }
        fin2.close();
        
        File f1 = new File("Folder/file3.txt");
        System.out.println("\n\nFile 3 is created..! "+f1.createNewFile());
        System.out.println("File 3 is Deleted...! "+f1.delete());
        sc.close();
    }
}
