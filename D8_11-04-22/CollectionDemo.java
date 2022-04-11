import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList <String>list = new ArrayList<>();
        list.add("England");
        list.add("USA");
        list.add("Russia");
        list.add("india");
        System.out.println(list);
        Iterator <String>i = list.iterator();
        int index=0;
        while(i.hasNext()){
            String temp = i.next();
            index++;
            if(temp.equals("india"))
                System.out.println(temp+"\tINDEX: "+index);
        }

        Stack<String> s = new Stack<>();
        s.addAll(list);
        // s.push("India");
        // s.push("USA");
        // s.push("Russia");
        // s.push("England");
        i = s.iterator();
        System.out.println(s);
        while(i.hasNext()){
            String temp = i.next();
            if(temp.equals("india"))
                System.out.println(temp + " Using Stack");
        }
        System.out.println(s);

    }    
}
