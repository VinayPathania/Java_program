package Sprint_2.Day5;

import java.util.Scanner;

class Student3{
    int roll;
    String name;
    String address;
    int marks;

    Student3(int r, String n, String ad, int m){
        this.roll = r;
        this.name = n;
        this.address = ad;
        this.marks = m;
        System.out.println("Roll no: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("marks: "+marks);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students detail  you want to add?");
        int count  = sc.nextInt();
        int d = 1;
        for(int i=0; i<count; i++){
            System.out.println("Detail of Student: "+ d);
            System.out.println("Enter roll no");
            int roll = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter address");
            String address = sc.next();
            System.out.println("Enter marks");
            int marks = sc.nextInt();

            Student3 s3 = new Student3(roll, name, address, marks);
            d++;
        }


    }
}
