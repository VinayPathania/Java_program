package Unit_5.Generics;

import java.util.ArrayList;
import java.util.List;

interface PrintList {
   void display(List<String> city);
}

public class Lambda {

    public static void main(String[] args) {
        List<String> city = new ArrayList<>();
        city.add("Kangra");
        city.add("Shimla");
        city.add("Nurpur");

        PrintList p1 = (a)->{
            System.out.println(a);
        };
        p1.display(city);

    }


}
