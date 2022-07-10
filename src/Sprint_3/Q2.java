package Sprint_3;

abstract class Parent{
    public void method1() {
    }
    public void method2() {
        System.out.println("I am method2 of parent class");
    }
    abstract void method3();
}

final class Child extends Parent{
    @Override
    public void method1() {
        System.out.println("I am over ridden method1 of parent class ");
    }

    @Override
    void method3(){
        System.out.println("I am override method of parent class in child class");
    }

    public void method4() {
        System.out.println("I am method 4 of child class");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.method1();
        obj1.method2();
        obj1.method3();
        obj1.method4();
    }
}
