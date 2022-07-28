package Sprint_4.Sprint_4_Evaluation;

// import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int count = 1;
        for(int  i=0; i<n; i++){
            System.out.println("Enter element number "+ count);
            arr[i] = sc.nextInt();
            count++;
        }
         Arrays.toString(arr);


        System.out.println("Enter Index number which you want to print");
        int index = sc.nextInt();
        try {
            System.out.println("The array element at index "+ index +" is: "+arr[index]);
            System.out.println("The array element successfully accessed");
        }
        catch (Exception e){
            System.out.println("Exception occurred"+ e);
        }
    }
}
