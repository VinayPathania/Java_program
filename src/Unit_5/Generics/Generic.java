package Unit_5.Generics;
class MyGeneric<T1,T2>{
    private T1 t1;

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    private T2 t2;

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public MyGeneric(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
}

public class Generic {

    public static void main(String[] args) {
        MyGeneric<String,Integer> g1 = new MyGeneric<>("Vinay",1999);
        String name = g1.getT1();
        int year = g1.getT2();
        System.out.println("Name of the person : "+name);
        System.out.println("Birth year of the person : "+year);
    }



}
