import java.util.Scanner;

public class Detail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Full name");
        String name = sc.nextLine();
        System.out.println("Name: "+ name );

        System.out.println("Enter your Father name");
        String Father_name = sc.nextLine();
        System.out.println("Father_Name: "+ Father_name );

        System.out.println("Enter your Mother name");
        String Mother_name = sc.nextLine();
        System.out.println("Mother_Name: "+ Mother_name );

        System.out.println("Enter your Age");
        int Age = sc.nextInt();
        System.out.println("Age: "+ Age );

        System.out.println("Enter your Gender");
        String Gender = sc.next();
        System.out.println("Gender: "+ Gender );

        System.out.println("Enter your Mobile number");
        long Mobile = sc.nextLong();
        System.out.println("Mobile: "+ Mobile );



    }
}
