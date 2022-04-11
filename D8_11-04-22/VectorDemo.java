import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector <String>v=new Vector<>(5);
        v.add("Cricket");
        v.add("Football");
        v.addElement("baseBall");
        v.addElement("Hockey");
        v.addElement("Vollyball");
        System.out.println("Before Sort: "+v);
        // v.sort(null);
        Collections.sort(v,String.CASE_INSENSITIVE_ORDER);
        System.out.println("Asending Sort: "+v);
        Collections.reverse(v);
        System.out.println("Desending Sort: "+v);

        List<String> s = new ArrayList<>();
        s.addAll(v);
        System.out.println("List: "+s);

        
        ArrayList<String> a = new ArrayList<>();
        a.addAll(s);
        System.out.println("ArrayList: "+a); 
    }
}
