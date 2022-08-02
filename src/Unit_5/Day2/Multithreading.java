package Unit_5.Day2;

class tempThread extends Thread{
    public int calculate(int n){
        int ans=1;
        for(int i=1; i<=n; i++){
            ans*=i;
        }
        return ans;
    }
}

class mainThread extends Thread{
    @Override
    public void run() {
        System.out.println("This thread will print result of tempThread class");
    }

    public void result(int n){
        tempThread a = new tempThread();
        int ans = a.calculate(n);
        System.out.println(ans);
    }

}

public class Multithreading {
    public static void main(String[] args) {

        mainThread main = new mainThread();
        main.start();
        main.result(10);

    }

}
