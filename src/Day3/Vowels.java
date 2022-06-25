package Day3;


import java.util.Objects;
import java.util.Scanner;
public class Vowels {

    String checkV_C(String chr){
        String print = "";
                String [] arr = {"a","b","c","d","e","f","g","i","h","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (String s : arr) {
            if (Objects.equals(chr, "a") || Objects.equals(chr, "e") || Objects.equals(chr, "i") || Objects.equals(chr, "o") || Objects.equals(chr, "u")) {
                print = ("It is Vowel");
            } else if (!Objects.equals(chr, s)) {
                print = ("error");
            } else {
                print = ("Its Consonent");
            }
        }
        return print;
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
