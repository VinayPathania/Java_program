package Sprint_5.Day1;


import java.util.Scanner;

public class Q3 {


    public static void main(String[] args) {
        System.out.println("start of main..");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        String message ;


        try{
            int num3 = num1 / num2;
            if(num3 < 10){
                message = "Welcome to Exception Handling ";
            }
            else {
                message = "the number is grater then 10";
            }
            System.out.println("Message is :"+message.toUpperCase());

        }
        catch (Exception e){
            System.out.println("the number is grater then 10");
            System.out.println(e);
        }
//


        System.out.println("end of main");
    }
}
