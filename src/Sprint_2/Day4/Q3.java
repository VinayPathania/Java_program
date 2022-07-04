package Sprint_2.Day4;



public class Q3 {

    public int[] findPrime(int[] a){
        int res = 0;
        for (int k : a) {
            for (int j = 1; j <= k; j++) {
                res = k;
                break;
            }
        }
        return new int[]{res};
    }

    public static void main(String[] args) {
     int [] arr = {10,12,5,50,11,14,15};



    }
}
