package Sprint_4.Day1;

interface X{
    void meth1();
    default void meth2(){
        System.out.println("I am meth2 default");
    }
    static void meth3(){
        System.out.println("I am meth3 Static method");
    }
}
interface Y{
    void meth4();
    default void meth5(){
        System.out.println("I am meth5 default method");
    }
    static void meth6(){
        System.out.println("I am meth6 Static method");
    }

}

interface Z extends X,Y{
    void meth7();
}

class ZImpl implements Z{
    @Override
    public void meth1() {
        System.out.println("I am new meth1");
    }

    @Override
    public void meth2() {
        System.out.println("I am new meth2 default override");
    }

    @Override
    public void meth4() {
        System.out.println("I am new meth4");
    }

    @Override
    public void meth7() {
        System.out.println("I am new meth5");
    }
}


public class Q1 {
    public static void main(String[] args) {
        ZImpl obj = new ZImpl();
        obj.meth1();
        X.meth3();
    }
}
