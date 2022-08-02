package Unit_5.Sprint1_evaluation;

import java.util.Arrays;
import java.util.List;

public class Q3 {
    //      Upper Bounded Wildcards
    private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }

    //        Lower Bounded Wildcards
    public static void printOnlyIntegerClassOrSuperClass(
            List<? super Integer> list)
    {
        System.out.println(list);
    }


    public static void main(String[] args) {


//      Upper Bounded Wildcards

    /*
        1. Upper Bounded Wildcards:
           These wildcards can be used when you want to relax the restrictions on a variable. For example, say you want to write a method that works on List < Integer >, List < Double >, and List < Number >, you can do this using an upper bounded wildcard.

           To declare an upper-bounded wildcard, use the wildcard character (‘?’), followed by the extends keyword, followed by its upper bound.

           public static void add(List<? extends Number> list)
     */


        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
        System.out.println("Total sum is:" + sum(list1));
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
        System.out.print("Total sum is:" + sum(list2));




//        Lower Bounded Wildcards
        /*
            2. Lower Bounded Wildcards:
            It is expressed using the wildcard character (‘?’), followed by the super keyword, followed by its lower bound: <? super A>.

            Syntax: CollectionType <? super A>
         */

        List<Integer> list3 = Arrays.asList(4, 5, 6, 7);
        printOnlyIntegerClassOrSuperClass(list3);
        List<Number> list4 = Arrays.asList(4, 5, 6, 7);
        printOnlyIntegerClassOrSuperClass(list4);

    }
}
