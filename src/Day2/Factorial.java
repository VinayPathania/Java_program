package Day2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        if(num>100){
            System.out.println("Invalid number");
        }
        for(int i=2; i<=num; i++){
            if(num%i==0){
                while(num%i==0){
                    num = num/i;
                }
                System.out.println(i);
            }
        }
    }
}
