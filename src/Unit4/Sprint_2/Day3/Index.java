package Sprint_2.Day3;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String word = "Java Exercise";
        char[] arr = word.toCharArray();
        System.out.println(arr);
        System.out.println("Enter the index number which you want to search");
        int i = sc.nextInt();
        for(int k=0; k<arr.length; k++){
            if(k==i){
                System.out.println(arr[k]);
            }
        }
    }
}
