package Sprint_1.Day3;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("What is happening outside is it raining?");
        boolean isRaining = sc.nextBoolean();
        System.out.println("Is it snowing?");
        boolean isSnowing = sc.nextBoolean();
        System.out.println("What is the temp?");
        double temp = sc.nextDouble();


        if(isRaining || isSnowing || temp<10){
            System.out.println("Let's stay home");
        }
        else {
            System.out.println("Let's go outside!");
        }
    }
}
