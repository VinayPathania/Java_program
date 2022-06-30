package Sprint_2.Day2;

class StudentDetail{
    int roll;
    String name;
    String address;
    String collageName;

    public StudentDetail(int r, String n, String a, String c){
        roll = r;
        name = n;
        address = a;
        collageName = c;
        if(collageName.equals("NIT")){
            System.out.println("NIT Students");
            System.out.println("Roll no: "+ roll);
            System.out.println("Name: "+ name);
            System.out.println("Address: "+ address);
            System.out.println("-----------");
        }
        else{
            System.out.println("Non NIT Students");
            System.out.println("Roll no: "+ roll);
            System.out.println("Name: "+ name);
            System.out.println("Address: "+ address);
            System.out.println("Collage Name: "+ collageName);
        }
    }

}


public class Student_Detail {
    public static void main(String[] args) {
        StudentDetail Data = new StudentDetail(234,"Vinay Singh","abc street","NIT");
        System.out.println(Data);


        StudentDetail Data1 = new StudentDetail(147,"Lilly","street seven2","IIT");
        System.out.println(Data1);
    }
}
