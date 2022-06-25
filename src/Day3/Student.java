package Day3;

import java.util.Scanner;

public class Student {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No");
        int roll = sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Total Marks");
        int marks = sc.nextInt();

        System.out.println("Roll no:"+" "+roll);
        System.out.println("Name:"+" "+name);
        System.out.println("Marks:"+" "+marks);
    }
}
