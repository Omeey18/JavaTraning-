import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class CharStreamDemo {
    public static void main(String[] args) throws IOException {
        
        FileWriter fin = new FileWriter("test.txt");
        fin.write("OMPATEl");
        fin.close();

        FileReader fout = new FileReader("test.txt");
        // int i=0;
        // while((i=fout.read())!=-1){
        //     System.out.print((char)i);
        // }
        CharBuffer buff = CharBuffer.allocate(100);
        fout.read(buff.array());
        System.out.println(buff);
        System.out.println("\nSuccess");
        fout.close();
    }
}
