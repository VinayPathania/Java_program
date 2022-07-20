package Sprint_4.Day0;


import java.util.Scanner;

abstract class Student{
    String name;
    String address;
    Student(String n, String a){
        name = n;
        address = a;
        System.out.println("name of the student: "+name);
        System.out.println("Address of the student: "+address);
    }
    abstract float getPercentage(float m);
}

class ScienceStudent extends Student{

    float physicsMarks;
    float chemistryMarks;
    float mathsMarks;

    ScienceStudent(String n, String a) {
        super(n, a);
    }

    @Override
    float getPercentage(float m) {
        return m/3;
    }

    float getMarks(float p, float c, float m) {
        physicsMarks =p;
        chemistryMarks = c;
        mathsMarks = m;

        return (physicsMarks+chemistryMarks+mathsMarks);
    }


}

class HistoryStudent extends Student{

    float historyMarks;
    float civicsMarks;


    HistoryStudent(String n, String a) {
        super(n, a);
    }

    @Override
    float getPercentage(float m) {
        return m/2;
    }

    float getMarks(float h, float cm){
        historyMarks =h;
        civicsMarks = cm;
        return historyMarks+civicsMarks;
    }

}



public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Student: ");
        String name = sc.next();
        System.out.println("Enter address of Student: ");
        String address = sc.next();

        System.out.println("Enter the subject name for which you want to get percentage (science and history");
        String sub = sc.next();
        if(sub.equals("science")){
            ScienceStudent ss = new ScienceStudent(name,address);
            System.out.println("Enter physics marks");
            float p = sc.nextFloat();
            System.out.println("Enter chemistry marks");
            float c = sc.nextFloat();
            System.out.println("Enter maths marks");
            float m = sc.nextFloat();
            float marks = ss.getMarks(p,c,m);
            float percentage = ss.getPercentage(marks);
            System.out.println("Percentage of "+name+" "+percentage);
        }
        if (sub.equals("history")){
            HistoryStudent hs = new HistoryStudent(name,address);

            System.out.println("Enter history marks");
            float h = sc.nextFloat();
            System.out.println("Enter civics marks");
            float cm = sc.nextFloat();

//            float marks = hs.getMarks(h,cm);
            float percentage = hs.getPercentage(hs.getMarks(h,cm));
            System.out.println("Percentage of "+name+" "+percentage);
        }



    }
}
