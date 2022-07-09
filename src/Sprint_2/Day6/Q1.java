package Sprint_2.Day6;

class Birds{
    public void fly(){
        System.out. println("Bird is flying");
    }
    public void sing(){
        System.out.println("All birds cannot sing");
    }
}

 class Parrot extends Birds{
    @Override
    public void fly(){
         System.out. println("I am flying");
     }
     @Override
     public void sing(){
         System.out.println("I am a parrot and I can Sing");
     }


 }

public class Q1 {
    public static void main(String[] args) {
        Birds b1 = new Parrot();
        b1.fly();
        b1.sing();
    }
}
