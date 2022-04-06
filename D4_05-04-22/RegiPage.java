import java.util.Scanner;

class Registration{
    String name,surname,pass,c_pass="",email;
    StringBuffer mobile = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    void getData(){
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Surname: ");
        surname = sc.nextLine();
        System.out.println("Enter mobile number: ");
        mobile.insert(0, sc.nextLine());
        System.out.println("Enter password: ");
        pass = sc.nextLine();
        System.out.println("Enter confirm password: ");
        c_pass = sc.nextLine();  

        if(pass.equals(c_pass)){
            System.out.println("Password done");;
        }else{
            System.out.println("Wrong Password");
        }
        email = name+surname+mobile.substring(0, 4)+"@gmail.com";
        System.out.println("Email: "+email);
    }
    void initial(){
        System.out.println("Name: "+name.charAt(0));
        System.out.println("Surname: "+surname.charAt(0));
    }

    void replace_mo(){
        mobile.replace(0,11,"1234567890");
        System.out.println("Mobile: "+mobile);
        mobile.replace(3, 5, "66");
        System.out.println("After replace Mobile: "+mobile);
    }

    void check(){
        System.out.println("Name contains: "+name.contains("a"));
    }

    void reverse(){
        System.out.println("Reverse mobile number: "+mobile.reverse());
    }

    void m_split(){
        String arr[] = mobile.toString().split("66");
        System.out.println("\nAfter split: ");
        for(String data:arr)
            System.out.println(data);
    }

    void e_split(){
        StringBuffer char_only = new StringBuffer();
        StringBuffer int_only = new  StringBuffer();
        StringBuffer special_only = new  StringBuffer();
        for(int i=0;i<email.length();i++){
            if(Character.isAlphabetic(email.charAt(i)))
                char_only.append(email.charAt(i));
            else if(Character.isDigit(email.charAt(i)))
                int_only.append(email.charAt(i));
            else
                special_only.append(email.charAt(i)); 
        }
        // String i = toString(int_only));
        System.out.println("Char Only: "+char_only);
        System.out.println("Int Only: "+int_only);
        System.out.println("Special Only: "+special_only);
    }
    

}

public class RegiPage {
    public static void main(String[] args) {
        
        Registration r1 = new Registration();
        r1.getData();

        System.out.println("Printing Initials of name and surname...");
        r1.initial();
        System.out.println("Replacing mobile number...!");
        r1.replace_mo();
        r1.check();
        r1.reverse();
        r1.m_split();
        r1.e_split();

    }    
}
