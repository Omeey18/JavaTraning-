import java.util.Scanner;

class Registration {
    String name, surname, pass, c_pass = "", email;
    StringBuffer mobile = new StringBuffer();
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Surname: ");
        surname = sc.nextLine();
        System.out.println("Enter mobile number: ");
        mobile.insert(0, sc.nextLine());
        System.out.println("Enter Email: ");
        email = sc.nextLine();
        System.out.println("Enter password: ");
        pass = sc.nextLine();
        System.out.println("Enter confirm password: ");
        c_pass = sc.nextLine();

    }

}

class R_Method extends Registration {
    void checkMail() {
        if (email.contains("@")) {
            System.out.println("Yes Email Contains '@'");
        } else
            System.out.println("No Email not contains '@'");
    }

    void convertMobile() {
        Long l_mLong = Long.parseLong(mobile.toString());
        System.out.println("Long Mobile Num: " + l_mLong);
    }

    void chechPass() throws Exception {
        if (!pass.equals(c_pass))
            throw new Exception("Password Not Matched");
    }

}

interface Login {
    void loginAuth();
}

class Auth extends R_Method implements Login {

    @Override
    public void loginAuth() {
        // TODO Auto-generated method stub
        String checkEmail, checkPass;
        Scanner sc = new Scanner(System.in);

        System.out.println("For LOGIN");
        System.out.println("Enter Email: ");
        checkEmail = sc.nextLine();
        System.out.println("Enter Pass: ");
        checkPass = sc.nextLine();
        if (checkEmail.equals(email) && checkPass.equals(pass)) {
            System.out.println("Login Succesfully");
        } else {
            System.out.println("Failed");
        }
        sc.close();
    }

}

public class RegiTask {
    public static void main(String[] args) throws Exception {

        Auth r1 = new Auth();
        r1.getData();
        r1.checkMail();

        r1.convertMobile();
        r1.chechPass();

        r1.loginAuth();

    }
}
