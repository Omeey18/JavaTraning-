import java.util.Hashtable;


public class HashSetDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
        hm.put(100, "Om");
        hm.put(101, "Patel");
        hm.put(102, "Nileshkumar");

        // Map.Entry<Integer,String> m=(Entry<Integer, String>) hm.entrySet();
        // System.out.println(m.getKey()); 
        // for(int i=0;i<hm.size();i++)
        //     System.out.println(m.getKey()+" "+m.getValue());


        for(int i=100;i<100+hm.size();i++)
            System.out.println(hm.get(i));

    }
}
