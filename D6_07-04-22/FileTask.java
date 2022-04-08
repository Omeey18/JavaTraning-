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
        System.out.println("How many lines you want to add: ");
        int line  = sc.nextInt();

        while(line>=0){
            inData = sc.nextLine();
            byte in[] = inData.getBytes();
            fout1.write(in);
            fout1.write(10);
            line--;
        }
        fout1.close();
        
        //reading file1 using charStreamClass
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
        System.out.println("How many lines you want to add: ");
        line  = sc.nextInt();
        while(line>=0){
            inData2 = sc.nextLine();
            fout2.write(inData2);
            fout2.write('\n');
            line--;
        }
        fout2.close();
        
        //reading file2 using byteStreamClass
        System.out.println("\nFile 2 Contain:");
        FileInputStream fin2 = new FileInputStream("Folder/file2.txt");
        i=0;
        while((i=fin2.read())!=-1){
            System.out.print((char)i);
        }
        fin2.close();
        
        //file3 is created and deleted using File class obj
        File f1 = new File("Folder/file3.txt");
        System.out.println("\n\nFile 3 is created..! "+f1.createNewFile());
        System.out.println("File 3 is Deleted...! "+f1.delete());


        //checking india in file line or not 
        FileReader checkIndia11 = new FileReader("Folder/file1.txt");
        FileReader checkIndia22 = new FileReader("Folder/file2.txt");
        Scanner checkIndia1 = new Scanner(checkIndia11);
        line = 0;
        while(checkIndia1.hasNextLine()){
            String F1line = checkIndia1.nextLine();
            line++;
            if(F1line.contains("india")){
                System.out.println("File 1: Line Number: "+ --line +" Data: "+F1line);
            }
        }
        Scanner checkIndia2 = new Scanner(checkIndia22);
        line = 0;
        while(checkIndia2.hasNextLine()){
            String F2line = checkIndia2.nextLine();
            line++;
            if(F2line.contains("india")){
                System.out.println("File 2: Line Number: "+ --line +" Data: "+F2line);
            }
        }
        checkIndia1.close();
        checkIndia2.close();
        sc.close();
    }
}
