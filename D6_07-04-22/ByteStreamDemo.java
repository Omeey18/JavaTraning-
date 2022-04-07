import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
        
        // FileOutputStream fout = new FileOutputStream("test.txt");
        // String inData="OMPATEL";
        // byte in[] = inData.getBytes();
        // fout.write(in);
        // fout.close();
        // System.out.println("Success");

        FileInputStream fin = new FileInputStream("test.txt");
        System.out.println(fin.available());
        byte a[] = new byte[100];
        fin.read(a);
        String data = new String(a);

        System.out.println("File Contain: \n"+data);
        FileInputStream fin1 = new FileInputStream("test.txt");
        int i=0;
        while((i=fin1.read())!=-1){
            System.out.print((char)i);
        }
        fin1.close();
        fin.close();
    }
}
