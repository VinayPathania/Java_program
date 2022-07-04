package Sprint_2.Sprint2_Evaluation;

import java.util.Scanner;
class Student{
    int rollNumber;
    String studentName;
    long marks;


    public Student() {
        System.out.println("Student Roll Number: "+rollNumber);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Mark"+marks);
    }



     Student(int r, String n, int m){
         rollNumber= r;
         studentName = n;
         marks = m;
        System.out.println("Student Roll Number: "+rollNumber);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Mark"+marks);
    }

}
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number of Students you want to enter");
        int count = sc.nextInt();
        System.out.println("============================");
        int d=1;
        for(int i=0; i<count; i++){
            System.out.println("Student Detail: "+d);
            System.out.println("Enter the Roll Number : ");
            int roll = sc.nextInt();

            System.out.println("Enter the Name: ");
            String name = sc.next();

            System.out.println("Enter the marks: ");
            int marks = sc.nextInt();

            new Student(roll, name, marks);
            d++;
        }
    }
}
