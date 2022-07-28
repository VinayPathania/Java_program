package Sprint_2.Day3;

import java.util.Scanner;

public class Course {

    int courseId = 18;
    String courseName = "FT_WEB_18";
    int courseFee = 300000;

    public void displayCourseDetails(){
        System.out.println("Course Id: "+ courseId);
        System.out.println("Course Name: "+ courseName);
        System.out.println("Course Fee: "+ courseFee);

    }

    public  String authenticate(String username, String password){
        String result = "";
        if(username.equals("Admin") && password.equals("1234")){
              displayCourseDetails();
        }
        else{
            result = "Invalid Username or password";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name");
        String user = sc.nextLine();
        System.out.println("Enter Password");
        String pass = sc.nextLine();

        Course obj = new Course();
        String output = obj.authenticate(user,pass);
        System.out.println(output);
    }
}
