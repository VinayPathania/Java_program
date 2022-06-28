package Day2;

import java.util.Scanner;

public class Cricket_score {
    static int scoreCounter(int a, int b, int c, int d, int e){
        b = b*2;
        c = c*3;
        d = d*4;
        e = e*6;
        return a+b+c+d+e;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ones = sc.nextInt();
        int twos = sc.nextInt();
        int threes = sc.nextInt();
        int fours = sc.nextInt();
        int sixes = sc.nextInt();
        int result = scoreCounter(ones,twos,threes,fours,sixes);
        System.out.println("Total score is "+result);
    }
}
