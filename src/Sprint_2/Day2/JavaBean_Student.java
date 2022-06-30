package Sprint_2.Day2;

class Student{
    private int  roll;
    private String name;
    private int age;
    private int marks;

    public Student(){
        roll = 23;
        name = "Vinay Singh";
        age = 24;
        marks = 600;
    }
    public Student(int r, String n, int a, int m){
        roll = r;
        name = n;
        age = a;
        marks = m;
    }



    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getMarks(){
        return marks;
    }
    public void setRoll(int r){
        this.roll = r;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setAge(int a){
        if(age>18 && age<60) this.age = a;
    }
    public void setMarks(int m){
        if(marks>500) this.marks = m;
    }

}

public class JavaBean_Student {
    public static void main(String[] args) {
        Student vinay = new Student();

        System.out.println(vinay.getAge());
        System.out.println(vinay.getRoll());
        System.out.println(vinay.getName());
        System.out.println(vinay.getMarks());

        Student vinay2 = new Student(187,"Ram",22,755);
        System.out.println(vinay2.getAge());
        System.out.println(vinay2.getRoll());
        System.out.println(vinay2.getName());
        System.out.println(vinay2.getMarks());
    }
}
