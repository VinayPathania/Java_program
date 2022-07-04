package Sprint_2.Day4;

import java.util.Scanner;

public class Q1 {
    static String rev(char [] a){
        StringBuilder result = new StringBuilder();
        for(int i=a.length-1; i>=0; i--){
            result.append(a[i]).append(" ");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String to reverse");
        String input = sc.nextLine();
        char [] arr = input.toCharArray();
        String rev = rev(arr);
        System.out.println(rev);
    }
}
