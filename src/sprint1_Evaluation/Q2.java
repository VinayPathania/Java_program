package sprint1_Evaluation;

import java.util.Scanner;

public class Q2 {
    static void monthDetail(String month){
        switch (month) {
            case "january" -> System.out.println("This is the 1st Month of the Year January");
            case "february" -> System.out.println("This is the 2nd Month of the Year February");
            case "march" -> System.out.println("This is the 3rd Month of the Year March");
            case "april" -> System.out.println("This is the 4th Month of the Year April");
            case "may" -> System.out.println("This is the 5th Month of the Year May");
            case "june" -> System.out.println("This is the 6th Month of the Year June");
            case "july" -> System.out.println("This is the 7th Month of the Year July");
            case "august" -> System.out.println("This is the 8th Month of the Year August");
            case "september" -> System.out.println("This is the 9th Month of the Year September");
            case "october" -> System.out.println("This is the 10th Month of the Year October");
            case "november" -> System.out.println("This is the 11th Month of the Year November");
            case "december" -> System.out.println("This is the 12th Month of the Year December");
            default -> System.out.println("Please Enter a valid month");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter City Name");
        String month = sc.nextLine();

        monthDetail(month.toLowerCase());



    }
}
