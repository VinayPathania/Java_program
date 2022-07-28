package Sprint_2.Day2;

class Demo{
    public Demo(){
        System.out.println("this is non  parameterized constructors");
    }
    public Demo(String s){
        System.out.println("this is  parameterized constructors with String that is: "+s);
    }
    public Demo(int i){
        System.out.println("this is  parameterized constructors with Integer that is: "+ i);
    }
    public Demo(float f){
        System.out.println("this is  parameterized constructors with float value that is: "+ f);
    }
}

public class Demo_Q2 {
    public static void main(String[] args) {
        Demo Q1 = new Demo();
        System.out.println(Q1);

        Demo Q2 = new Demo("Vinay");
        System.out.println(Q2);

        Demo Q3 = new Demo(23);
        System.out.println(Q3);

        Demo Q4 = new Demo(29.8f);
        System.out.println(Q4);
    }
}
