package Day2;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        int sum = (num*(num+1))/2;
        System.out.println(sum);

    }
}
