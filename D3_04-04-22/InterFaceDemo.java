interface TVremote{
void changeChannel();
}

interface smartTVremote extends TVremote{
    void changeChannel();

    //static void hello(){
    //     System.out.println("Hello om...");
    // }
}

class TV implements smartTVremote{
    public void changeChannel(){
        System.out.println("Channel changed..!");
    }   
    // public void hello(){
    //     System.out.println("Hello dhruv");
    // }
}


public class InterFaceDemo {
    public static void main(String[] args) {

        TV t1 = new TV();
        t1.changeChannel();
        // t1.hello();
        
    }
}
