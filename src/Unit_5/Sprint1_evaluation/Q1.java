package Unit_5.Sprint1_evaluation;


import java.util.Comparator;
import java.util.TreeMap;

class EmployeeSal{
    Integer empId;
    String name;
    String address;

    public EmployeeSal(Integer e, String n, String a){
        this.empId = e;
        this.name = n;
        this.address = a;
    }

    @Override
    public String toString() {
        return
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +"salary";
    }
}

class EmployeeNameSort<EmployeeSal> implements Comparator<Unit_5.Sprint1_evaluation.EmployeeSal>{

    @Override
    public int compare(Unit_5.Sprint1_evaluation.EmployeeSal o1, Unit_5.Sprint1_evaluation.EmployeeSal o2) {
        return o1.name.compareTo(o2.name);

    }
}


public class Q1 {
    public static void main(String[] args) {
        TreeMap<EmployeeSal,Integer> EmpDetail = new TreeMap<EmployeeSal, Integer>(new EmployeeNameSort());

        EmployeeSal e1 = new EmployeeSal(1,"apple","abcStreet");
        EmployeeSal e2 = new EmployeeSal(2,"samsung","zbcStreet");
        EmployeeSal e3 = new EmployeeSal(3,"xiaomi","ltdStreet");
        EmployeeSal e4 = new EmployeeSal(4,"oppo","mnpStreet");

        EmpDetail.put(e1,20000);
        EmpDetail.put(e2,40000);
        EmpDetail.put(e3,35000);
        EmpDetail.put(e4,27000);

        System.out.println(EmpDetail.toString());

    }

}
