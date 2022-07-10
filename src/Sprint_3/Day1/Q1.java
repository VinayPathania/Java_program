package Sprint_3.Day1;

import java.util.Scanner;

abstract class Student{
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public Student(){
    }

    public char calculateGrade(int marks){
        char grade1 = this.grade;
        this.marks = marks;
        if (marks >= 500) grade1 = 'A';
        if ( marks<500 && marks >= 400) grade1 = 'B';
        if (marks < 400) grade1 = 'C';
        return grade1;
    }
    public void displayDetails(int roll, String name,int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        System.out.println("Roll no: "+roll);
        System.out.println("Name : "+name);
        System.out.println("Marks : "+marks);
        System.out.println("Grade: "+calculateGrade(marks));
    }

}

class Demo extends Student{

}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no");
         int roll=sc.nextInt();

        System.out.println("Enter Name");
         String name =sc.next();

        System.out.println("Enter marks");
         int marks = sc.nextInt();

        Student s1 = new Demo();
        s1.displayDetails(roll,name,marks);
    }
}
