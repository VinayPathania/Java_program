package Sprint_4.Sprint_4_Evaluation;

import java.util.Objects;
import java.util.Scanner;

abstract class Bank{
    String branchName;
    String ifscCode;


    abstract void displayDetails();
}

class AxisBank extends Bank{
    String branchName = "Axis Bank Nurpur";
    String ifscCode = "Axis00023";
    double  rateOfInterest = 2.5;
    @Override
    void displayDetails(){
        System.out.println("Branch Name: "+ branchName);
        System.out.println("IFSC code: "+ ifscCode);
        System.out.println("Rate of Interest: "+ rateOfInterest);
    }
    void getCreditCard(){
        System.out.println("Get the Credit Card from the Axis bank");
    }
}

class ICICIBank extends Bank{
    String branchName = "ICICI Bank Kangra";
    String ifscCode = "ICICI11023";
    double  rateOfInterest = 3.5;
    @Override
    void displayDetails(){
        System.out.println("Branch Name: "+ branchName);
        System.out.println("IFSC code: "+ ifscCode);
        System.out.println("Rate of Interest: "+ rateOfInterest);
    }
    void getCreditCard(){
        System.out.println("Get the Credit Card from the ICICI bank");
    }
}




public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank name which you want to search");
        String Bank = sc.next();
        AxisBank a = new AxisBank();
        ICICIBank i = new ICICIBank();
        if (Objects.equals(Bank, "axis")){
            a.displayDetails();
            a.getCreditCard();
        }
        else if(Objects.equals(Bank, "icici")) {
            i.displayDetails();
            i.getCreditCard();
        }
        else{
            System.out.println("Please enter the valid bank name");
        }
    }

}
