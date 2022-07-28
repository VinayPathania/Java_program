package Sprint_2.Day4;

public class Q2 {
    static void  evenSum(int[][] a , int n, int m){
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j]%2==0){
                    sum+= a[j][i];
                }
            }
            System.out.println(sum);
            sum=0;
        }

    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = arr.length;
        int m = arr.length;
        evenSum(arr,n,m);

    }
}
