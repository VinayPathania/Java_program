package Sprint_5.Day2;

import java.util.Scanner;

class ArithmeticExceptionAE extends Exception{
    @Override
    public String getMessage() {
        return "DivideByZeroException caught";
    }
}


public class Q2 {
    public static int devide(int a, int b) throws ArithmeticExceptionAE {
        if(a==0 || b==0){
            throw new ArithmeticExceptionAE();

        }

        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int result = devide(a,b);
            System.out.println("The quotient of" +a+"/"+b +"="+ result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
