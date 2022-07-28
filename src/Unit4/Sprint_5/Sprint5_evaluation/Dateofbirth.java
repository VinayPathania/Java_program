package Sprint_5.Sprint5_evaluation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Dateofbirth {

    public static void validDate(String dob) throws InvalidDateException {
        try {
            DateTimeFormatter form=DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate id=LocalDate.parse(dob, form);
            LocalDate ld=LocalDate.now();

            if(id.isBefore(ld)) {
                Period diff=Period.between(id, ld);
                System.out.println(diff.getYears());
                if(diff.getDays()==0&&diff.getMonths()==0&&diff.getYears()>=18) {
                    System.out.println("Happy Birthday, You are eligible to cast your vote");
                }else if(diff.getYears()>=18) {
                    System.out.println("“You are eligible to cast your vote”");
                }else {
                    System.out.println("“You are Not eligible to cast your vote”");
                }
            }else {
                throw new InvalidDateException("”Date of birth should not be in future”");
            }


        }
        catch (DateTimeParseException e) {
            // TODO: handle exception
            System.out.println("please pass the date in the proper format");

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date of birth = dd-MM-yyyy");
        String dob=sc.next();

        try {
            validDate(dob);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }


    }
}
