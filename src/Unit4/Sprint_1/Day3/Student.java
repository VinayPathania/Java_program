package Sprint_1.Day3;

import java.util.Scanner;
public class Student {
     static void studentDetail(String a, int b, int c){

         System.out.println("Name: "+a);
        System.out.println("Roll no: "+b);
         System.out.println("Marks: "+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll no");
        int roll = sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Marks");
        int marks = sc.nextInt();
        studentDetail(name,roll,marks);
//        System.out.println(c);

    }
}
