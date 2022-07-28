package Sprint_1.Day3;

public class Static_NonStatic {
    static int sum(){
        return 4 + 6;
    }

    int div (){
        return 20 / 3;
    }

    public static void main(String[] args) {

        //Static method vs Non-static method
        //The Common functionality of all objects in the application must be defined as
        //static.
        //Non-static functionality belongs to a particular object.

        int c = sum();
        System.out.println(c);

        Static_NonStatic obj = new Static_NonStatic();

        int z = obj.div();

        System.out.println(z);



    }
}
