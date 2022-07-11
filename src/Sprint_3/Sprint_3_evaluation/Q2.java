package Sprint_3.Sprint_3_evaluation;

import java.util.Scanner;

public class Q2 {
    private int calculateAverage(int[] age){
        int average;
        int sum = 0;
        int count=0;
        for (int j : age) {
            sum += j;
            count++;
        }
        average = sum/count;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total no.of employees:");
        int emp = sc.nextInt();
        if(emp<2){
            System.out.println("Please enter a valid employee count");
        }
        else{

            int [] arr = new int[emp];
            System.out.println("Enter the age of "+emp+" employees");
            for (int i=0; i<emp; i++){
                arr[i] = sc.nextInt();
            }
            sc.close();
            Q2 obj = new Q2();
            int average = obj.calculateAverage(arr);
            System.out.println("The average age is: "+average);
        }


    }
}
