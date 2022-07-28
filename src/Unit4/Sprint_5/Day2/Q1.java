package Sprint_5.Day2;

import java.util.Scanner;

class InvalidCountryException extends Exception{
    @Override
    public String toString() {
        return "User Outside India cannot be registered";
    }

    @Override
    public String getMessage() {
        return "User Outside India cannot be registered";
    }
}

public class Q1 {

    public static String UserRegistration(String username, String userCountry) throws InvalidCountryException{
        if(!userCountry.equals("india")){
            throw new InvalidCountryException();
        }
        return "User Registration Successful";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String username = sc.next();
        System.out.println("Enter Your Country: ");
        String userCountry = sc.next().toLowerCase();

        try{
            String registration = UserRegistration(username,userCountry);
            System.out.println(registration);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
