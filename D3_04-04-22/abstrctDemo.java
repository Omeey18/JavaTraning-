 abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...!");
    }
    void refill(){
        System.out.println("Refilling pen...!");
    }
     public void Nib(){
        System.out.println("Changing Nib of pen...!");
    }
}


 public class abstrctDemo {
    public static void main(String[] args) {
        Pen p1 = new FountainPen();
        // p1.Nib();
        p1.write();
    }
}
