package Sprint_2.Day5;

class Member{
        String Name;
        int Age;
        String PhoneNumber;
        String Address;
        double Salary;

        double printSalary(double salary){
            this.Salary = salary;
            return Salary;
        }
}
class Employee extends Member{
    Employee(String n, int a, String p, String ad, double s){
        System.out.println("Employee Detail");
        System.out.println("Name :"+ n);
        System.out.println("Age :"+ a);
        System.out.println("Phone :"+ p);
        System.out.println("Address :"+ ad);
        System.out.println("Salary :"+ printSalary(s));
    }
}
class Manager extends Member{
    Manager(String n, int a, String p, String ad, double s){
        System.out.println("Manager Detail");
        System.out.println("Name :"+ n);
        System.out.println("Age :"+ a);
        System.out.println("Phone :"+ p);
        System.out.println("Address :"+ ad);
        System.out.println("Salary :"+ printSalary(s));
    }
}


public class Q2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Vinay",24,"9882974464","abc street",80000);
        Employee emp = new Employee("Harsh",22,"9882974464","abc street",40000);

    }
}
