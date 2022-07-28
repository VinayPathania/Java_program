package Sprint_1.Day2;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter City Name");
        String city = sc.nextLine();

        switch (city) {
            case "Mumbai" -> System.out.println("Financial city");
            case "Delhi" -> System.out.println("Capital of the country");
            case "Kolkata" -> System.out.println("City of Joy");
            case "Himachal" -> System.out.println("Land of Gods");
            default -> System.out.println("May be Other Indian City");
        }
    }
}
