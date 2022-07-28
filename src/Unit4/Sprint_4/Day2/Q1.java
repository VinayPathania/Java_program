package Sprint_4.Day2;

import java.util.Scanner;

public class Q1 {

    static void searchOutdatedModel(String n, String m){
        String[] outdatedModels = {"note4","note5","note6","note7"};
        boolean found = false;
        for(String a: outdatedModels){
            if (a.equals(m)) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(n+" "+m+"_OUTDATED");
        }
        else {
            System.out.println("This is updated model");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand name");
        String n = sc.next();
        System.out.println("Enter Model name");
        String m = sc.next();
        Q1.searchOutdatedModel(n,m);
    }
}
