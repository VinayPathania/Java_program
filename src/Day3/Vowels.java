package Day3;


import java.util.Objects;
import java.util.Scanner;
public class Vowels {

    String checkV_C(String chr){
        StringBuilder print = new StringBuilder();
                String [] arr1 = {"a","e","i","o","u"};
                String [] arr = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
        for (String s : arr1) {
            if (Objects.equals(chr, s)) {
                print.append("It's a Vowel");
            }
        }
        for (String s : arr) {
            if (Objects.equals(chr, s)) {
                print.append("Its Consonant");
            }
        }
            return print.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the character");
        String character = sc.next();
        Vowels obj = new Vowels();
        String ans = obj.checkV_C(character.toLowerCase());

        System.out.println(ans);
    }
}
