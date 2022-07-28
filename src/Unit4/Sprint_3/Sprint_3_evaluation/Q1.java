package Sprint_3.Sprint_3_evaluation;

import java.util.Scanner;

class Car{

    int numberOfPassenger;
    int numberOfKms;

    Car(){}
}
class Sedan extends Car{
    final int farePerKm =20;
}

class  HatchBack extends Car{
    final int farePerKm =15;
}
class OLA{
    public int bookCar(int numberOfPassenger){
        if (numberOfPassenger<=3){
            HatchBack h_back = new HatchBack();
            return h_back.farePerKm;
        }
        else {
            Sedan s = new Sedan();
            return s.farePerKm;
        }
    }
    public int calculateBill(int numberOfKMs,int farePerKm){
        return numberOfKMs*farePerKm;
    }

}


public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of passengers");
        int p = sc.nextInt();

        System.out.println("Enter no of km");
        int k = sc.nextInt();

        OLA ola = new OLA();

        int fare = ola.bookCar(p);


        int bill = ola.calculateBill(k,fare);
        System.out.println("The total fare amount is"+ bill);




    }
}
