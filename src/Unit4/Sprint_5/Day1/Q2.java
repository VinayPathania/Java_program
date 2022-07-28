package Sprint_5.Day1;

import java.util.Scanner;

class Citizen{
    String name;
    String aadharNumber;
    String mobileNumber;
    Citizen(String n, String a, String m){
        this.name=n;
        System.out.println("Name of citizen: "+name);
        this.aadharNumber=a;
        System.out.println("Aadhar Number: "+aadharNumber);
        this.mobileNumber=m;
        System.out.println("Mobile Number: "+mobileNumber);
    }
}

public class Q2 {
    public boolean validate(String name, String mobileNum, String aadharCard){

        return name.length() >= 3 && name.length() <= 8 && aadharCard.length() == 12 && mobileNum.charAt(0) == 6 || mobileNum.charAt(0) == 7 || mobileNum.charAt(0) == 8 || mobileNum.charAt(0) == 9
                && mobileNum.length() == 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of citizen");
        String name = sc.next();
        System.out.println("Enter the aadhar number of citizen");
        String aadhar = sc.next();
        System.out.println("Enter the mobile number of citizen");
        String mobile = sc.next();

        Q2 valid = new Q2();
        boolean validate = valid.validate(name,aadhar,mobile);

        if (validate){
            new Citizen(name, aadhar, mobile);
        }
        else {
            System.out.println("Please enter the valid details of the citizen");
        }

    }


}
