package Sprint_5.Sprint5_evaluation;


import java.util.Objects;

abstract class Employee{
        protected int employeeId;
        protected String employeeName;
        protected double salary;

    public Employee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Employee(int ei, String en){
       this.setEmployeeId(ei);
        this.setEmployeeName(en);
    }
    abstract void calculateSalary();

}

class PermanentEmployee extends Employee{
    private double basicPay;
    double PF = basicPay*.12;
    PermanentEmployee(int ei, String en,double bp){
        this.setEmployeeId(ei);
        this.setEmployeeName(en);
        this.basicPay = bp;
    }

    @Override
    void calculateSalary() {
        this.salary = this.basicPay-this.PF;
        //System.out.println(salary);
        this.setSalary(salary);
    }
}

class TemporaryEmployee extends Employee{
    private final int hoursWorked;
    private final int hourlyWages;

    TemporaryEmployee(int ei, String en, int hw, int lw){
        this.employeeId=ei;
        this.employeeName=en;
        this.hoursWorked = hw;
        this.hourlyWages = lw;
    }
    @Override
    void calculateSalary() {
        this.salary = this.hoursWorked*this.hourlyWages;
        //System.out.println(salary);
        this.setSalary(salary);
    }
}



public class Loan {
    public double calculateLoanAmount(Employee obj){
        double loanAmt = 0;
        if(obj.equals(new PermanentEmployee(1, "arun", 20000)) )
        {
            loanAmt=(15* obj.salary)/100;
        }
        if(obj.equals(new TemporaryEmployee(1, "ram", 10, 200)) )
        {
            loanAmt = (10* obj.getSalary())/100;
        }
        return loanAmt;
    }

    public static void main(String[] args) {
        Loan loan = new Loan();
        double permanentEmployeeLoan=loan.calculateLoanAmount(new PermanentEmployee(1,"Name1",1000));

        double temporaryEmployeeLoan=loan.calculateLoanAmount(new TemporaryEmployee(2,"Name2",20,100));

        System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
        System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
    }
}
