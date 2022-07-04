package Sprint_2.Day4;

public class Q4 {
    public static void main(String[] args) {
        int product = 1;
        if(args.length == 1){
            int num1 = Integer.parseInt(args[0]);
            for(int i=1; i<=num1; i++){
               product*=i;
            }
            System.out.println("The Result is "+ product);
        }else if(args.length==2){
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int difference = Math.abs(x-y);
            System.out.println("The Result is "+ difference);
        }
        else
            System.out.println("Error");
    }
}
