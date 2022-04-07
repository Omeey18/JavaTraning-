class Member{
    String name;
    int age;
    int p_num;
    String address;
    int salary;


    void printSalary(){
        System.out.println("Salary: "+salary);
    }
}

class employee extends Member{
    String specialization;
    void setData(String nam, int ag, int pnum, String add, int sal, String speci){
        name = nam;
        age = ag;
        p_num = pnum;
        address = add;
        salary = sal;
        specialization = speci;
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+p_num);
        System.out.println("Address: "+address);
        printSalary();
        // System.out.println("Salary: "+salary);
        System.out.println("Specialization: "+specialization);
    }

}
class Manager extends Member{
    String department;

    void setData(String nam, int ag, int pnum, String add, int sal, String depa){
        name = nam;
        age = ag;
        p_num = pnum;
        address = add;
        salary = sal;
        department = depa;
    }

    void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+p_num);
        System.out.println("Address: "+address);
        printSalary();
        // System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
    }

}


public class Task {
    public static void main(String[] args) {
        employee om = new employee();
        om.setData("OmPatel", 20, 1234567890, "kalol", 10000, "CE");
        om.show();
        Manager dhruv = new Manager();
        dhruv.setData("DHruv", 60, 1872387634, "Nagaland", 10, "CE");
        dhruv.show();
    }    
}
