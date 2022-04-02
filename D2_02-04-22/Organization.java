
class EMS{
    String name;
    static String org;
    String desg;
    String email;
    int m_num;
    EMS(String name, String email){
        this.name = name;
        org = "EI";
        desg = "Project Manager";
        this.email = email;
        System.out.println("Employee Name: "+name);
        System.out.println("Organization: "+org);
        System.out.println("Desiganation: "+desg);
        System.out.println("Email: "+email);
        // System.out.println("Employee Name: "+name);
    }
    EMS(String name, String email,int mobile){
        this.name = name;
        org = "EI";
        desg = "Developer";
        this.email = email;
        m_num = mobile;
        System.out.println("Employee Name: "+name);
        System.out.println("Organization: "+org);
        System.out.println("Desiganation: "+desg);
        System.out.println("Email: "+email);
        System.out.println("Mobile: "+mobile);
    }
    void dis(){
        

    }
}



public class Organization {
    public static void main(String[] args) {
        EMS e1 = new EMS("Om","@abc");
        System.out.println();
        EMS e2 = new EMS("Om","@abc",9208393);
        
    }

}
