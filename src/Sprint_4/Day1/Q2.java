package Sprint_4.Day1;

import java.util.Scanner;

interface Hotel{
    void chickenBiryani();
    void masalaDosa();
}

class TajHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Chicken Biryani is coming......");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa is coming.......");
    }
    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel.....");
    }
}
class RoadSideHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Chicken Biryani is coming......");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa is coming.......");
    }
}

class Demo{
    public Hotel provideFood(int amount){
        if(amount>=200 && amount<=1000){
            RoadSideHotel rds = new RoadSideHotel();
            rds.chickenBiryani();
            rds.masalaDosa();
            return rds;
        }
        else if(amount>1000){
            TajHotel taj = new TajHotel();
            taj.chickenBiryani();
            taj.masalaDosa();
            taj.welcomeDrink();
            return taj;
        }
        else {
            return null;
        }
    }
}


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo obj = new Demo();
        System.out.println("Enter amount");
        int amt = sc.nextInt();
        obj.provideFood(amt);

    }
}
